package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class SystemNotification {
    private long sysnId;
    private String sysnContent;
    private Long sysnDate;

    public long getSysnId() {
        return sysnId;
    }

    public void setSysnId(long sysnId) {
        this.sysnId = sysnId;
    }

    public String getSysnContent() {
        return sysnContent;
    }

    public void setSysnContent(String sysnContent) {
        this.sysnContent = sysnContent;
    }

    public Long getSysnDate() {
        return sysnDate;
    }

    public void setSysnDate(Long sysnDate) {
        this.sysnDate = sysnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemNotification that = (SystemNotification) o;

        if (sysnId != that.sysnId) return false;
        if (sysnContent != null ? !sysnContent.equals(that.sysnContent) : that.sysnContent != null) return false;
        if (sysnDate != null ? !sysnDate.equals(that.sysnDate) : that.sysnDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (sysnId ^ (sysnId >>> 32));
        result = 31 * result + (sysnContent != null ? sysnContent.hashCode() : 0);
        result = 31 * result + (sysnDate != null ? sysnDate.hashCode() : 0);
        return result;
    }
}
