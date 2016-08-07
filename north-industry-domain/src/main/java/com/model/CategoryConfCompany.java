package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class CategoryConfCompany {
    private long cccId;
    private String cccItem;
    private Integer cccSortOrder;
    private Boolean valid;

    public long getCccId() {
        return cccId;
    }

    public void setCccId(long cccId) {
        this.cccId = cccId;
    }

    public String getCccItem() {
        return cccItem;
    }

    public void setCccItem(String cccItem) {
        this.cccItem = cccItem;
    }

    public Integer getCccSortOrder() {
        return cccSortOrder;
    }

    public void setCccSortOrder(Integer cccSortOrder) {
        this.cccSortOrder = cccSortOrder;
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

        CategoryConfCompany that = (CategoryConfCompany) o;

        if (cccId != that.cccId) return false;
        if (cccItem != null ? !cccItem.equals(that.cccItem) : that.cccItem != null) return false;
        if (cccSortOrder != null ? !cccSortOrder.equals(that.cccSortOrder) : that.cccSortOrder != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cccId ^ (cccId >>> 32));
        result = 31 * result + (cccItem != null ? cccItem.hashCode() : 0);
        result = 31 * result + (cccSortOrder != null ? cccSortOrder.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
