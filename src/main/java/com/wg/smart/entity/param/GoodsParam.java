package com.wg.smart.entity.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @author wangliheng
 * @date 2020/7/31 2:03 下午
 */
@Data
@ApiModel("产品")
public class GoodsParam {

    @ApiModelProperty(value = "项目id-对应分类id")
    private Long projectId;

    @ApiModelProperty(value = "项目名称-对应分类名称")
    private String projectName;

    @ApiModelProperty(value = "POI")
    private Long poiId;

    @ApiModelProperty(value = "POI名称")
    private String poiName;

    @ApiModelProperty(value = "所属景区id")
    private Long scenicId;

    @ApiModelProperty(value = "所属景区名称")
    private String scenicName;
}
