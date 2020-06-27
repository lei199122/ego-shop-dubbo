package com.lxw.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品评论
 * </p>
 *
 * @author liangtiandong
 * @since 2020-06-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ProdComm-compare-test对象", description="商品评论")
public class ProdComm-compare-test implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "商品ID")
    private Long prodId;

    @ApiModelProperty(value = "订单项ID")
    private Long orderItemId;

    @ApiModelProperty(value = "评论用户ID")
    private String userId;

    @ApiModelProperty(value = "评论内容")
    private String content;

    @ApiModelProperty(value = "掌柜回复")
    private String replyContent;

    @ApiModelProperty(value = "记录时间")
    private LocalDateTime recTime;

    @ApiModelProperty(value = "回复时间")
    private LocalDateTime replyTime;

    @ApiModelProperty(value = "是否回复 0:未回复  1:已回复")
    private Integer replySts;

    @ApiModelProperty(value = "IP来源")
    private String postip;

    @ApiModelProperty(value = "得分，0-5分")
    private Integer score;

    @ApiModelProperty(value = "有用的计数")
    private Integer usefulCounts;

    @ApiModelProperty(value = "晒图的json字符串")
    private String pics;

    @ApiModelProperty(value = "是否匿名(1:是  0:否)")
    private Integer isAnonymous;

    @ApiModelProperty(value = "是否显示，1:为显示，0:待审核， -1：不通过审核，不显示。 如果需要审核评论，则是0,，否则1")
    private Integer status;

    @ApiModelProperty(value = "评价(0好评 1中评 2差评)")
    private Integer evaluate;


}
