package com.wg.smart.mapper;

import com.wg.smart.model.Goods;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author wangliheng
 * @date 2020/7/31 11:24 上午
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {

    List<Goods> findByName(String keyword);

    @Query("{\"match_phrase\":{\"name\":\"?0\"}}")
    List<Goods> findByNameCustom(String keyword);
}
