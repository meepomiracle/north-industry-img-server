package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class StaffPersonalMessage {
    private long id;
    private Integer msgType;
    private String msgState;
    private Product productByProductId;
    private Provider providerByProviderId;
    private Staff staffByStaffId;
    private Call4Bid call4BidByBidId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public String getMsgState() {
        return msgState;
    }

    public void setMsgState(String msgState) {
        this.msgState = msgState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StaffPersonalMessage that = (StaffPersonalMessage) o;

        if (id != that.id) return false;
        if (msgType != null ? !msgType.equals(that.msgType) : that.msgType != null) return false;
        if (msgState != null ? !msgState.equals(that.msgState) : that.msgState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (msgType != null ? msgType.hashCode() : 0);
        result = 31 * result + (msgState != null ? msgState.hashCode() : 0);
        return result;
    }

    public Product getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(Product productByProductId) {
        this.productByProductId = productByProductId;
    }

    public Provider getProviderByProviderId() {
        return providerByProviderId;
    }

    public void setProviderByProviderId(Provider providerByProviderId) {
        this.providerByProviderId = providerByProviderId;
    }

    public Staff getStaffByStaffId() {
        return staffByStaffId;
    }

    public void setStaffByStaffId(Staff staffByStaffId) {
        this.staffByStaffId = staffByStaffId;
    }

    public Call4Bid getCall4BidByBidId() {
        return call4BidByBidId;
    }

    public void setCall4BidByBidId(Call4Bid call4BidByBidId) {
        this.call4BidByBidId = call4BidByBidId;
    }
}
