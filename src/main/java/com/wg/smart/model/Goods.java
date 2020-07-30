package com.wg.smart.model;

@Entity
@Table(name = "t_user_info")
@Data
@ApiModel
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Goods {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "主键")
    private Long id;

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

    @ApiModelProperty(value = "景区级别 1 五星 2 四星 3 三星 4 二星 5 一星 6 待定")
    private Byte scenicLevel;

    @ApiModelProperty(value = "资源id")
    private Long resourceId;

    @ApiModelProperty(value = "产品来源id 1 自行发布 2 第三方系统对接 3 平台内第三方商品采购")
    private Byte source;

    @ApiModelProperty(value = "第三方平台 1 深大智能（智游宝） 2 票付通")
    private Byte thirdParty;

    @ApiModelProperty(value = "第三方平台产品id")
    private String thirdProductId;

    @ApiModelProperty(value = "住宿类型 1 酒店 2 民宿")
    private Byte stayType;

    @ApiModelProperty(value = "酒店或住宿名称")
    private String stayName;

    @ApiModelProperty(value = "星级 1 一星 2 二星 。。7 七星 8 未评级 ")
    private Byte stayLevel;

    @ApiModelProperty(value = "分类id")
    private Long categoryId;

    @ApiModelProperty(value = "产品名称")
    private String goodsName;

    @ApiModelProperty(value = "是否套餐 1 是 2 否")
    private Byte isPackage;

    @ApiModelProperty(value = "基础售价")
    private Integer basePrice;

    @ApiModelProperty(value = "产品状态 1 发布 2 未发布")
    private Byte  goodsStatus;

    @ApiModelProperty(value = "商品编码")
    private String  goodsCode;

    @ApiModelProperty(value = "1 多人套餐 2 单人套餐")
    private Byte isSuit;

    @ApiModelProperty(value = "商品图片")
    private String img;

    @ApiModelProperty(value = "商品描述")
    private String description;

    @ApiModelProperty(value = "商品简介")
    private String synopsis;

    @ApiModelProperty(value = "供应商id")
    private Long supplierId;

    @ApiModelProperty(value = "供应商名称")
    private String supplierName;

    @ApiModelProperty(value = "运营开放时间-开始 08:00")
    private String operationStartDate;

    @ApiModelProperty(value = "运营开放时间-结束 18:00")
    private String operationEndDate;

    @ApiModelProperty(value = "运营状态:1上线 2下线")
    private Byte operationStatus;

    @ApiModelProperty(value = "运营联系人，多个用逗号隔开")
    private String operationUser;

    @ApiModelProperty(value = "运营联系电话，多个用逗号隔开--与联系人对应")
    private String operationUserPhone;

    @ApiModelProperty(value = "客服电话")
    private String serviceTelephone;

    @ApiModelProperty(value = "是否开启运营细化 1 否  2 是")
    private Byte operationRefine;

    @ApiModelProperty(value = "住宿类-是否需要二次确认 1 否  2 是")
    private Byte secondSubmit;

    @ApiModelProperty(value = "住宿类-二次确认小时")
    private Integer secondSubmitHour;

    @ApiModelProperty(value = "住宿类-二次确认分钟")
    private Integer secondSubmitMinute;

    @ApiModelProperty(value = "运营模式：1 平台运营 2 供应商运营")
    private Byte operationMode;
}
