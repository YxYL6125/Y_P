package com.yxyl.yp.web;

import com.yxyl.yp.model.Porn;
import com.yxyl.yp.service.PornService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: y-p
 * @description:
 * @author: YxYL
 * @create: 2022-04-17 10:03
 **/

@RestController
public class PornController {

    @Autowired
    private PornService pornService;

    @RequestMapping("/find")
    public ModelAndView find() {
        ModelAndView mav = new ModelAndView();

        List<Porn> res =new ArrayList<>();
        for (int i = 1; i <= 190; i++) {
            res.add(pornService.findPornById(i));
        }

        mav.addObject("porns",res);
        mav.setViewName("index");

        return mav;
    }
}
