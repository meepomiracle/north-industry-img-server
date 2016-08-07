package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class Policy {
    private long poId;
    private String poName;
    private String poUrl;
    private Long poDate;

    public long getPoId() {
        return poId;
    }

    public void setPoId(long poId) {
        this.poId = poId;
    }

    public String getPoName() {
        return poName;
    }

    public void setPoName(String poName) {
        this.poName = poName;
    }

    public String getPoUrl() {
        return poUrl;
    }

    public void setPoUrl(String poUrl) {
        this.poUrl = poUrl;
    }

    public Long getPoDate() {
        return poDate;
    }

    public void setPoDate(Long poDate) {
        this.poDate = poDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Policy policy = (Policy) o;

        if (poId != policy.poId) return false;
        if (poName != null ? !poName.equals(policy.poName) : policy.poName != null) return false;
        if (poUrl != null ? !poUrl.equals(policy.poUrl) : policy.poUrl != null) return false;
        if (poDate != null ? !poDate.equals(policy.poDate) : policy.poDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (poId ^ (poId >>> 32));
        result = 31 * result + (poName != null ? poName.hashCode() : 0);
        result = 31 * result + (poUrl != null ? poUrl.hashCode() : 0);
        result = 31 * result + (poDate != null ? poDate.hashCode() : 0);
        return result;
    }
}
