package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class CommonProblem {
    private long cpId;
    private String cpTitle;
    private String cpContent;
    private Long cpAdminId;
    private Boolean valid;

    public long getCpId() {
        return cpId;
    }

    public void setCpId(long cpId) {
        this.cpId = cpId;
    }

    public String getCpTitle() {
        return cpTitle;
    }

    public void setCpTitle(String cpTitle) {
        this.cpTitle = cpTitle;
    }

    public String getCpContent() {
        return cpContent;
    }

    public void setCpContent(String cpContent) {
        this.cpContent = cpContent;
    }

    public Long getCpAdminId() {
        return cpAdminId;
    }

    public void setCpAdminId(Long cpAdminId) {
        this.cpAdminId = cpAdminId;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonProblem that = (CommonProblem) o;

        if (cpId != that.cpId) return false;
        if (cpTitle != null ? !cpTitle.equals(that.cpTitle) : that.cpTitle != null) return false;
        if (cpContent != null ? !cpContent.equals(that.cpContent) : that.cpContent != null) return false;
        if (cpAdminId != null ? !cpAdminId.equals(that.cpAdminId) : that.cpAdminId != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cpId ^ (cpId >>> 32));
        result = 31 * result + (cpTitle != null ? cpTitle.hashCode() : 0);
        result = 31 * result + (cpContent != null ? cpContent.hashCode() : 0);
        result = 31 * result + (cpAdminId != null ? cpAdminId.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
