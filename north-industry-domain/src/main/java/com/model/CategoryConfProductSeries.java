package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class CategoryConfProductSeries {
    private long ccpsId;
    private String ccpsItem;
    private Integer ccpsSortOrder;
    private Long ccptsId;
    private Boolean valid;

    public long getCcpsId() {
        return ccpsId;
    }

    public void setCcpsId(long ccpsId) {
        this.ccpsId = ccpsId;
    }

    public String getCcpsItem() {
        return ccpsItem;
    }

    public void setCcpsItem(String ccpsItem) {
        this.ccpsItem = ccpsItem;
    }

    public Integer getCcpsSortOrder() {
        return ccpsSortOrder;
    }

    public void setCcpsSortOrder(Integer ccpsSortOrder) {
        this.ccpsSortOrder = ccpsSortOrder;
    }

    public Long getCcptsId() {
        return ccptsId;
    }

    public void setCcptsId(Long ccptsId) {
        this.ccptsId = ccptsId;
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

        CategoryConfProductSeries that = (CategoryConfProductSeries) o;

        if (ccpsId != that.ccpsId) return false;
        if (ccpsItem != null ? !ccpsItem.equals(that.ccpsItem) : that.ccpsItem != null) return false;
        if (ccpsSortOrder != null ? !ccpsSortOrder.equals(that.ccpsSortOrder) : that.ccpsSortOrder != null)
            return false;
        if (ccptsId != null ? !ccptsId.equals(that.ccptsId) : that.ccptsId != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (ccpsId ^ (ccpsId >>> 32));
        result = 31 * result + (ccpsItem != null ? ccpsItem.hashCode() : 0);
        result = 31 * result + (ccpsSortOrder != null ? ccpsSortOrder.hashCode() : 0);
        result = 31 * result + (ccptsId != null ? ccptsId.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        return result;
    }
}
