package com.wg.smart.mapper;

import com.wg.smart.model.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wangliheng
 * @date 2020/7/30 5:26 下午
 */
public interface GoodsMapper extends JpaRepository<Goods,Long>{
}
