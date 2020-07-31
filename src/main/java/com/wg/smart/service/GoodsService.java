package com.wg.smart.service;

import com.wg.smart.entity.param.GoodsParam;
import com.wg.smart.model.Goods;

import java.util.List;

/**
 * @author wangliheng
 * @date 2020/7/30 5:26 下午
 */
public interface GoodsService {

    Boolean addGoods(List<Goods> goodsList);

    Boolean updateGoods(GoodsParam goods);

    Boolean deleteGoods(Long id);

    List<Goods> getGoodsList(String name);

    Goods getGoodsById(Long id);

    List<Goods> topSearchTitle(String keyword);
}
