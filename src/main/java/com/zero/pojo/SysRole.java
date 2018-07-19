package com.zero.pojo;

public class SysRole {
    private String fdId;

    private String fdCode;

    private String fdName;

    private String fdDescription;

    private String fdAvailable;

    private Integer fdOrder;

    public String getFdId() {
        return fdId;
    }

    public void setFdId(String fdId) {
        this.fdId = fdId == null ? null : fdId.trim();
    }

    public String getFdCode() {
        return fdCode;
    }

    public void setFdCode(String fdCode) {
        this.fdCode = fdCode == null ? null : fdCode.trim();
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

    public String getFdAvailable() {
        return fdAvailable;
    }

    public void setFdAvailable(String fdAvailable) {
        this.fdAvailable = fdAvailable == null ? null : fdAvailable.trim();
    }

    public Integer getFdOrder() {
        return fdOrder;
    }

    public void setFdOrder(Integer fdOrder) {
        this.fdOrder = fdOrder;
    }
}