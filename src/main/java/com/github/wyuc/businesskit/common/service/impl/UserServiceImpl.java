package com.github.wyuc.businesskit.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.wyuc.businesskit.common.entity.User;
import com.github.wyuc.businesskit.common.service.UserService;
import com.github.wyuc.businesskit.common.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author wyuc
* @description 针对表【t_user(用户)】的数据库操作Service实现
* @createDate 2022-05-01 15:33:39
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




