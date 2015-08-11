package com.tong.springtest01.controller;

import com.tong.springtest01.resp.RestResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tong on 8/11/15.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest req,HttpServletResponse res) {
        RestResponse restR = new RestResponse();
        Map<String,Object> data = new HashMap<String, Object>();
        restR.setData(data);

        data.put("code","100");
        data.put("message","哈哈message");
        return new ModelAndView("index","restR",restR);
    }
}
