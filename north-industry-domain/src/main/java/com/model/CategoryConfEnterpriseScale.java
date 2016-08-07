package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class CategoryConfEnterpriseScale {
    private long ccesId;
    private String ccesItem;
    private Integer ccesSortOrder;
    private Boolean valid;

    public long getCcesId() {
        return ccesId;
    }

    public void setCcesId(long ccesId) {
        this.ccesId = ccesId;
    }

    public String getCcesItem() {
        return ccesItem;
    }

    public void setCcesItem(String ccesItem) {
        this.ccesItem = ccesItem;
    }

    public Integer getCcesSortOrder() {
        return ccesSortOrder;
    }

    public void setCcesSortOrder(Integer ccesSortOrder) {
        this.ccesSortOrder = ccesSortOrder;
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

        CategoryConfEnterpriseScale that = (CategoryConfEnterpriseScale) o;

        if (ccesId != that.ccesId) return false;
        if (ccesItem != null ? !ccesItem.equals(that.ccesItem) : that.ccesItem != null) return false;
        if (ccesSortOrder != null ? !ccesSortOrder.equals(that.ccesSortOrder) : that.ccesSortOrder != null)
            return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (ccesId ^ (ccesId >>> 32));
        result = 31 * result + (ccesItem != null ? ccesItem.hashCode() : 0);
        result = 31 * result + (ccesSortOrder != null ? ccesSortOrder.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
