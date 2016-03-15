package ru.com.egorov_g_a.remindme.dto;

public abstract class AbstractEntityDTO {
    private Long id;

    private String title;

    public AbstractEntityDTO() {
    }

    public AbstractEntityDTO(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
