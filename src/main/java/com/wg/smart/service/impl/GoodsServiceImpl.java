package com.wg.smart.service.impl;

import com.google.common.collect.Lists;
import com.wg.smart.entity.param.GoodsParam;
import com.wg.smart.mapper.GoodsMapper;
import com.wg.smart.model.GoodsSearch;
import com.wg.smart.repository.GoodsRepository;
import com.wg.smart.model.Goods;
import com.wg.smart.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        List<GoodsSearch> goodsSearches = Lists.newArrayList();
        goodsListTemp.forEach(goods -> {
            GoodsSearch goodsSearch = new GoodsSearch();
            BeanUtils.copyProperties(goods,goodsSearch);
            goodsSearches.add(goodsSearch);
        });
        List<GoodsSearch> goodsSearchList = (List<GoodsSearch>) goodsRepository.saveAll(goodsSearches);
        return CollectionUtils.isNotEmpty(goodsSearchList);
    }

    @Override
    public Boolean updateGoods(GoodsParam goodsParam) {
        GoodsSearch goods = new GoodsSearch();
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
    public List<GoodsSearch> getGoodsList(String name) {
        List<GoodsSearch> goodsListTemp1 = goodsRepository.findByGoodsNameLike(name);
        log.info("goodsListTemp1 is {}",goodsListTemp1);
        List<GoodsSearch> goodsListTemp2 = goodsRepository.findByGoodsName(name);
        log.info("goodsListTemp2 is {}",goodsListTemp2);
        return goodsListTemp1;
    }

    @Override
    public GoodsSearch getGoodsById(Long id) {
        return goodsRepository.findById(id).get();
    }

    @Override
    public List<GoodsSearch> topSearchTitle(String keyword) {
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(queryStringQuery(keyword))
                .build();
        List<GoodsSearch> goodsList = elasticsearchTemplate.queryForList(searchQuery, GoodsSearch.class);
        log.info("goodsList is {}",goodsList);
        return goodsList;
    }
}
