package com.example.springboot.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Document
public class Todo {

    @Id
    private String id;

    @NotBlank
    @Size(max = 150)
    private String message;

    private int priority;

    private Date createdDate;

    private Date endDate;

    @Value("false")
    private boolean hasDone;

    public Todo(String id, String message, int priority, Date createdDate, Date endDate, boolean hasDone) {
        this.id = id;
        this.message = message;
        this.priority = priority;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.hasDone = hasDone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isHasDone() {
        return hasDone;
    }

    public void setHasDone(boolean hasDone) {
        this.hasDone = hasDone;
    }
}
