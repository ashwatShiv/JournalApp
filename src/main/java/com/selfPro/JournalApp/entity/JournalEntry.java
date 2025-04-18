package com.selfPro.JournalApp.entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class JournalEntry {

    @NotNull
    private long id;
    @NotNull
    private String title;
    @NotBlank(message = "Content should not be blank")
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
