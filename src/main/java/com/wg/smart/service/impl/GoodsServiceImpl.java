package com.wg.smart.service.impl;

import com.wg.smart.entity.param.GoodsParam;
import com.wg.smart.model.Goods;
import com.wg.smart.service.GoodsService;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangliheng
 * @date 2020/8/5 10:10 上午
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private RestHighLevelClient restHighLevelClient;


    @Override
    public Boolean addGoods(List<Goods> goodsList) {
        return null;
    }

    @Override
    public Boolean updateGoods(GoodsParam goods) {
        return null;
    }

    @Override
    public Boolean deleteGoods(Long id) {
        return null;
    }

    @Override
    public List<Goods> getGoodsList(String name) {
        return null;
    }

    @Override
    public Goods getGoodsById(Long id) {
        return null;
    }

    @Override
    public List<Goods> topSearchTitle(String keyword) {
        return null;
    }
}
