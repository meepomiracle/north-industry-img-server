package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class Materialquotation {
    private long mqId;
    private String mqContent;
    private String mqTitle;
    private Long mqCreateDate;
    private Long mqUpdateDate;
    private Long mqDate;

    public long getMqId() {
        return mqId;
    }

    public void setMqId(long mqId) {
        this.mqId = mqId;
    }

    public String getMqContent() {
        return mqContent;
    }

    public void setMqContent(String mqContent) {
        this.mqContent = mqContent;
    }

    public String getMqTitle() {
        return mqTitle;
    }

    public void setMqTitle(String mqTitle) {
        this.mqTitle = mqTitle;
    }

    public Long getMqCreateDate() {
        return mqCreateDate;
    }

    public void setMqCreateDate(Long mqCreateDate) {
        this.mqCreateDate = mqCreateDate;
    }

    public Long getMqUpdateDate() {
        return mqUpdateDate;
    }

    public void setMqUpdateDate(Long mqUpdateDate) {
        this.mqUpdateDate = mqUpdateDate;
    }

    public Long getMqDate() {
        return mqDate;
    }

    public void setMqDate(Long mqDate) {
        this.mqDate = mqDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Materialquotation that = (Materialquotation) o;

        if (mqId != that.mqId) return false;
        if (mqContent != null ? !mqContent.equals(that.mqContent) : that.mqContent != null) return false;
        if (mqTitle != null ? !mqTitle.equals(that.mqTitle) : that.mqTitle != null) return false;
        if (mqCreateDate != null ? !mqCreateDate.equals(that.mqCreateDate) : that.mqCreateDate != null) return false;
        if (mqUpdateDate != null ? !mqUpdateDate.equals(that.mqUpdateDate) : that.mqUpdateDate != null) return false;
        if (mqDate != null ? !mqDate.equals(that.mqDate) : that.mqDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (mqId ^ (mqId >>> 32));
        result = 31 * result + (mqContent != null ? mqContent.hashCode() : 0);
        result = 31 * result + (mqTitle != null ? mqTitle.hashCode() : 0);
        result = 31 * result + (mqCreateDate != null ? mqCreateDate.hashCode() : 0);
        result = 31 * result + (mqUpdateDate != null ? mqUpdateDate.hashCode() : 0);
        result = 31 * result + (mqDate != null ? mqDate.hashCode() : 0);
        return result;
    }
}
