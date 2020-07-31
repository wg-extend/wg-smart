package com.wg.smart.service;

import com.wg.smart.entity.param.GoodsParam;
import com.wg.smart.model.Goods;
import com.wg.smart.model.GoodsSearch;

import java.util.List;

/**
 * @author wangliheng
 * @date 2020/7/30 5:26 下午
 */
public interface GoodsService {

    Boolean addGoods(List<Goods> goodsList);

    Boolean updateGoods(GoodsParam goods);

    Boolean deleteGoods(Long id);

    List<GoodsSearch> getGoodsList(String name);

    GoodsSearch getGoodsById(Long id);

    List<GoodsSearch> topSearchTitle(String keyword);
}
