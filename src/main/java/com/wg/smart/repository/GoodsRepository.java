package com.wg.smart.repository;

import com.wg.smart.model.GoodsSearch;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author wangliheng
 * @date 2020/7/31 11:24 上午
 */
public interface GoodsRepository extends ElasticsearchRepository<GoodsSearch,Long> {

    List<GoodsSearch> findByGoodsNameLike(String keyword);

    @Query("{\"match_phrase\":{\"goodsName\":\"?0\"}}")
    List<GoodsSearch> findByGoodsName(String keyword);
}
