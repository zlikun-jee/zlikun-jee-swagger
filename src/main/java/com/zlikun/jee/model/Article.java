package com.zlikun.jee.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.Date;


@Data
@Validated
@ApiModel(description = "文章实体")
//@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-14T10:19:36.648Z")
public class Article {

    // position 表示显示顺序（否则会显示的比较乱，字段名自然排序）
    // 实际上没有特殊指定，该注解可以省略不写
    // @ApiModelProperty(position = 1)
    private Long id;

    @ApiModelProperty(position = 2, required = true, value = "文章标题", example = "API契约测试实践")
    private String title;

    // 如果不希望字段显示在文档中，应将其hidden属性设置为：true，默认：false
    // @ApiModelProperty(position = 3, hidden = true)
    @ApiModelProperty(position = 3, value = "文章摘要信息")
    private String summary;

    @ApiModelProperty(position = 4, required = true, value = "文章正文，需要过滤不安全HTML标签")
    private String content;

    @ApiModelProperty(position = 5, value = "文章创建时间，默认使用调用创建API时间")
    private Date createTime;

}

