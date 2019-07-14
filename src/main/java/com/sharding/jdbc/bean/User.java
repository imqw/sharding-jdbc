package com.sharding.jdbc.bean;

import java.util.Date;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Version 1.0.0
 */
public class User {

    private Long id;
    private String name;
    private Long taskId;
    private String callMonth;


    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getCallMonth() {
        return callMonth;
    }

    public void setCallMonth(String callMonth) {
        this.callMonth = callMonth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taskId=" + taskId +
                ", callMonth='" + callMonth + '\'' +
                '}';
    }
}
