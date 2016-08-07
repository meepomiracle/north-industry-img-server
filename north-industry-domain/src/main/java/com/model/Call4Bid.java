package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class Call4Bid {
    private long cbId;
    private String cbSummary;
    private String cbTitle;
    private Long cbBidStartDate;
    private Long cbBidEndDate;
    private Long cbAudit1Date;
    private Long cbAudit3Date;
    private Long cbAudit2Date;
    private Long cbPublishBidedDate;
    private Long cbLaunchDate;
    private String cbWinNumber;
    private String cbContentBided;
    private String cbContentBiding;
    private String cbAttachmentDesc;
    private String cbAttachmentUrll;
    private String cbState;
    private String cbCheckState;
    private Long cdBidSelected;
    private Boolean cbCheckByExpert;
    private Long cbLastModifiedDate;

    public long getCbId() {
        return cbId;
    }

    public void setCbId(long cbId) {
        this.cbId = cbId;
    }

    public String getCbSummary() {
        return cbSummary;
    }

    public void setCbSummary(String cbSummary) {
        this.cbSummary = cbSummary;
    }

    public String getCbTitle() {
        return cbTitle;
    }

    public void setCbTitle(String cbTitle) {
        this.cbTitle = cbTitle;
    }

    public Long getCbBidStartDate() {
        return cbBidStartDate;
    }

    public void setCbBidStartDate(Long cbBidStartDate) {
        this.cbBidStartDate = cbBidStartDate;
    }

    public Long getCbBidEndDate() {
        return cbBidEndDate;
    }

    public void setCbBidEndDate(Long cbBidEndDate) {
        this.cbBidEndDate = cbBidEndDate;
    }

    public Long getCbAudit1Date() {
        return cbAudit1Date;
    }

    public void setCbAudit1Date(Long cbAudit1Date) {
        this.cbAudit1Date = cbAudit1Date;
    }

    public Long getCbAudit3Date() {
        return cbAudit3Date;
    }

    public void setCbAudit3Date(Long cbAudit3Date) {
        this.cbAudit3Date = cbAudit3Date;
    }

    public Long getCbAudit2Date() {
        return cbAudit2Date;
    }

    public void setCbAudit2Date(Long cbAudit2Date) {
        this.cbAudit2Date = cbAudit2Date;
    }

    public Long getCbPublishBidedDate() {
        return cbPublishBidedDate;
    }

    public void setCbPublishBidedDate(Long cbPublishBidedDate) {
        this.cbPublishBidedDate = cbPublishBidedDate;
    }

    public Long getCbLaunchDate() {
        return cbLaunchDate;
    }

    public void setCbLaunchDate(Long cbLaunchDate) {
        this.cbLaunchDate = cbLaunchDate;
    }

    public String getCbWinNumber() {
        return cbWinNumber;
    }

    public void setCbWinNumber(String cbWinNumber) {
        this.cbWinNumber = cbWinNumber;
    }

    public String getCbContentBided() {
        return cbContentBided;
    }

    public void setCbContentBided(String cbContentBided) {
        this.cbContentBided = cbContentBided;
    }

    public String getCbContentBiding() {
        return cbContentBiding;
    }

    public void setCbContentBiding(String cbContentBiding) {
        this.cbContentBiding = cbContentBiding;
    }

    public String getCbAttachmentDesc() {
        return cbAttachmentDesc;
    }

    public void setCbAttachmentDesc(String cbAttachmentDesc) {
        this.cbAttachmentDesc = cbAttachmentDesc;
    }

    public String getCbAttachmentUrll() {
        return cbAttachmentUrll;
    }

    public void setCbAttachmentUrll(String cbAttachmentUrll) {
        this.cbAttachmentUrll = cbAttachmentUrll;
    }

    public String getCbState() {
        return cbState;
    }

    public void setCbState(String cbState) {
        this.cbState = cbState;
    }

    public String getCbCheckState() {
        return cbCheckState;
    }

    public void setCbCheckState(String cbCheckState) {
        this.cbCheckState = cbCheckState;
    }

    public Long getCdBidSelected() {
        return cdBidSelected;
    }

    public void setCdBidSelected(Long cdBidSelected) {
        this.cdBidSelected = cdBidSelected;
    }

    public Boolean getCbCheckByExpert() {
        return cbCheckByExpert;
    }

    public void setCbCheckByExpert(Boolean cbCheckByExpert) {
        this.cbCheckByExpert = cbCheckByExpert;
    }

    public Long getCbLastModifiedDate() {
        return cbLastModifiedDate;
    }

    public void setCbLastModifiedDate(Long cbLastModifiedDate) {
        this.cbLastModifiedDate = cbLastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Call4Bid call4Bid = (Call4Bid) o;

        if (cbId != call4Bid.cbId) return false;
        if (cbSummary != null ? !cbSummary.equals(call4Bid.cbSummary) : call4Bid.cbSummary != null) return false;
        if (cbTitle != null ? !cbTitle.equals(call4Bid.cbTitle) : call4Bid.cbTitle != null) return false;
        if (cbBidStartDate != null ? !cbBidStartDate.equals(call4Bid.cbBidStartDate) : call4Bid.cbBidStartDate != null)
            return false;
        if (cbBidEndDate != null ? !cbBidEndDate.equals(call4Bid.cbBidEndDate) : call4Bid.cbBidEndDate != null)
            return false;
        if (cbAudit1Date != null ? !cbAudit1Date.equals(call4Bid.cbAudit1Date) : call4Bid.cbAudit1Date != null)
            return false;
        if (cbAudit3Date != null ? !cbAudit3Date.equals(call4Bid.cbAudit3Date) : call4Bid.cbAudit3Date != null)
            return false;
        if (cbAudit2Date != null ? !cbAudit2Date.equals(call4Bid.cbAudit2Date) : call4Bid.cbAudit2Date != null)
            return false;
        if (cbPublishBidedDate != null ? !cbPublishBidedDate.equals(call4Bid.cbPublishBidedDate) : call4Bid
                .cbPublishBidedDate != null)
            return false;
        if (cbLaunchDate != null ? !cbLaunchDate.equals(call4Bid.cbLaunchDate) : call4Bid.cbLaunchDate != null)
            return false;
        if (cbWinNumber != null ? !cbWinNumber.equals(call4Bid.cbWinNumber) : call4Bid.cbWinNumber != null)
            return false;
        if (cbContentBided != null ? !cbContentBided.equals(call4Bid.cbContentBided) : call4Bid.cbContentBided != null)
            return false;
        if (cbContentBiding != null ? !cbContentBiding.equals(call4Bid.cbContentBiding) : call4Bid.cbContentBiding !=
                null)
            return false;
        if (cbAttachmentDesc != null ? !cbAttachmentDesc.equals(call4Bid.cbAttachmentDesc) : call4Bid
                .cbAttachmentDesc != null)
            return false;
        if (cbAttachmentUrll != null ? !cbAttachmentUrll.equals(call4Bid.cbAttachmentUrll) : call4Bid
                .cbAttachmentUrll != null)
            return false;
        if (cbState != null ? !cbState.equals(call4Bid.cbState) : call4Bid.cbState != null) return false;
        if (cbCheckState != null ? !cbCheckState.equals(call4Bid.cbCheckState) : call4Bid.cbCheckState != null)
            return false;
        if (cdBidSelected != null ? !cdBidSelected.equals(call4Bid.cdBidSelected) : call4Bid.cdBidSelected != null)
            return false;
        if (cbCheckByExpert != null ? !cbCheckByExpert.equals(call4Bid.cbCheckByExpert) : call4Bid.cbCheckByExpert !=
                null)
            return false;
        if (cbLastModifiedDate != null ? !cbLastModifiedDate.equals(call4Bid.cbLastModifiedDate) : call4Bid
                .cbLastModifiedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cbId ^ (cbId >>> 32));
        result = 31 * result + (cbSummary != null ? cbSummary.hashCode() : 0);
        result = 31 * result + (cbTitle != null ? cbTitle.hashCode() : 0);
        result = 31 * result + (cbBidStartDate != null ? cbBidStartDate.hashCode() : 0);
        result = 31 * result + (cbBidEndDate != null ? cbBidEndDate.hashCode() : 0);
        result = 31 * result + (cbAudit1Date != null ? cbAudit1Date.hashCode() : 0);
        result = 31 * result + (cbAudit3Date != null ? cbAudit3Date.hashCode() : 0);
        result = 31 * result + (cbAudit2Date != null ? cbAudit2Date.hashCode() : 0);
        result = 31 * result + (cbPublishBidedDate != null ? cbPublishBidedDate.hashCode() : 0);
        result = 31 * result + (cbLaunchDate != null ? cbLaunchDate.hashCode() : 0);
        result = 31 * result + (cbWinNumber != null ? cbWinNumber.hashCode() : 0);
        result = 31 * result + (cbContentBided != null ? cbContentBided.hashCode() : 0);
        result = 31 * result + (cbContentBiding != null ? cbContentBiding.hashCode() : 0);
        result = 31 * result + (cbAttachmentDesc != null ? cbAttachmentDesc.hashCode() : 0);
        result = 31 * result + (cbAttachmentUrll != null ? cbAttachmentUrll.hashCode() : 0);
        result = 31 * result + (cbState != null ? cbState.hashCode() : 0);
        result = 31 * result + (cbCheckState != null ? cbCheckState.hashCode() : 0);
        result = 31 * result + (cdBidSelected != null ? cdBidSelected.hashCode() : 0);
        result = 31 * result + (cbCheckByExpert != null ? cbCheckByExpert.hashCode() : 0);
        result = 31 * result + (cbLastModifiedDate != null ? cbLastModifiedDate.hashCode() : 0);
        return result;
    }
}
