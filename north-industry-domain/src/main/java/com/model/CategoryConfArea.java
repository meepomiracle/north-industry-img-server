package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class CategoryConfArea {
    private long ccaId;
    private String ccaItem;
    private Integer ccaSortOrder;
    private Boolean valid;

    public long getCcaId() {
        return ccaId;
    }

    public void setCcaId(long ccaId) {
        this.ccaId = ccaId;
    }

    public String getCcaItem() {
        return ccaItem;
    }

    public void setCcaItem(String ccaItem) {
        this.ccaItem = ccaItem;
    }

    public Integer getCcaSortOrder() {
        return ccaSortOrder;
    }

    public void setCcaSortOrder(Integer ccaSortOrder) {
        this.ccaSortOrder = ccaSortOrder;
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

        CategoryConfArea that = (CategoryConfArea) o;

        if (ccaId != that.ccaId) return false;
        if (ccaItem != null ? !ccaItem.equals(that.ccaItem) : that.ccaItem != null) return false;
        if (ccaSortOrder != null ? !ccaSortOrder.equals(that.ccaSortOrder) : that.ccaSortOrder != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (ccaId ^ (ccaId >>> 32));
        result = 31 * result + (ccaItem != null ? ccaItem.hashCode() : 0);
        result = 31 * result + (ccaSortOrder != null ? ccaSortOrder.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
