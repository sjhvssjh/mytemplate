package com.sjh.canal.listener;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.xpand.starter.canal.annotation.CanalEventListener;
import com.xpand.starter.canal.annotation.ListenPoint;

/**
 * @program:
 * @description:
 * @author: Shen jihao
 * @create: 2021/6/10 13:35
 */
@CanalEventListener
public class UserListener {

    /**
     * 自定义监控binlog
     * @param eventType
     * @param rowData
     */
    @ListenPoint(eventType = {CanalEntry.EventType.UPDATE}, schema = {"yilu_mall"}, table = {"t_user"}, destination = "example")
    public void myListener(CanalEntry.EventType eventType, CanalEntry.RowData rowData){
        System.out.println(rowData.getBeforeColumnsList().get(3).getValue()+"==============>"+rowData.getAfterColumnsList().get(3).getValue());
    }

}
