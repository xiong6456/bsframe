package com.zero.pojo;

public class SysUserRole {
    private String fdId;

    private String fdUserId;

    private String fdRoleId;

    public String getFdId() {
        return fdId;
    }

    public void setFdId(String fdId) {
        this.fdId = fdId == null ? null : fdId.trim();
    }

    public String getFdUserId() {
        return fdUserId;
    }

    public void setFdUserId(String fdUserId) {
        this.fdUserId = fdUserId == null ? null : fdUserId.trim();
    }

    public String getFdRoleId() {
        return fdRoleId;
    }

    public void setFdRoleId(String fdRoleId) {
        this.fdRoleId = fdRoleId == null ? null : fdRoleId.trim();
    }
}