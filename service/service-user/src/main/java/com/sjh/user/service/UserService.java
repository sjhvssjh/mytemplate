package com.sjh.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sjh.common.ReturnResult;
import com.sjh.user.entity.User;

/**
 * @program:
 * @description:
 * @author: Shen jihao
 * @create: 2021/5/31 13:53
 */
public interface UserService extends IService<User> {

    ReturnResult getAllUser();

    ReturnResult addUser(User user);
}
