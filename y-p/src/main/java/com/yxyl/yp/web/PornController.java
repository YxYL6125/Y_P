package com.yxyl.yp.web;

import com.yxyl.yp.service.PornService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String find() {

        String res = "";
        for (int i = 1; i <= 190; i++) {
            res += pornService.findPornById(i);
        }
        return res;
    }
}
