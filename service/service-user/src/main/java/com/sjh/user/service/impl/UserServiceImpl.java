package com.sjh.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sjh.common.ReturnResult;
import com.sjh.user.entity.User;
import com.sjh.user.mapper.UserMapper;
import com.sjh.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:
 * @description:
 * @author: Shen jihao
 * @create: 2021/5/31 14:28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public ReturnResult getAllUser() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        List<User> users = baseMapper.selectList(wrapper);
        return ReturnResult.ok().data("list", users);
    }

    @Override
    public ReturnResult addUser(User user) {
        int insert = baseMapper.insert(user);
        if (insert > 0){
            return ReturnResult.ok();
        }else {
            return ReturnResult.error();
        }
    }
}
