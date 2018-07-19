package com.zero.pojo;

import com.zero.pojo.sys.SysCode;

public class SysOrgDept {
    private String fdId;

    private String fdName;

    private String fdType;

    private String fdParentId;

    private String fdMajorId;

    private String fdMinorId;
    
    private String fdMajorName;

    private String fdMinorName;

    private String fdChildCount;

    private Integer fdOrder;

    private String fdBak1;

    private String fdBak2;
    
    private SysCode fdSysCode;
    
    private SysUser fdMajor;
    
    private SysUser fdMinor;

    public SysCode getFdSysCode() {
		return fdSysCode;
	}

	public void setFdSysCode(SysCode fdSysCode) {
		this.fdSysCode = fdSysCode;
	}

	public SysUser getFdMajor() {
		return fdMajor;
	}

	public void setFdMajor(SysUser fdMajor) {
		this.fdMajor = fdMajor;
	}

	public SysUser getFdMinor() {
		return fdMinor;
	}

	public void setFdMinor(SysUser fdMinor) {
		this.fdMinor = fdMinor;
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

    public String getFdType() {
        return fdType;
    }

    public void setFdType(String fdType) {
        this.fdType = fdType == null ? null : fdType.trim();
    }

    public String getFdParentId() {
        return fdParentId;
    }

    public void setFdParentId(String fdParentId) {
        this.fdParentId = fdParentId == null ? null : fdParentId.trim();
    }

    public String getFdMajorId() {
        return fdMajorId;
    }

    public void setFdMajorId(String fdMajorId) {
        this.fdMajorId = fdMajorId == null ? null : fdMajorId.trim();
    }

    public String getFdMinorId() {
        return fdMinorId;
    }

    public void setFdMinorId(String fdMinorId) {
        this.fdMinorId = fdMinorId == null ? null : fdMinorId.trim();
    }

    public String getFdChildCount() {
        return fdChildCount;
    }

    public void setFdChildCount(String fdChildCount) {
        this.fdChildCount = fdChildCount == null ? null : fdChildCount.trim();
    }

    public Integer getFdOrder() {
        return fdOrder;
    }

    public void setFdOrder(Integer fdOrder) {
        this.fdOrder = fdOrder;
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

	public String getFdMajorName() {
		return fdMajorName;
	}

	public void setFdMajorName(String fdMajorName) {
		this.fdMajorName = fdMajorName;
	}

	public String getFdMinorName() {
		return fdMinorName;
	}

	public void setFdMinorName(String fdMinorName) {
		this.fdMinorName = fdMinorName;
	}
}