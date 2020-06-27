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
 * 
 * </p>
 *
 * @author liangtiandong
 * @since 2020-06-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="AppConnect对象", description="")
public class AppConnect implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "本系统userId")
    private String userId;

    @ApiModelProperty(value = "第三方系统id 1：微信小程序")
    private Integer appId;

    @ApiModelProperty(value = "第三方系统昵称")
    private String nickName;

    @ApiModelProperty(value = "第三方系统头像")
    private String imageUrl;

    @ApiModelProperty(value = "第三方系统userid")
    private String bizUserId;

    @ApiModelProperty(value = "第三方系统unionid")
    private String bizUnionid;


}
