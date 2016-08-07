package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class CategoryConfFund {
    private long ccfId;
    private String ccfItem;
    private Integer ccfSortOrder;
    private Boolean valid;

    public long getCcfId() {
        return ccfId;
    }

    public void setCcfId(long ccfId) {
        this.ccfId = ccfId;
    }

    public String getCcfItem() {
        return ccfItem;
    }

    public void setCcfItem(String ccfItem) {
        this.ccfItem = ccfItem;
    }

    public Integer getCcfSortOrder() {
        return ccfSortOrder;
    }

    public void setCcfSortOrder(Integer ccfSortOrder) {
        this.ccfSortOrder = ccfSortOrder;
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

        CategoryConfFund that = (CategoryConfFund) o;

        if (ccfId != that.ccfId) return false;
        if (ccfItem != null ? !ccfItem.equals(that.ccfItem) : that.ccfItem != null) return false;
        if (ccfSortOrder != null ? !ccfSortOrder.equals(that.ccfSortOrder) : that.ccfSortOrder != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (ccfId ^ (ccfId >>> 32));
        result = 31 * result + (ccfItem != null ? ccfItem.hashCode() : 0);
        result = 31 * result + (ccfSortOrder != null ? ccfSortOrder.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
