package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class CategoryConfMatName {
    private long ccmnId;
    private String ccmnItem;
    private Integer ccmnSortOrder;
    private Boolean valid;

    public long getCcmnId() {
        return ccmnId;
    }

    public void setCcmnId(long ccmnId) {
        this.ccmnId = ccmnId;
    }

    public String getCcmnItem() {
        return ccmnItem;
    }

    public void setCcmnItem(String ccmnItem) {
        this.ccmnItem = ccmnItem;
    }

    public Integer getCcmnSortOrder() {
        return ccmnSortOrder;
    }

    public void setCcmnSortOrder(Integer ccmnSortOrder) {
        this.ccmnSortOrder = ccmnSortOrder;
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

        CategoryConfMatName that = (CategoryConfMatName) o;

        if (ccmnId != that.ccmnId) return false;
        if (ccmnItem != null ? !ccmnItem.equals(that.ccmnItem) : that.ccmnItem != null) return false;
        if (ccmnSortOrder != null ? !ccmnSortOrder.equals(that.ccmnSortOrder) : that.ccmnSortOrder != null)
            return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (ccmnId ^ (ccmnId >>> 32));
        result = 31 * result + (ccmnItem != null ? ccmnItem.hashCode() : 0);
        result = 31 * result + (ccmnSortOrder != null ? ccmnSortOrder.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
