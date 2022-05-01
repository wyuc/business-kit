package com.github.wyuc.businesskit.common.mapper;

import com.github.wyuc.businesskit.common.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author wyuc
* @description 针对表【t_user(用户)】的数据库操作Mapper
* @createDate 2022-05-01 15:33:39
* @Entity com.github.wyuc.businesskit.common.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




