package com.yxyl.yp.service.impl;

import com.yxyl.yp.mapper.PornMapper;
import com.yxyl.yp.service.PornService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: y-p
 * @description:
 * @author: YxYL
 * @create: 2022-04-17 10:06
 **/

@Service
public class PornServiceImpl implements PornService {

    @Autowired
    private PornMapper pornMapper;

    @Override
    public String findPornById(int id) {
        return pornMapper.findByPornId(id);
    }
}
