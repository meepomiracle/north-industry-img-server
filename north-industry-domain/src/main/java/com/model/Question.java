package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class Question {
    private long quId;
    private String quTitle;
    private String quContent;
    private Long quDate;
    private Provider providerByProId;

    public long getQuId() {
        return quId;
    }

    public void setQuId(long quId) {
        this.quId = quId;
    }

    public String getQuTitle() {
        return quTitle;
    }

    public void setQuTitle(String quTitle) {
        this.quTitle = quTitle;
    }

    public String getQuContent() {
        return quContent;
    }

    public void setQuContent(String quContent) {
        this.quContent = quContent;
    }

    public Long getQuDate() {
        return quDate;
    }

    public void setQuDate(Long quDate) {
        this.quDate = quDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question = (Question) o;

        if (quId != question.quId) return false;
        if (quTitle != null ? !quTitle.equals(question.quTitle) : question.quTitle != null) return false;
        if (quContent != null ? !quContent.equals(question.quContent) : question.quContent != null) return false;
        if (quDate != null ? !quDate.equals(question.quDate) : question.quDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (quId ^ (quId >>> 32));
        result = 31 * result + (quTitle != null ? quTitle.hashCode() : 0);
        result = 31 * result + (quContent != null ? quContent.hashCode() : 0);
        result = 31 * result + (quDate != null ? quDate.hashCode() : 0);
        return result;
    }

    public Provider getProviderByProId() {
        return providerByProId;
    }

    public void setProviderByProId(Provider providerByProId) {
        this.providerByProId = providerByProId;
    }
}
