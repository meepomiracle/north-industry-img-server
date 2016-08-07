package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class PersonalMessage {
    private long pmId;
    private String pmContent;
    private Long pmDate;
    private Integer pmReadState;
    private String pmUserType;
    private String pmMsgType;
    private Long pmUserId;

    public long getPmId() {
        return pmId;
    }

    public void setPmId(long pmId) {
        this.pmId = pmId;
    }

    public String getPmContent() {
        return pmContent;
    }

    public void setPmContent(String pmContent) {
        this.pmContent = pmContent;
    }

    public Long getPmDate() {
        return pmDate;
    }

    public void setPmDate(Long pmDate) {
        this.pmDate = pmDate;
    }

    public Integer getPmReadState() {
        return pmReadState;
    }

    public void setPmReadState(Integer pmReadState) {
        this.pmReadState = pmReadState;
    }

    public String getPmUserType() {
        return pmUserType;
    }

    public void setPmUserType(String pmUserType) {
        this.pmUserType = pmUserType;
    }

    public String getPmMsgType() {
        return pmMsgType;
    }

    public void setPmMsgType(String pmMsgType) {
        this.pmMsgType = pmMsgType;
    }

    public Long getPmUserId() {
        return pmUserId;
    }

    public void setPmUserId(Long pmUserId) {
        this.pmUserId = pmUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonalMessage that = (PersonalMessage) o;

        if (pmId != that.pmId) return false;
        if (pmContent != null ? !pmContent.equals(that.pmContent) : that.pmContent != null) return false;
        if (pmDate != null ? !pmDate.equals(that.pmDate) : that.pmDate != null) return false;
        if (pmReadState != null ? !pmReadState.equals(that.pmReadState) : that.pmReadState != null) return false;
        if (pmUserType != null ? !pmUserType.equals(that.pmUserType) : that.pmUserType != null) return false;
        if (pmMsgType != null ? !pmMsgType.equals(that.pmMsgType) : that.pmMsgType != null) return false;
        if (pmUserId != null ? !pmUserId.equals(that.pmUserId) : that.pmUserId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pmId ^ (pmId >>> 32));
        result = 31 * result + (pmContent != null ? pmContent.hashCode() : 0);
        result = 31 * result + (pmDate != null ? pmDate.hashCode() : 0);
        result = 31 * result + (pmReadState != null ? pmReadState.hashCode() : 0);
        result = 31 * result + (pmUserType != null ? pmUserType.hashCode() : 0);
        result = 31 * result + (pmMsgType != null ? pmMsgType.hashCode() : 0);
        result = 31 * result + (pmUserId != null ? pmUserId.hashCode() : 0);
        return result;
    }
}
