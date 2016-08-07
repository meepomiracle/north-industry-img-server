package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class StaffUnreadMsgList {
    private long id;
    private String msgIdSet;
    private Staff staffByStaffId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMsgIdSet() {
        return msgIdSet;
    }

    public void setMsgIdSet(String msgIdSet) {
        this.msgIdSet = msgIdSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StaffUnreadMsgList that = (StaffUnreadMsgList) o;

        if (id != that.id) return false;
        if (msgIdSet != null ? !msgIdSet.equals(that.msgIdSet) : that.msgIdSet != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (msgIdSet != null ? msgIdSet.hashCode() : 0);
        return result;
    }

    public Staff getStaffByStaffId() {
        return staffByStaffId;
    }

    public void setStaffByStaffId(Staff staffByStaffId) {
        this.staffByStaffId = staffByStaffId;
    }
}
