package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class ProShowtime {
    private long psId;
    private String psDesc;
    private Long psDatetime;
    private Integer psType;

    public long getPsId() {
        return psId;
    }

    public void setPsId(long psId) {
        this.psId = psId;
    }

    public String getPsDesc() {
        return psDesc;
    }

    public void setPsDesc(String psDesc) {
        this.psDesc = psDesc;
    }

    public Long getPsDatetime() {
        return psDatetime;
    }

    public void setPsDatetime(Long psDatetime) {
        this.psDatetime = psDatetime;
    }

    public Integer getPsType() {
        return psType;
    }

    public void setPsType(Integer psType) {
        this.psType = psType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProShowtime that = (ProShowtime) o;

        if (psId != that.psId) return false;
        if (psDesc != null ? !psDesc.equals(that.psDesc) : that.psDesc != null) return false;
        if (psDatetime != null ? !psDatetime.equals(that.psDatetime) : that.psDatetime != null) return false;
        if (psType != null ? !psType.equals(that.psType) : that.psType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (psId ^ (psId >>> 32));
        result = 31 * result + (psDesc != null ? psDesc.hashCode() : 0);
        result = 31 * result + (psDatetime != null ? psDatetime.hashCode() : 0);
        result = 31 * result + (psType != null ? psType.hashCode() : 0);
        return result;
    }
}
