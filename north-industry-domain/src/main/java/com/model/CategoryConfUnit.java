package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class CategoryConfUnit {
    private long ccuId;
    private String ccuItem;
    private Integer ccuSortOrder;
    private Boolean valid;

    public long getCcuId() {
        return ccuId;
    }

    public void setCcuId(long ccuId) {
        this.ccuId = ccuId;
    }

    public String getCcuItem() {
        return ccuItem;
    }

    public void setCcuItem(String ccuItem) {
        this.ccuItem = ccuItem;
    }

    public Integer getCcuSortOrder() {
        return ccuSortOrder;
    }

    public void setCcuSortOrder(Integer ccuSortOrder) {
        this.ccuSortOrder = ccuSortOrder;
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

        CategoryConfUnit that = (CategoryConfUnit) o;

        if (ccuId != that.ccuId) return false;
        if (ccuItem != null ? !ccuItem.equals(that.ccuItem) : that.ccuItem != null) return false;
        if (ccuSortOrder != null ? !ccuSortOrder.equals(that.ccuSortOrder) : that.ccuSortOrder != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (ccuId ^ (ccuId >>> 32));
        result = 31 * result + (ccuItem != null ? ccuItem.hashCode() : 0);
        result = 31 * result + (ccuSortOrder != null ? ccuSortOrder.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
