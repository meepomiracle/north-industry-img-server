package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class StaffOperationHistory {
    private long sohId;
    private String sohDesc;
    private Long sohDatetime;
    private Integer sohType;
    private Integer sohOpType;
    private Long sohCompanyId;
    private Staff staffByStaId;
    private Staff staffBySohStaffId;
    private Provider providerBySohProviderId;
    private Call4Bid call4BidBySohBidId;

    public long getSohId() {
        return sohId;
    }

    public void setSohId(long sohId) {
        this.sohId = sohId;
    }

    public String getSohDesc() {
        return sohDesc;
    }

    public void setSohDesc(String sohDesc) {
        this.sohDesc = sohDesc;
    }

    public Long getSohDatetime() {
        return sohDatetime;
    }

    public void setSohDatetime(Long sohDatetime) {
        this.sohDatetime = sohDatetime;
    }

    public Integer getSohType() {
        return sohType;
    }

    public void setSohType(Integer sohType) {
        this.sohType = sohType;
    }

    public Integer getSohOpType() {
        return sohOpType;
    }

    public void setSohOpType(Integer sohOpType) {
        this.sohOpType = sohOpType;
    }

    public Long getSohCompanyId() {
        return sohCompanyId;
    }

    public void setSohCompanyId(Long sohCompanyId) {
        this.sohCompanyId = sohCompanyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StaffOperationHistory that = (StaffOperationHistory) o;

        if (sohId != that.sohId) return false;
        if (sohDesc != null ? !sohDesc.equals(that.sohDesc) : that.sohDesc != null) return false;
        if (sohDatetime != null ? !sohDatetime.equals(that.sohDatetime) : that.sohDatetime != null) return false;
        if (sohType != null ? !sohType.equals(that.sohType) : that.sohType != null) return false;
        if (sohOpType != null ? !sohOpType.equals(that.sohOpType) : that.sohOpType != null) return false;
        if (sohCompanyId != null ? !sohCompanyId.equals(that.sohCompanyId) : that.sohCompanyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (sohId ^ (sohId >>> 32));
        result = 31 * result + (sohDesc != null ? sohDesc.hashCode() : 0);
        result = 31 * result + (sohDatetime != null ? sohDatetime.hashCode() : 0);
        result = 31 * result + (sohType != null ? sohType.hashCode() : 0);
        result = 31 * result + (sohOpType != null ? sohOpType.hashCode() : 0);
        result = 31 * result + (sohCompanyId != null ? sohCompanyId.hashCode() : 0);
        return result;
    }

    public Staff getStaffByStaId() {
        return staffByStaId;
    }

    public void setStaffByStaId(Staff staffByStaId) {
        this.staffByStaId = staffByStaId;
    }

    public Staff getStaffBySohStaffId() {
        return staffBySohStaffId;
    }

    public void setStaffBySohStaffId(Staff staffBySohStaffId) {
        this.staffBySohStaffId = staffBySohStaffId;
    }

    public Provider getProviderBySohProviderId() {
        return providerBySohProviderId;
    }

    public void setProviderBySohProviderId(Provider providerBySohProviderId) {
        this.providerBySohProviderId = providerBySohProviderId;
    }

    public Call4Bid getCall4BidBySohBidId() {
        return call4BidBySohBidId;
    }

    public void setCall4BidBySohBidId(Call4Bid call4BidBySohBidId) {
        this.call4BidBySohBidId = call4BidBySohBidId;
    }
}
