package com.custom.web.index.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2017/4/8.
 */
@ApiModel(value="个人信息")
public class Person {

    @ApiModelProperty(value="第一名称")
    private String firstName;

    @ApiModelProperty(value="最终名称")
    private String lastName;

    @ApiModelProperty(value="年龄")
    private Integer age;

    @ApiModelProperty(value="部门")
    private String deptName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
