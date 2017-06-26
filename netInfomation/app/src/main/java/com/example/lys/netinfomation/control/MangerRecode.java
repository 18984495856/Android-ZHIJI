package com.example.lys.netinfomation.control;

import java.util.ArrayList;

/**
 * Created by Lys on 2017/5/5.
 */

public class MangerRecode {
    private static ArrayList<String> RecordList;
    /**
     * 添加一个日志信息到日志队列中，使用synchronized关键字来锁住类（是类不是对象）保证多线程安全性
     * @param RecordInfo 日志信息
     */
    synchronized static void addRecordInfo(String RecordInfo){
        RecordList.add(RecordInfo);
    }

    /**
     * 返回最近的一个日志信息，使用synchronized关键字来锁住类（是类不是对象）保证多线程安全性
     * @return 返回的日志信息
     */
    synchronized static String getRecordInfo(){
        return RecordList.get(RecordList.size()-1);
    };
}
