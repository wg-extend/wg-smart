package com.wg.smart.controller;

import com.wg.smart.model.Goods;
import com.wg.smart.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangliheng
 * @date 2020/7/30 5:27 下午
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    private GoodsService goodsService;

    @ApiOperation(value = "套餐产品预定-酒店日历", notes = "套餐产品预定-酒店日历")
    @GetMapping(value = "/list")
    public List<Goods> getPackageCalendarApp() {
        return null;
    }
}
