package com.zero.pojo;

public class SysRolePermission {
    private String fdId;

    private String fdRoleId;

    private String fdPermissionId;

    public String getFdId() {
        return fdId;
    }

    public void setFdId(String fdId) {
        this.fdId = fdId == null ? null : fdId.trim();
    }

    public String getFdRoleId() {
        return fdRoleId;
    }

    public void setFdRoleId(String fdRoleId) {
        this.fdRoleId = fdRoleId == null ? null : fdRoleId.trim();
    }

    public String getFdPermissionId() {
        return fdPermissionId;
    }

    public void setFdPermissionId(String fdPermissionId) {
        this.fdPermissionId = fdPermissionId == null ? null : fdPermissionId.trim();
    }
}