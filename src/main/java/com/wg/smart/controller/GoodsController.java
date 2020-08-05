package com.wg.smart.controller;

import com.wg.smart.entity.param.GoodsParam;
import com.wg.smart.model.Goods;
import com.wg.smart.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangliheng
 * @date 2020/7/30 5:27 下午
 */
@RestController
@RequestMapping("/goods")
@Slf4j
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @ApiOperation(value = "添加产品", notes = "添加产品")
    @PostMapping(value = "/add")
    public Boolean addGoods() {
        return goodsService.addGoods(null);
    }

    @ApiOperation(value = "更新产品", notes = "更新产品")
    @PostMapping(value = "/update")
    public Boolean updateGoods(@RequestBody GoodsParam goodsParam) {
        return goodsService.updateGoods(goodsParam);
    }

    @ApiOperation(value = "删除产品", notes = "删除产品")
    @PostMapping(value = "/delete")
    public Boolean deleteGoods(@RequestParam Long id) {
        return goodsService.deleteGoods(id);
    }

    @ApiOperation(value = "产品列表-name", notes = "产品列表-name")
    @GetMapping(value = "/list/name")
    public List<Goods> getGoodsList(@RequestParam String name) {
        return goodsService.getGoodsList(name);
    }

    @ApiOperation(value = "产品详情", notes = "产品详情")
    @GetMapping(value = "/detail")
    public Goods getGoods(@RequestParam Long id) {
        return goodsService.getGoodsById(id);
    }

    @ApiOperation(value = "产品列表-key", notes = "产品列表-key")
    @GetMapping(value = "/list/key")
    public List<Goods> topSearchTitle(@RequestParam String keyword) {
        return goodsService.topSearchTitle(keyword);
    }
}
