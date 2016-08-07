package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class MaterialRecord {
    private long matId;
    private String matUnit;
    private Integer matQuantity;
    private Double matPrice;
    private CategoryConfMatName categoryConfMatNameByCcmnId;
    private Call4Bid call4BidByCbId;

    public long getMatId() {
        return matId;
    }

    public void setMatId(long matId) {
        this.matId = matId;
    }

    public String getMatUnit() {
        return matUnit;
    }

    public void setMatUnit(String matUnit) {
        this.matUnit = matUnit;
    }

    public Integer getMatQuantity() {
        return matQuantity;
    }

    public void setMatQuantity(Integer matQuantity) {
        this.matQuantity = matQuantity;
    }

    public Double getMatPrice() {
        return matPrice;
    }

    public void setMatPrice(Double matPrice) {
        this.matPrice = matPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaterialRecord that = (MaterialRecord) o;

        if (matId != that.matId) return false;
        if (matUnit != null ? !matUnit.equals(that.matUnit) : that.matUnit != null) return false;
        if (matQuantity != null ? !matQuantity.equals(that.matQuantity) : that.matQuantity != null) return false;
        if (matPrice != null ? !matPrice.equals(that.matPrice) : that.matPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (matId ^ (matId >>> 32));
        result = 31 * result + (matUnit != null ? matUnit.hashCode() : 0);
        result = 31 * result + (matQuantity != null ? matQuantity.hashCode() : 0);
        result = 31 * result + (matPrice != null ? matPrice.hashCode() : 0);
        return result;
    }

    public CategoryConfMatName getCategoryConfMatNameByCcmnId() {
        return categoryConfMatNameByCcmnId;
    }

    public void setCategoryConfMatNameByCcmnId(CategoryConfMatName categoryConfMatNameByCcmnId) {
        this.categoryConfMatNameByCcmnId = categoryConfMatNameByCcmnId;
    }

    public Call4Bid getCall4BidByCbId() {
        return call4BidByCbId;
    }

    public void setCall4BidByCbId(Call4Bid call4BidByCbId) {
        this.call4BidByCbId = call4BidByCbId;
    }
}
