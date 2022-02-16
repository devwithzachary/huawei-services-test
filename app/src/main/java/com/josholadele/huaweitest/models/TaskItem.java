/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2020. All rights reserved.
 * Generated by the CloudDB ObjectType compiler.  DO NOT EDIT!
 */
package com.josholadele.huaweitest.models;

import com.huawei.agconnect.cloud.database.CloudDBZoneObject;
import com.huawei.agconnect.cloud.database.Text;
import com.huawei.agconnect.cloud.database.annotations.DefaultValue;
import com.huawei.agconnect.cloud.database.annotations.EntireEncrypted;
import com.huawei.agconnect.cloud.database.annotations.NotNull;
import com.huawei.agconnect.cloud.database.annotations.Indexes;
import com.huawei.agconnect.cloud.database.annotations.PrimaryKeys;

import java.util.Date;

/**
 * Definition of ObjectType TaskItem.
 *
 * @since 2022-01-21
 */
@PrimaryKeys({"id"})
@Indexes({"task:task"})
public final class TaskItem extends CloudDBZoneObject {
    private Integer id;

    private String task;

    private String author;

    private Date taskDate;

    public TaskItem() {
        super(TaskItem.class);
    }

    public TaskItem(String task, String author, Date taskDate) {
        super(TaskItem.class);
        this.task = task;
        this.author = author;
        this.taskDate = taskDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    public Date getTaskDate() {
        return taskDate;
    }

}
