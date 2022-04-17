package com.yxyl.yp.mapper;

import com.yxyl.yp.model.Porn;

public interface PornMapper {
    int deleteByPrimaryKey(Integer pornId);

    int insert(Porn record);

    int insertSelective(Porn record);

    Porn selectByPrimaryKey(Integer pornId);

    int updateByPrimaryKeySelective(Porn record);

    int updateByPrimaryKey(Porn record);
}