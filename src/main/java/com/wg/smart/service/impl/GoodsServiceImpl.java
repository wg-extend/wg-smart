package com.wg.smart.service.impl;

import com.wg.smart.entity.param.GoodsParam;
import com.wg.smart.mapper.GoodsMapper;
import com.wg.smart.mapper.GoodsRepository;
import com.wg.smart.model.Goods;
import com.wg.smart.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.elasticsearch.index.query.QueryBuilders.queryStringQuery;

/**
 * @author wangliheng
 * @date 2020/7/30 5:26 下午
 */
@Service
@Slf4j
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Boolean addGoods(List<Goods> goodsList) {
        //将mysql goods表中的数据添加到 elasticSearch
        List<Goods> goodsListTemp = goodsMapper.findAll();
        goodsListTemp = (List<Goods>) goodsRepository.saveAll(goodsListTemp);
        return CollectionUtils.isNotEmpty(goodsListTemp);
    }

    @Override
    public Boolean updateGoods(GoodsParam goodsParam) {
        Goods goods = new Goods();
        BeanUtils.copyProperties(goodsParam,goods);
        goodsRepository.save(goods);
        return true;
    }

    @Override
    public Boolean deleteGoods(Long id) {
        goodsRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Goods> getGoodsList(String name) {
        List<Goods> goodsListTemp1 = goodsRepository.findByName(name);
        log.info("goodsListTemp1 is {}",goodsListTemp1);
        List<Goods> goodsListTemp2 = goodsRepository.findByNameCustom(name);
        log.info("goodsListTemp2 is {}",goodsListTemp2);
        return goodsListTemp2;
    }

    @Override
    public Goods getGoodsById(Long id) {
        return goodsRepository.findById(id).get();
    }

    @Override
    public List<Goods> topSearchTitle(String keyword) {
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(queryStringQuery(keyword))
                .build();
        List<Goods> goodsList = elasticsearchTemplate.queryForList(searchQuery, Goods.class);
        log.info("goodsList is {}",goodsList);
        return goodsList;
    }
}
