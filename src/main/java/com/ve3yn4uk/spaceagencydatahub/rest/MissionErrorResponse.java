package com.ve3yn4uk.spaceagencydatahub.rest;

/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

public class MissionErrorResponse {

    private int Status;
    private String Message;
    private long timeStamp;

    public MissionErrorResponse() {
    }

    public MissionErrorResponse(int status, String message, long timeStamp) {
        Status = status;
        Message = message;
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
