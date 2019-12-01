package com.systop.pss.mapper;

import com.systop.pss.model.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String uuId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String uuId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}