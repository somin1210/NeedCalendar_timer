package com.example.needcalendar;

public class TodoItem {

    private int id;
    private String content;
    private String title;
    private String writeDate;
    private  String memo;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    public String getMemo() {return memo;}

    public void setMemo(String toString) {this.memo = memo;}
}
