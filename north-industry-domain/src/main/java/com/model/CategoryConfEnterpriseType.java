package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class CategoryConfEnterpriseType {
    private long ccetId;
    private String ccetItem;
    private Integer ccetSortOrder;
    private Boolean valid;

    public long getCcetId() {
        return ccetId;
    }

    public void setCcetId(long ccetId) {
        this.ccetId = ccetId;
    }

    public String getCcetItem() {
        return ccetItem;
    }

    public void setCcetItem(String ccetItem) {
        this.ccetItem = ccetItem;
    }

    public Integer getCcetSortOrder() {
        return ccetSortOrder;
    }

    public void setCcetSortOrder(Integer ccetSortOrder) {
        this.ccetSortOrder = ccetSortOrder;
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

        CategoryConfEnterpriseType that = (CategoryConfEnterpriseType) o;

        if (ccetId != that.ccetId) return false;
        if (ccetItem != null ? !ccetItem.equals(that.ccetItem) : that.ccetItem != null) return false;
        if (ccetSortOrder != null ? !ccetSortOrder.equals(that.ccetSortOrder) : that.ccetSortOrder != null)
            return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (ccetId ^ (ccetId >>> 32));
        result = 31 * result + (ccetItem != null ? ccetItem.hashCode() : 0);
        result = 31 * result + (ccetSortOrder != null ? ccetSortOrder.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
