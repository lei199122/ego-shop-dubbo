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
 * 
 * </p>
 *
 * @author liangtiandong
 * @since 2020-06-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="AttachFile对象", description="")
public class AttachFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "file_id", type = IdType.AUTO)
    private Long fileId;

    @ApiModelProperty(value = "文件路径")
    private String filePath;

    @ApiModelProperty(value = "文件类型")
    private String fileType;

    @ApiModelProperty(value = "文件大小")
    private Integer fileSize;

    @ApiModelProperty(value = "上传时间")
    private LocalDateTime uploadTime;

    @ApiModelProperty(value = "文件关联的表主键id")
    private Long fileJoinId;

    @ApiModelProperty(value = "文件关联表类型：1 商品表  FileJoinType")
    private Integer fileJoinType;


}
