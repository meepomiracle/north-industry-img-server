package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class CategoryConfDepartment {
    private long ccdId;
    private String ccdItem;
    private Integer ccdSortOrder;
    private Boolean valid;

    public long getCcdId() {
        return ccdId;
    }

    public void setCcdId(long ccdId) {
        this.ccdId = ccdId;
    }

    public String getCcdItem() {
        return ccdItem;
    }

    public void setCcdItem(String ccdItem) {
        this.ccdItem = ccdItem;
    }

    public Integer getCcdSortOrder() {
        return ccdSortOrder;
    }

    public void setCcdSortOrder(Integer ccdSortOrder) {
        this.ccdSortOrder = ccdSortOrder;
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

        CategoryConfDepartment that = (CategoryConfDepartment) o;

        if (ccdId != that.ccdId) return false;
        if (ccdItem != null ? !ccdItem.equals(that.ccdItem) : that.ccdItem != null) return false;
        if (ccdSortOrder != null ? !ccdSortOrder.equals(that.ccdSortOrder) : that.ccdSortOrder != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (ccdId ^ (ccdId >>> 32));
        result = 31 * result + (ccdItem != null ? ccdItem.hashCode() : 0);
        result = 31 * result + (ccdSortOrder != null ? ccdSortOrder.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
