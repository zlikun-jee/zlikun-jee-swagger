package com.zlikun.jee.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zlikun
 * @date 2018-10-12 19:23
 */
@Api("订单API")
@RestController
public class OrderController {

    /**
     * 分页查询订单列表
     *
     * @param userId
     * @param page
     * @return
     */
    @ApiOperation(value = "分页查询用户订单列表", notes = "略")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户ID", required = true, dataType = "Long", paramType = "path"),
            @ApiImplicitParam(name = "page", value = "页码，从1开始计", required = true, dataType = "Integer", paramType = "query")
    })
    @GetMapping("/orders/{userId}")
    public Object orders(@PathVariable("userId") long userId, int page) {
        return null;
    }

}
