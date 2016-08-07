package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class CategoryConfProductType {
    private long ccptId;
    private String ccptItem;
    private Integer ccptSortOrder;
    private Boolean valid;

    public long getCcptId() {
        return ccptId;
    }

    public void setCcptId(long ccptId) {
        this.ccptId = ccptId;
    }

    public String getCcptItem() {
        return ccptItem;
    }

    public void setCcptItem(String ccptItem) {
        this.ccptItem = ccptItem;
    }

    public Integer getCcptSortOrder() {
        return ccptSortOrder;
    }

    public void setCcptSortOrder(Integer ccptSortOrder) {
        this.ccptSortOrder = ccptSortOrder;
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

        CategoryConfProductType that = (CategoryConfProductType) o;

        if (ccptId != that.ccptId) return false;
        if (ccptItem != null ? !ccptItem.equals(that.ccptItem) : that.ccptItem != null) return false;
        if (ccptSortOrder != null ? !ccptSortOrder.equals(that.ccptSortOrder) : that.ccptSortOrder != null)
            return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (ccptId ^ (ccptId >>> 32));
        result = 31 * result + (ccptItem != null ? ccptItem.hashCode() : 0);
        result = 31 * result + (ccptSortOrder != null ? ccptSortOrder.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
