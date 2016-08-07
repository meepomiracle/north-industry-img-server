package com.model;

/**
 * Created by hadoop on 2016/8/7.
 */
public class Staff {
    private long staId;
    private String staName;
    private String staGender;
    private Long staEntryTime;
    private String staRoleType;
    private String staAccout;
    private String staContact;
    private String staPassword;
    private String staMajor;
    private String staAvatar;
    private String staEmail;
    private boolean staValid;
    private String staToken;
    private Long staExpire;
    private CategoryConfDepartment categoryConfDepartmentByDepId;
    private CategoryConfCompany categoryConfCompanyByCompanyId;

    public long getStaId() {
        return staId;
    }

    public void setStaId(long staId) {
        this.staId = staId;
    }

    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName;
    }

    public String getStaGender() {
        return staGender;
    }

    public void setStaGender(String staGender) {
        this.staGender = staGender;
    }

    public Long getStaEntryTime() {
        return staEntryTime;
    }

    public void setStaEntryTime(Long staEntryTime) {
        this.staEntryTime = staEntryTime;
    }

    public String getStaRoleType() {
        return staRoleType;
    }

    public void setStaRoleType(String staRoleType) {
        this.staRoleType = staRoleType;
    }

    public String getStaAccout() {
        return staAccout;
    }

    public void setStaAccout(String staAccout) {
        this.staAccout = staAccout;
    }

    public String getStaContact() {
        return staContact;
    }

    public void setStaContact(String staContact) {
        this.staContact = staContact;
    }

    public String getStaPassword() {
        return staPassword;
    }

    public void setStaPassword(String staPassword) {
        this.staPassword = staPassword;
    }

    public String getStaMajor() {
        return staMajor;
    }

    public void setStaMajor(String staMajor) {
        this.staMajor = staMajor;
    }

    public String getStaAvatar() {
        return staAvatar;
    }

    public void setStaAvatar(String staAvatar) {
        this.staAvatar = staAvatar;
    }

    public String getStaEmail() {
        return staEmail;
    }

    public void setStaEmail(String staEmail) {
        this.staEmail = staEmail;
    }

    public boolean isStaValid() {
        return staValid;
    }

    public void setStaValid(boolean staValid) {
        this.staValid = staValid;
    }

    public String getStaToken() {
        return staToken;
    }

    public void setStaToken(String staToken) {
        this.staToken = staToken;
    }

    public Long getStaExpire() {
        return staExpire;
    }

    public void setStaExpire(Long staExpire) {
        this.staExpire = staExpire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staff staff = (Staff) o;

        if (staId != staff.staId) return false;
        if (staValid != staff.staValid) return false;
        if (staName != null ? !staName.equals(staff.staName) : staff.staName != null) return false;
        if (staGender != null ? !staGender.equals(staff.staGender) : staff.staGender != null) return false;
        if (staEntryTime != null ? !staEntryTime.equals(staff.staEntryTime) : staff.staEntryTime != null) return false;
        if (staRoleType != null ? !staRoleType.equals(staff.staRoleType) : staff.staRoleType != null) return false;
        if (staAccout != null ? !staAccout.equals(staff.staAccout) : staff.staAccout != null) return false;
        if (staContact != null ? !staContact.equals(staff.staContact) : staff.staContact != null) return false;
        if (staPassword != null ? !staPassword.equals(staff.staPassword) : staff.staPassword != null) return false;
        if (staMajor != null ? !staMajor.equals(staff.staMajor) : staff.staMajor != null) return false;
        if (staAvatar != null ? !staAvatar.equals(staff.staAvatar) : staff.staAvatar != null) return false;
        if (staEmail != null ? !staEmail.equals(staff.staEmail) : staff.staEmail != null) return false;
        if (staToken != null ? !staToken.equals(staff.staToken) : staff.staToken != null) return false;
        if (staExpire != null ? !staExpire.equals(staff.staExpire) : staff.staExpire != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (staId ^ (staId >>> 32));
        result = 31 * result + (staName != null ? staName.hashCode() : 0);
        result = 31 * result + (staGender != null ? staGender.hashCode() : 0);
        result = 31 * result + (staEntryTime != null ? staEntryTime.hashCode() : 0);
        result = 31 * result + (staRoleType != null ? staRoleType.hashCode() : 0);
        result = 31 * result + (staAccout != null ? staAccout.hashCode() : 0);
        result = 31 * result + (staContact != null ? staContact.hashCode() : 0);
        result = 31 * result + (staPassword != null ? staPassword.hashCode() : 0);
        result = 31 * result + (staMajor != null ? staMajor.hashCode() : 0);
        result = 31 * result + (staAvatar != null ? staAvatar.hashCode() : 0);
        result = 31 * result + (staEmail != null ? staEmail.hashCode() : 0);
        result = 31 * result + (staValid ? 1 : 0);
        result = 31 * result + (staToken != null ? staToken.hashCode() : 0);
        result = 31 * result + (staExpire != null ? staExpire.hashCode() : 0);
        return result;
    }

    public CategoryConfDepartment getCategoryConfDepartmentByDepId() {
        return categoryConfDepartmentByDepId;
    }

    public void setCategoryConfDepartmentByDepId(CategoryConfDepartment categoryConfDepartmentByDepId) {
        this.categoryConfDepartmentByDepId = categoryConfDepartmentByDepId;
    }

    public CategoryConfCompany getCategoryConfCompanyByCompanyId() {
        return categoryConfCompanyByCompanyId;
    }

    public void setCategoryConfCompanyByCompanyId(CategoryConfCompany categoryConfCompanyByCompanyId) {
        this.categoryConfCompanyByCompanyId = categoryConfCompanyByCompanyId;
    }
}
