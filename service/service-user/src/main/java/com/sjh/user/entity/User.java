package com.sjh.user.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @program:
 * @description:
 * @author: Shen jihao
 * @create: 2021/5/31 14:31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    private String username;

    private String password;

    private String nickName;

    private Boolean isDeleted;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private String createUser;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    private String updateUser;
}
