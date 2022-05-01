package com.github.wyuc.businesskit.user.service;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.DesensitizedUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.wyuc.businesskit.common.CommonResponse;
import com.github.wyuc.businesskit.common.entity.User;
import com.github.wyuc.businesskit.common.service.impl.UserServiceImpl;
import com.github.wyuc.businesskit.user.service.query.UserDeleteQuery;
import com.github.wyuc.businesskit.user.service.query.UserQuery;
import com.github.wyuc.businesskit.user.service.query.UserUpdateQuery;
import com.github.wyuc.businesskit.user.service.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserApiService {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/get")
    public CommonResponse<UserVO> get(String userId) {
        return CommonResponse.success("", userToVo(userService.getById(userId)));
    }

    @GetMapping("/list")
    public CommonResponse<IPage<UserVO>> list() {
        return CommonResponse.success(
                "",
                userService.page(new Page<>()).convert(this::userToVo)
        );
    }

    @PostMapping("save")
    public CommonResponse<String> save(@RequestBody UserQuery userQuery) {
        userService.save(BeanUtil.copyProperties(userQuery, User.class));
        return CommonResponse.success("", "");
    }

    @PutMapping("/update")
    public CommonResponse<String> update(@RequestBody UserUpdateQuery userUpdateQuery) {
        userService.updateById(BeanUtil.copyProperties(userUpdateQuery, User.class));
        return CommonResponse.success("", "");
    }

    @DeleteMapping("/delete")
    public CommonResponse<String> delete(@RequestBody UserDeleteQuery userDeleteQuery) {
        userService.removeById(userDeleteQuery.getUserId());
        return CommonResponse.success("", "");
    }

    private UserVO userToVo(User user) {
        UserVO userVO = BeanUtil.copyProperties(user, UserVO.class);
        userVO.setUserName(DesensitizedUtil.chineseName(user.getUserName()));
        return userVO;
    }
}
