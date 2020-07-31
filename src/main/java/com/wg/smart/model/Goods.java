package com.wg.smart.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;

@Entity
@Table(name = "t_goods")
@Data
@ApiModel
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@Document(indexName = "goods", type = "goods")
public class Goods {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "主键")
    private Long id;

    @Column
    @ApiModelProperty(value = "项目id-对应分类id")
    private Long projectId;

    @Column
    @ApiModelProperty(value = "项目名称-对应分类名称")
    private String projectName;

    @Column
    @ApiModelProperty(value = "POI")
    private Long poiId;

    @Column
    @ApiModelProperty(value = "POI名称")
    private String poiName;

    @Column
    @ApiModelProperty(value = "所属景区id")
    private Long scenicId;

    @Column
    @ApiModelProperty(value = "所属景区名称")
    private String scenicName;

    @Column
    @ApiModelProperty(value = "景区级别 1 五星 2 四星 3 三星 4 二星 5 一星 6 待定")
    private Byte scenicLevel;

    @Column
    @ApiModelProperty(value = "资源id")
    private Long resourceId;

    @Column
    @ApiModelProperty(value = "产品来源id 1 自行发布 2 第三方系统对接 3 平台内第三方商品采购")
    private Byte source;

    @Column
    @ApiModelProperty(value = "第三方平台 1 深大智能（智游宝） 2 票付通")
    private Byte thirdParty;

    @Column
    @ApiModelProperty(value = "第三方平台产品id")
    private String thirdProductId;

    @Column
    @ApiModelProperty(value = "住宿类型 1 酒店 2 民宿")
    private Byte stayType;

    @Column
    @ApiModelProperty(value = "酒店或住宿名称")
    private String stayName;

    @Column
    @ApiModelProperty(value = "星级 1 一星 2 二星 。。7 七星 8 未评级 ")
    private Byte stayLevel;

    @Column
    @ApiModelProperty(value = "分类id")
    private Long categoryId;

    @Column
    @ApiModelProperty(value = "产品名称")
    private String goodsName;

    @Column
    @ApiModelProperty(value = "是否套餐 1 是 2 否")
    private Byte isPackage;

    @Column
    @ApiModelProperty(value = "基础售价")
    private Integer basePrice;

    @Column
    @ApiModelProperty(value = "产品状态 1 发布 2 未发布")
    private Byte  goodsStatus;

    @Column
    @ApiModelProperty(value = "商品编码")
    private String  goodsCode;

    @Column
    @ApiModelProperty(value = "1 多人套餐 2 单人套餐")
    private Byte isSuit;

    @Column
    @ApiModelProperty(value = "商品图片")
    private String img;

    @Column
    @ApiModelProperty(value = "商品描述")
    private String description;

    @Column
    @ApiModelProperty(value = "商品简介")
    private String synopsis;

    @Column
    @ApiModelProperty(value = "供应商id")
    private Long supplierId;

    @Column
    @ApiModelProperty(value = "供应商名称")
    private String supplierName;

    @Column
    @ApiModelProperty(value = "运营开放时间-开始 08:00")
    private String operationStartDate;

    @Column
    @ApiModelProperty(value = "运营开放时间-结束 18:00")
    private String operationEndDate;

    @Column
    @ApiModelProperty(value = "运营状态:1上线 2下线")
    private Byte operationStatus;

    @Column
    @ApiModelProperty(value = "运营联系人，多个用逗号隔开")
    private String operationUser;

    @Column
    @ApiModelProperty(value = "运营联系电话，多个用逗号隔开--与联系人对应")
    private String operationUserPhone;

    @Column
    @ApiModelProperty(value = "客服电话")
    private String serviceTelephone;

}
