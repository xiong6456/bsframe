package com.zero.pojo;

public class SysPermission {
    private String fdId;

    private String fdName;

    private String fdDescription;

    private String fdType;

    private String fdUrl;

    private String fdPercode;

    private String fdParentId;

    private String fdParentIds;

    private Integer fdOrder;

    private String fdAvailable;

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

    public String getFdDescription() {
        return fdDescription;
    }

    public void setFdDescription(String fdDescription) {
        this.fdDescription = fdDescription == null ? null : fdDescription.trim();
    }

    public String getFdType() {
        return fdType;
    }

    public void setFdType(String fdType) {
        this.fdType = fdType == null ? null : fdType.trim();
    }

    public String getFdUrl() {
        return fdUrl;
    }

    public void setFdUrl(String fdUrl) {
        this.fdUrl = fdUrl == null ? null : fdUrl.trim();
    }

    public String getFdPercode() {
        return fdPercode;
    }

    public void setFdPercode(String fdPercode) {
        this.fdPercode = fdPercode == null ? null : fdPercode.trim();
    }

    public String getFdParentId() {
        return fdParentId;
    }

    public void setFdParentId(String fdParentId) {
        this.fdParentId = fdParentId == null ? null : fdParentId.trim();
    }

    public String getFdParentIds() {
        return fdParentIds;
    }

    public void setFdParentIds(String fdParentIds) {
        this.fdParentIds = fdParentIds == null ? null : fdParentIds.trim();
    }

    public Integer getFdOrder() {
        return fdOrder;
    }

    public void setFdOrder(Integer fdOrder) {
        this.fdOrder = fdOrder;
    }

    public String getFdAvailable() {
        return fdAvailable;
    }

    public void setFdAvailable(String fdAvailable) {
        this.fdAvailable = fdAvailable == null ? null : fdAvailable.trim();
    }
}