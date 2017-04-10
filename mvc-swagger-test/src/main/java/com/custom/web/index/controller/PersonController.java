package com.custom.web.index.controller;

import com.custom.web.index.entity.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/4/8.
 */
@Controller
@RequestMapping("/person")
@Api(tags="个人业务")
public class PersonController {

    @RequestMapping(value="/getPerson",method= RequestMethod.GET)
    @ApiOperation(httpMethod = "GET", value = "个人信息", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Person getPersons() {
        Person person = new Person();
        person.setFirstName("fname");
        person.setLastName("lname");
        person.setAge(37);
        person.setDeptName("dept");
        return person;
    }
}
