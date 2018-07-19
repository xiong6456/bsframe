package com.zero.pojo;

public class SysUser {
    private String fdId;

    private String fdName;

    private String fdPhone;

    private String fdIsAvailable;

    private String fdLoginName;

    private String fdPassword;

    private String fdSalt;

    private String fdLocked;

    private String fdDeptId;

    private String fdParentId;

    private String fdType;

    private String fdBak1;

    private String fdBak2;
    
    private String fdBak2Name;
    
    private String fdSysOrgDept;
    
	public String getFdSysOrgDept() {
		return fdSysOrgDept;
	}

	public void setFdSysOrgDept(String fdSysOrgDept) {
		this.fdSysOrgDept = fdSysOrgDept;
	}

	public String getFdId() {
        return fdId;
    }

    public void setFdId(String fdId) {
        this.fdId = fdId == null ? null : fdId.trim();
    }

    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName == null ? null : fdName.trim();
    }

    public String getFdPhone() {
        return fdPhone;
    }

    public void setFdPhone(String fdPhone) {
        this.fdPhone = fdPhone == null ? null : fdPhone.trim();
    }

    public String getFdIsAvailable() {
        return fdIsAvailable;
    }

    public void setFdIsAvailable(String fdIsAvailable) {
        this.fdIsAvailable = fdIsAvailable == null ? null : fdIsAvailable.trim();
    }

    public String getFdLoginName() {
        return fdLoginName;
    }

    public void setFdLoginName(String fdLoginName) {
        this.fdLoginName = fdLoginName == null ? null : fdLoginName.trim();
    }

    public String getFdPassword() {
        return fdPassword;
    }

    public void setFdPassword(String fdPassword) {
        this.fdPassword = fdPassword == null ? null : fdPassword.trim();
    }

    public String getFdSalt() {
        return fdSalt;
    }

    public void setFdSalt(String fdSalt) {
        this.fdSalt = fdSalt == null ? null : fdSalt.trim();
    }

    public String getFdLocked() {
        return fdLocked;
    }

    public void setFdLocked(String fdLocked) {
        this.fdLocked = fdLocked == null ? null : fdLocked.trim();
    }

    public String getFdDeptId() {
        return fdDeptId;
    }

    public void setFdDeptId(String fdDeptId) {
        this.fdDeptId = fdDeptId == null ? null : fdDeptId.trim();
    }

    public String getFdParentId() {
        return fdParentId;
    }

    public void setFdParentId(String fdParentId) {
        this.fdParentId = fdParentId == null ? null : fdParentId.trim();
    }

    public String getFdType() {
        return fdType;
    }

    public void setFdType(String fdType) {
        this.fdType = fdType == null ? null : fdType.trim();
    }

    public String getFdBak1() {
        return fdBak1;
    }

    public void setFdBak1(String fdBak1) {
        this.fdBak1 = fdBak1 == null ? null : fdBak1.trim();
    }

    public String getFdBak2() {
        return fdBak2;
    }

    public void setFdBak2(String fdBak2) {
        this.fdBak2 = fdBak2 == null ? null : fdBak2.trim();
    }

	public String getFdBak2Name() {
		return fdBak2Name;
	}

	public void setFdBak2Name(String fdBak2Name) {
		this.fdBak2Name = fdBak2Name;
	}
}