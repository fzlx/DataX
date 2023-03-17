package com.alibaba.datax.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataXResult {
    public DataXResult() {
        super();
    }


    //任务启动时刻
    private long startTimeStamp;
    //任务结束时刻
    private long endTimeStamp;
    //任务总时耗
    private long totalCosts;
    //任务平均流量
    private long byteSpeedPerSecond;
    //记录写入速度
    private long recordSpeedPerSecond;
    //读出记录总数
    private long totalReadRecords;
    //读写失败总数
    private long readSucceedRecords;
    //成功记录总数
    private long readFailedRecords;
    // 失败记录总数
    private long writeSucceedRecords;
    // 过滤记录总数
    private long writeFailedRecords;
    //字节数
    private long readSucceedBytes;

    public DataXResult(long startTimeStamp, long endTimeStamp, long totalCosts, long byteSpeedPerSecond, long recordSpeedPerSecond, long totalReadRecords, long readSucceedRecords, long readFailedRecords, long writeSucceedRecords, long writeFailedRecords, long readSucceedBytes, long writeSucceedBytes, long endTransferTimeStamp, long startTransferTimeStamp, long transferCosts) {
        this.startTimeStamp = startTimeStamp;
        this.endTimeStamp = endTimeStamp;
        this.totalCosts = totalCosts;
        this.byteSpeedPerSecond = byteSpeedPerSecond;
        this.recordSpeedPerSecond = recordSpeedPerSecond;
        this.totalReadRecords = totalReadRecords;
        this.readSucceedRecords = readSucceedRecords;
        this.readFailedRecords = readFailedRecords;
        this.writeSucceedRecords = writeSucceedRecords;
        this.writeFailedRecords = writeFailedRecords;
        this.readSucceedBytes = readSucceedBytes;
        this.writeSucceedBytes = writeSucceedBytes;
        this.endTransferTimeStamp = endTransferTimeStamp;
        this.startTransferTimeStamp = startTransferTimeStamp;
        this.transferCosts = transferCosts;
    }

    public long getWriteSucceedBytes() {
        return writeSucceedBytes;
    }

    public void setWriteSucceedBytes(long writeSucceedBytes) {
        this.writeSucceedBytes = writeSucceedBytes;
    }

    //转换开始时间
    private long writeSucceedBytes;

    private long endTransferTimeStamp;
    //转换结束时间
    private long startTransferTimeStamp;
    //转换总耗时
    private long transferCosts;

    public long getStartTimeStamp() {
        return startTimeStamp;
    }

    public void setStartTimeStamp(long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    public long getEndTimeStamp() {
        return endTimeStamp;
    }

    public void setEndTimeStamp(long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    public long getTotalCosts() {
        return totalCosts;
    }

    public void setTotalCosts(long totalCosts) {
        this.totalCosts = totalCosts;
    }

    public long getByteSpeedPerSecond() {
        return byteSpeedPerSecond;
    }

    public void setByteSpeedPerSecond(long byteSpeedPerSecond) {
        this.byteSpeedPerSecond = byteSpeedPerSecond;
    }

    public long getRecordSpeedPerSecond() {
        return recordSpeedPerSecond;
    }

    public void setRecordSpeedPerSecond(long recordSpeedPerSecond) {
        this.recordSpeedPerSecond = recordSpeedPerSecond;
    }

    public long getTotalReadRecords() {
        return totalReadRecords;
    }

    public void setTotalReadRecords(long totalReadRecords) {
        this.totalReadRecords = totalReadRecords;
    }

    public long getReadSucceedRecords() {
        return readSucceedRecords;
    }

    public void setReadSucceedRecords(long readSucceedRecords) {
        this.readSucceedRecords = readSucceedRecords;
    }

    public long getReadFailedRecords() {
        return readFailedRecords;
    }

    public void setReadFailedRecords(long readFailedRecords) {
        this.readFailedRecords = readFailedRecords;
    }

    public long getWriteSucceedRecords() {
        return writeSucceedRecords;
    }

    public void setWriteSucceedRecords(long writeSucceedRecords) {
        this.writeSucceedRecords = writeSucceedRecords;
    }

    public long getWriteFailedRecords() {
        return writeFailedRecords;
    }

    public void setWriteFailedRecords(long writeFailedRecords) {
        this.writeFailedRecords = writeFailedRecords;
    }

    public long getReadSucceedBytes() {
        return readSucceedBytes;
    }

    public void setReadSucceedBytes(long readSucceedBytes) {
        this.readSucceedBytes = readSucceedBytes;
    }

    public long getEndTransferTimeStamp() {
        return endTransferTimeStamp;
    }

    public void setEndTransferTimeStamp(long endTransferTimeStamp) {
        this.endTransferTimeStamp = endTransferTimeStamp;
    }

    public long getStartTransferTimeStamp() {
        return startTransferTimeStamp;
    }

    public void setStartTransferTimeStamp(long startTransferTimeStamp) {
        this.startTransferTimeStamp = startTransferTimeStamp;
    }

    public long getTransferCosts() {
        return transferCosts;
    }

    public void setTransferCosts(long transferCosts) {
        this.transferCosts = transferCosts;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "DataXResult{" +
                "   任务开始时间: " + format.format(new Date(startTimeStamp)) +
                ",  任务结束时间: " + format.format(new Date(endTimeStamp)) +
                ",  任务总耗时(秒): " + totalCosts +
                ",  每秒速率(字节/s): " + byteSpeedPerSecond +
                ",  每秒速率: " + recordSpeedPerSecond +
                ",  读取总记录数: " + totalReadRecords +
                ",  读取成功记录数: " + readSucceedRecords +
                ",  读取失败记录数: " + readFailedRecords +
                ",  写成功记录数: " + writeSucceedRecords +
                ",  写失败记录数: " + writeFailedRecords +
                ",  读成功字节数(MB): " + readSucceedBytes / 1024 / 1024+
                ",  写成功字节数(MB): " + writeSucceedBytes / 1024 /1024 +
                ",  开始转换时间: " + format.format(startTransferTimeStamp) +
                ",  结束转换时间: " + format.format(endTransferTimeStamp) +
                ",  转换耗时: " + transferCosts +
                '}';
    }
}
