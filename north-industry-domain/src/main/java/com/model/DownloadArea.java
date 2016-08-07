package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class DownloadArea {
    private long daId;
    private String daName;
    private String daType;
    private String daUrl;
    private Long daDate;

    public long getDaId() {
        return daId;
    }

    public void setDaId(long daId) {
        this.daId = daId;
    }

    public String getDaName() {
        return daName;
    }

    public void setDaName(String daName) {
        this.daName = daName;
    }

    public String getDaType() {
        return daType;
    }

    public void setDaType(String daType) {
        this.daType = daType;
    }

    public String getDaUrl() {
        return daUrl;
    }

    public void setDaUrl(String daUrl) {
        this.daUrl = daUrl;
    }

    public Long getDaDate() {
        return daDate;
    }

    public void setDaDate(Long daDate) {
        this.daDate = daDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DownloadArea that = (DownloadArea) o;

        if (daId != that.daId) return false;
        if (daName != null ? !daName.equals(that.daName) : that.daName != null) return false;
        if (daType != null ? !daType.equals(that.daType) : that.daType != null) return false;
        if (daUrl != null ? !daUrl.equals(that.daUrl) : that.daUrl != null) return false;
        if (daDate != null ? !daDate.equals(that.daDate) : that.daDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (daId ^ (daId >>> 32));
        result = 31 * result + (daName != null ? daName.hashCode() : 0);
        result = 31 * result + (daType != null ? daType.hashCode() : 0);
        result = 31 * result + (daUrl != null ? daUrl.hashCode() : 0);
        result = 31 * result + (daDate != null ? daDate.hashCode() : 0);
        return result;
    }
}
