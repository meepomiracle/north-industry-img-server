package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class BasicInfo {
    private long biId;
    private String biCompAddr;
    private String biCompany;
    private String biDescription;
    private String biContact;
    private String biVersionNoAndroidPro;
    private String biVersionNoAndroidSta;
    private String biVersionNoIosPro;
    private String biVersionNoIosSta;
    private String biFax;
    private String biEmail;
    private String biQq;

    public long getBiId() {
        return biId;
    }

    public void setBiId(long biId) {
        this.biId = biId;
    }

    public String getBiCompAddr() {
        return biCompAddr;
    }

    public void setBiCompAddr(String biCompAddr) {
        this.biCompAddr = biCompAddr;
    }

    public String getBiCompany() {
        return biCompany;
    }

    public void setBiCompany(String biCompany) {
        this.biCompany = biCompany;
    }

    public String getBiDescription() {
        return biDescription;
    }

    public void setBiDescription(String biDescription) {
        this.biDescription = biDescription;
    }

    public String getBiContact() {
        return biContact;
    }

    public void setBiContact(String biContact) {
        this.biContact = biContact;
    }

    public String getBiVersionNoAndroidPro() {
        return biVersionNoAndroidPro;
    }

    public void setBiVersionNoAndroidPro(String biVersionNoAndroidPro) {
        this.biVersionNoAndroidPro = biVersionNoAndroidPro;
    }

    public String getBiVersionNoAndroidSta() {
        return biVersionNoAndroidSta;
    }

    public void setBiVersionNoAndroidSta(String biVersionNoAndroidSta) {
        this.biVersionNoAndroidSta = biVersionNoAndroidSta;
    }

    public String getBiVersionNoIosPro() {
        return biVersionNoIosPro;
    }

    public void setBiVersionNoIosPro(String biVersionNoIosPro) {
        this.biVersionNoIosPro = biVersionNoIosPro;
    }

    public String getBiVersionNoIosSta() {
        return biVersionNoIosSta;
    }

    public void setBiVersionNoIosSta(String biVersionNoIosSta) {
        this.biVersionNoIosSta = biVersionNoIosSta;
    }

    public String getBiFax() {
        return biFax;
    }

    public void setBiFax(String biFax) {
        this.biFax = biFax;
    }

    public String getBiEmail() {
        return biEmail;
    }

    public void setBiEmail(String biEmail) {
        this.biEmail = biEmail;
    }

    public String getBiQq() {
        return biQq;
    }

    public void setBiQq(String biQq) {
        this.biQq = biQq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasicInfo basicInfo = (BasicInfo) o;

        if (biId != basicInfo.biId) return false;
        if (biCompAddr != null ? !biCompAddr.equals(basicInfo.biCompAddr) : basicInfo.biCompAddr != null) return false;
        if (biCompany != null ? !biCompany.equals(basicInfo.biCompany) : basicInfo.biCompany != null) return false;
        if (biDescription != null ? !biDescription.equals(basicInfo.biDescription) : basicInfo.biDescription != null)
            return false;
        if (biContact != null ? !biContact.equals(basicInfo.biContact) : basicInfo.biContact != null) return false;
        if (biVersionNoAndroidPro != null ? !biVersionNoAndroidPro.equals(basicInfo.biVersionNoAndroidPro) :
                basicInfo.biVersionNoAndroidPro != null)
            return false;
        if (biVersionNoAndroidSta != null ? !biVersionNoAndroidSta.equals(basicInfo.biVersionNoAndroidSta) :
                basicInfo.biVersionNoAndroidSta != null)
            return false;
        if (biVersionNoIosPro != null ? !biVersionNoIosPro.equals(basicInfo.biVersionNoIosPro) : basicInfo
                .biVersionNoIosPro != null)
            return false;
        if (biVersionNoIosSta != null ? !biVersionNoIosSta.equals(basicInfo.biVersionNoIosSta) : basicInfo
                .biVersionNoIosSta != null)
            return false;
        if (biFax != null ? !biFax.equals(basicInfo.biFax) : basicInfo.biFax != null) return false;
        if (biEmail != null ? !biEmail.equals(basicInfo.biEmail) : basicInfo.biEmail != null) return false;
        if (biQq != null ? !biQq.equals(basicInfo.biQq) : basicInfo.biQq != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (biId ^ (biId >>> 32));
        result = 31 * result + (biCompAddr != null ? biCompAddr.hashCode() : 0);
        result = 31 * result + (biCompany != null ? biCompany.hashCode() : 0);
        result = 31 * result + (biDescription != null ? biDescription.hashCode() : 0);
        result = 31 * result + (biContact != null ? biContact.hashCode() : 0);
        result = 31 * result + (biVersionNoAndroidPro != null ? biVersionNoAndroidPro.hashCode() : 0);
        result = 31 * result + (biVersionNoAndroidSta != null ? biVersionNoAndroidSta.hashCode() : 0);
        result = 31 * result + (biVersionNoIosPro != null ? biVersionNoIosPro.hashCode() : 0);
        result = 31 * result + (biVersionNoIosSta != null ? biVersionNoIosSta.hashCode() : 0);
        result = 31 * result + (biFax != null ? biFax.hashCode() : 0);
        result = 31 * result + (biEmail != null ? biEmail.hashCode() : 0);
        result = 31 * result + (biQq != null ? biQq.hashCode() : 0);
        return result;
    }
}
