package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class Product {
    private long prodcId;
    private String prodcName;
    private String prodcIntro;
    private String prodcFunction;
    private String prodcTechParam;
    private String prodcPicture;
    private String prodcAdavantage;
    private String prodcCase;
    private String prodcNo;
    private Integer prodcInventory;
    private String prodcOtherInfo;
    private String prodcPrice;
    private Boolean prodcValid;
    private String prodcSerial;
    private String prodcRespo;
    private String prodcType;
    private CategoryConfProductSeries categoryConfProductSeriesByCcpsId;
    private CategoryConfProductType categoryConfProductTypeByCcptId;

    public long getProdcId() {
        return prodcId;
    }

    public void setProdcId(long prodcId) {
        this.prodcId = prodcId;
    }

    public String getProdcName() {
        return prodcName;
    }

    public void setProdcName(String prodcName) {
        this.prodcName = prodcName;
    }

    public String getProdcIntro() {
        return prodcIntro;
    }

    public void setProdcIntro(String prodcIntro) {
        this.prodcIntro = prodcIntro;
    }

    public String getProdcFunction() {
        return prodcFunction;
    }

    public void setProdcFunction(String prodcFunction) {
        this.prodcFunction = prodcFunction;
    }

    public String getProdcTechParam() {
        return prodcTechParam;
    }

    public void setProdcTechParam(String prodcTechParam) {
        this.prodcTechParam = prodcTechParam;
    }

    public String getProdcPicture() {
        return prodcPicture;
    }

    public void setProdcPicture(String prodcPicture) {
        this.prodcPicture = prodcPicture;
    }

    public String getProdcAdavantage() {
        return prodcAdavantage;
    }

    public void setProdcAdavantage(String prodcAdavantage) {
        this.prodcAdavantage = prodcAdavantage;
    }

    public String getProdcCase() {
        return prodcCase;
    }

    public void setProdcCase(String prodcCase) {
        this.prodcCase = prodcCase;
    }

    public String getProdcNo() {
        return prodcNo;
    }

    public void setProdcNo(String prodcNo) {
        this.prodcNo = prodcNo;
    }

    public Integer getProdcInventory() {
        return prodcInventory;
    }

    public void setProdcInventory(Integer prodcInventory) {
        this.prodcInventory = prodcInventory;
    }

    public String getProdcOtherInfo() {
        return prodcOtherInfo;
    }

    public void setProdcOtherInfo(String prodcOtherInfo) {
        this.prodcOtherInfo = prodcOtherInfo;
    }

    public String getProdcPrice() {
        return prodcPrice;
    }

    public void setProdcPrice(String prodcPrice) {
        this.prodcPrice = prodcPrice;
    }

    public Boolean getProdcValid() {
        return prodcValid;
    }

    public void setProdcValid(Boolean prodcValid) {
        this.prodcValid = prodcValid;
    }

    public String getProdcSerial() {
        return prodcSerial;
    }

    public void setProdcSerial(String prodcSerial) {
        this.prodcSerial = prodcSerial;
    }

    public String getProdcRespo() {
        return prodcRespo;
    }

    public void setProdcRespo(String prodcRespo) {
        this.prodcRespo = prodcRespo;
    }

    public String getProdcType() {
        return prodcType;
    }

    public void setProdcType(String prodcType) {
        this.prodcType = prodcType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (prodcId != product.prodcId) return false;
        if (prodcName != null ? !prodcName.equals(product.prodcName) : product.prodcName != null) return false;
        if (prodcIntro != null ? !prodcIntro.equals(product.prodcIntro) : product.prodcIntro != null) return false;
        if (prodcFunction != null ? !prodcFunction.equals(product.prodcFunction) : product.prodcFunction != null)
            return false;
        if (prodcTechParam != null ? !prodcTechParam.equals(product.prodcTechParam) : product.prodcTechParam != null)
            return false;
        if (prodcPicture != null ? !prodcPicture.equals(product.prodcPicture) : product.prodcPicture != null)
            return false;
        if (prodcAdavantage != null ? !prodcAdavantage.equals(product.prodcAdavantage) : product.prodcAdavantage !=
                null)
            return false;
        if (prodcCase != null ? !prodcCase.equals(product.prodcCase) : product.prodcCase != null) return false;
        if (prodcNo != null ? !prodcNo.equals(product.prodcNo) : product.prodcNo != null) return false;
        if (prodcInventory != null ? !prodcInventory.equals(product.prodcInventory) : product.prodcInventory != null)
            return false;
        if (prodcOtherInfo != null ? !prodcOtherInfo.equals(product.prodcOtherInfo) : product.prodcOtherInfo != null)
            return false;
        if (prodcPrice != null ? !prodcPrice.equals(product.prodcPrice) : product.prodcPrice != null) return false;
        if (prodcValid != null ? !prodcValid.equals(product.prodcValid) : product.prodcValid != null) return false;
        if (prodcSerial != null ? !prodcSerial.equals(product.prodcSerial) : product.prodcSerial != null) return false;
        if (prodcRespo != null ? !prodcRespo.equals(product.prodcRespo) : product.prodcRespo != null) return false;
        if (prodcType != null ? !prodcType.equals(product.prodcType) : product.prodcType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (prodcId ^ (prodcId >>> 32));
        result = 31 * result + (prodcName != null ? prodcName.hashCode() : 0);
        result = 31 * result + (prodcIntro != null ? prodcIntro.hashCode() : 0);
        result = 31 * result + (prodcFunction != null ? prodcFunction.hashCode() : 0);
        result = 31 * result + (prodcTechParam != null ? prodcTechParam.hashCode() : 0);
        result = 31 * result + (prodcPicture != null ? prodcPicture.hashCode() : 0);
        result = 31 * result + (prodcAdavantage != null ? prodcAdavantage.hashCode() : 0);
        result = 31 * result + (prodcCase != null ? prodcCase.hashCode() : 0);
        result = 31 * result + (prodcNo != null ? prodcNo.hashCode() : 0);
        result = 31 * result + (prodcInventory != null ? prodcInventory.hashCode() : 0);
        result = 31 * result + (prodcOtherInfo != null ? prodcOtherInfo.hashCode() : 0);
        result = 31 * result + (prodcPrice != null ? prodcPrice.hashCode() : 0);
        result = 31 * result + (prodcValid != null ? prodcValid.hashCode() : 0);
        result = 31 * result + (prodcSerial != null ? prodcSerial.hashCode() : 0);
        result = 31 * result + (prodcRespo != null ? prodcRespo.hashCode() : 0);
        result = 31 * result + (prodcType != null ? prodcType.hashCode() : 0);
        return result;
    }

    public CategoryConfProductSeries getCategoryConfProductSeriesByCcpsId() {
        return categoryConfProductSeriesByCcpsId;
    }

    public void setCategoryConfProductSeriesByCcpsId(CategoryConfProductSeries categoryConfProductSeriesByCcpsId) {
        this.categoryConfProductSeriesByCcpsId = categoryConfProductSeriesByCcpsId;
    }

    public CategoryConfProductType getCategoryConfProductTypeByCcptId() {
        return categoryConfProductTypeByCcptId;
    }

    public void setCategoryConfProductTypeByCcptId(CategoryConfProductType categoryConfProductTypeByCcptId) {
        this.categoryConfProductTypeByCcptId = categoryConfProductTypeByCcptId;
    }
}
