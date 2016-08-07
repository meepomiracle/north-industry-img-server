package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class Answer {
    private long anId;
    private String anContent;
    private Long anDate;

    public long getAnId() {
        return anId;
    }

    public void setAnId(long anId) {
        this.anId = anId;
    }

    public String getAnContent() {
        return anContent;
    }

    public void setAnContent(String anContent) {
        this.anContent = anContent;
    }

    public Long getAnDate() {
        return anDate;
    }

    public void setAnDate(Long anDate) {
        this.anDate = anDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Answer answer = (Answer) o;

        if (anId != answer.anId) return false;
        if (anContent != null ? !anContent.equals(answer.anContent) : answer.anContent != null) return false;
        if (anDate != null ? !anDate.equals(answer.anDate) : answer.anDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (anId ^ (anId >>> 32));
        result = 31 * result + (anContent != null ? anContent.hashCode() : 0);
        result = 31 * result + (anDate != null ? anDate.hashCode() : 0);
        return result;
    }
}
