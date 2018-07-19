package com.zero.pojo;

public class SysMenu {
    private String fdId;

    private String fdName;
    
    private String fdDescription;

    private String fdParentId;

    private Long fdChildCount;
    
    private String fdIsChild;

    private String fdRunScript;

    private Integer fdOrder;

    private String fdTerm;

    private String fdDueTime;
    
    private String fdIframe;

    private String fdState;

    private String fdCls;

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

    public String getFdParentId() {
        return fdParentId;
    }

    public void setFdParentId(String fdParentId) {
        this.fdParentId = fdParentId == null ? null : fdParentId.trim();
    }

    public Long getFdChildCount() {
        return fdChildCount;
    }

    public void setFdChildCount(Long fdChildCount) {
        this.fdChildCount = fdChildCount;
    }
    
    public String getFdIsChild() {
        return fdIsChild;
    }

    public void setFdIsChild(String fdIsChild) {
        this.fdIsChild = fdIsChild;
    }

    public String getFdRunScript() {
        return fdRunScript;
    }

    public void setFdRunScript(String fdRunScript) {
        this.fdRunScript = fdRunScript == null ? null : fdRunScript.trim();
    }

    public Integer getFdOrder() {
        return fdOrder;
    }

    public void setFdOrder(Integer fdOrder) {
        this.fdOrder = fdOrder;
    }

    public String getFdTerm() {
        return fdTerm;
    }

    public void setFdTerm(String fdTerm) {
        this.fdTerm = fdTerm == null ? null : fdTerm.trim();
    }

    public String getFdDueTime() {
        return fdDueTime;
    }

    public void setFdDueTime(String fdDueTime) {
        this.fdDueTime = fdDueTime == null ? null : fdDueTime.trim();
    }
    
    public String getFdIframe() {
        return fdIframe;
    }

    public void setFdIframe(String fdIframe) {
        this.fdIframe = fdIframe == null ? null : fdIframe.trim();
    }

    public String getFdState() {
        return fdState;
    }

    public void setFdState(String fdState) {
        this.fdState = fdState == null ? null : fdState.trim();
    }

    public String getFdCls() {
        return fdCls;
    }

    public void setFdCls(String fdCls) {
        this.fdCls = fdCls == null ? null : fdCls.trim();
    }
}