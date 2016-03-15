package ru.com.egorov_g_a.remindme.dto;

import java.util.Date;

public class RemindDTO extends AbstractEntityDTO {

    private Date remindDate;

//    public RemindDTO() {
//    }


    public Date getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

}
