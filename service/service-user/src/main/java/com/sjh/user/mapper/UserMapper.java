package com.sjh.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sjh.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @program:
 * @description:
 * @author: Shen jihao
 * @create: 2021/5/31 14:32
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
}
