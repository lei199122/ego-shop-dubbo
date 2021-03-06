package com.lxw.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户配送地址
 * </p>
 *
 * @author liangtiandong
 * @since 2020-06-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PickAddr对象", description="用户配送地址")
public class PickAddr implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "addr_id", type = IdType.AUTO)
    private Long addrId;

    @ApiModelProperty(value = "自提点名称")
    private String addrName;

    @ApiModelProperty(value = "地址")
    private String addr;

    @ApiModelProperty(value = "手机")
    private String mobile;

    @ApiModelProperty(value = "省份ID")
    private Long provinceId;

    @ApiModelProperty(value = "省份")
    private String province;

    @ApiModelProperty(value = "城市ID")
    private Long cityId;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "区/县ID")
    private Long areaId;

    @ApiModelProperty(value = "区/县")
    private String area;

    @ApiModelProperty(value = "店铺id")
    private Long shopId;


}
