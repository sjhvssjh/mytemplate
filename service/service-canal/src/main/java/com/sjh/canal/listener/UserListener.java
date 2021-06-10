package com.sjh.canal.listener;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.xpand.starter.canal.annotation.CanalEventListener;
import com.xpand.starter.canal.annotation.InsertListenPoint;
import com.xpand.starter.canal.annotation.UpdateListenPoint;

/**
 * @program:
 * @description:
 * @author: Shen jihao
 * @create: 2021/6/10 13:35
 */
@CanalEventListener
public class UserListener {

    @InsertListenPoint
    public void addListener(CanalEntry.EventType eventType, CanalEntry.RowData rowData){
        System.out.println("==============>:"+eventType);
        for (CanalEntry.Column column : rowData.getAfterColumnsList()) {
            System.out.println("=======>:"+column.getName()+",=======>:"+column.getValue());
        }
    }

    @UpdateListenPoint
    public void updateListener(CanalEntry.EventType eventType, CanalEntry.RowData rowData){
        System.out.println("==============>:"+eventType);
        for (CanalEntry.Column column : rowData.getBeforeColumnsList()) {
            System.out.println("=======>:"+column.getName()+",=======>:"+column.getValue());
        }
        for (CanalEntry.Column column : rowData.getAfterColumnsList()) {
            System.out.println("=======>:"+column.getName()+",=======>:"+column.getValue());
        }
    }
}
