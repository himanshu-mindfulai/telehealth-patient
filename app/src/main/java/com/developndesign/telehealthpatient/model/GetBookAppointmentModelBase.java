package com.developndesign.telehealthpatient.model;

import java.util.ArrayList;

public class GetBookAppointmentModelBase {
    private int status;
    private String message;
    private ArrayList<GetBookAppointmentModelData> data;
    private boolean errors;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<GetBookAppointmentModelData> getData() {
        return data;
    }

    public void setData(ArrayList<GetBookAppointmentModelData> data) {
        this.data = data;
    }

    public boolean isErrors() {
        return errors;
    }

    public void setErrors(boolean errors) {
        this.errors = errors;
    }
}
