CREATE TABLE `t_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(30) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(30) NOT NULL DEFAULT '' COMMENT '密码',
  `nick_name` varchar(30) NOT NULL DEFAULT '' COMMENT '昵称',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '1' COMMENT '删除标志',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `create_user` varchar(30) NOT NULL DEFAULT '' COMMENT '创建者',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `update_user` varchar(30) NOT NULL DEFAULT '' COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';