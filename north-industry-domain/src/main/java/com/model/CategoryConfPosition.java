package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class CategoryConfPosition {
    private long ccpId;
    private String ccpItem;
    private Integer ccpSortOrder;
    private Boolean valid;

    public long getCcpId() {
        return ccpId;
    }

    public void setCcpId(long ccpId) {
        this.ccpId = ccpId;
    }

    public String getCcpItem() {
        return ccpItem;
    }

    public void setCcpItem(String ccpItem) {
        this.ccpItem = ccpItem;
    }

    public Integer getCcpSortOrder() {
        return ccpSortOrder;
    }

    public void setCcpSortOrder(Integer ccpSortOrder) {
        this.ccpSortOrder = ccpSortOrder;
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

        CategoryConfPosition that = (CategoryConfPosition) o;

        if (ccpId != that.ccpId) return false;
        if (ccpItem != null ? !ccpItem.equals(that.ccpItem) : that.ccpItem != null) return false;
        if (ccpSortOrder != null ? !ccpSortOrder.equals(that.ccpSortOrder) : that.ccpSortOrder != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (ccpId ^ (ccpId >>> 32));
        result = 31 * result + (ccpItem != null ? ccpItem.hashCode() : 0);
        result = 31 * result + (ccpSortOrder != null ? ccpSortOrder.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
