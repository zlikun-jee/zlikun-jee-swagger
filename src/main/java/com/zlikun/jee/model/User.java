package com.zlikun.jee.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@ApiModel(description = "用户实体")
//@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-14T10:19:36.648Z")
public class User {

    @ApiModelProperty
    private Long id;

    @ApiModelProperty
    private String username;

    @ApiModelProperty
    private String nickname;

    @ApiModelProperty
    private String phone;

    @ApiModelProperty
    private String email;

    @ApiModelProperty
    private String password;

    @ApiModelProperty(value = "用户状态：0未启用、1已启用、2已禁用、3已删除")
    private Integer status;

}

