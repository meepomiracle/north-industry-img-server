package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class BidRecord {
    private long brId;
    private String brBidPaperUrl;
    private String brBidPaperName;
    private Long brBidDate;
    private Integer brBidStatus;
    private Integer brLocked;

    public long getBrId() {
        return brId;
    }

    public void setBrId(long brId) {
        this.brId = brId;
    }

    public String getBrBidPaperUrl() {
        return brBidPaperUrl;
    }

    public void setBrBidPaperUrl(String brBidPaperUrl) {
        this.brBidPaperUrl = brBidPaperUrl;
    }

    public String getBrBidPaperName() {
        return brBidPaperName;
    }

    public void setBrBidPaperName(String brBidPaperName) {
        this.brBidPaperName = brBidPaperName;
    }

    public Long getBrBidDate() {
        return brBidDate;
    }

    public void setBrBidDate(Long brBidDate) {
        this.brBidDate = brBidDate;
    }

    public Integer getBrBidStatus() {
        return brBidStatus;
    }

    public void setBrBidStatus(Integer brBidStatus) {
        this.brBidStatus = brBidStatus;
    }

    public Integer getBrLocked() {
        return brLocked;
    }

    public void setBrLocked(Integer brLocked) {
        this.brLocked = brLocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BidRecord bidRecord = (BidRecord) o;

        if (brId != bidRecord.brId) return false;
        if (brBidPaperUrl != null ? !brBidPaperUrl.equals(bidRecord.brBidPaperUrl) : bidRecord.brBidPaperUrl != null)
            return false;
        if (brBidPaperName != null ? !brBidPaperName.equals(bidRecord.brBidPaperName) : bidRecord.brBidPaperName !=
                null)
            return false;
        if (brBidDate != null ? !brBidDate.equals(bidRecord.brBidDate) : bidRecord.brBidDate != null) return false;
        if (brBidStatus != null ? !brBidStatus.equals(bidRecord.brBidStatus) : bidRecord.brBidStatus != null)
            return false;
        if (brLocked != null ? !brLocked.equals(bidRecord.brLocked) : bidRecord.brLocked != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (brId ^ (brId >>> 32));
        result = 31 * result + (brBidPaperUrl != null ? brBidPaperUrl.hashCode() : 0);
        result = 31 * result + (brBidPaperName != null ? brBidPaperName.hashCode() : 0);
        result = 31 * result + (brBidDate != null ? brBidDate.hashCode() : 0);
        result = 31 * result + (brBidStatus != null ? brBidStatus.hashCode() : 0);
        result = 31 * result + (brLocked != null ? brLocked.hashCode() : 0);
        return result;
    }
}
