package com.zimug.bootlaunch.generator.testdb;

import java.io.Serializable;

/**
 * middle
 * @author 
 */
public class Middle implements Serializable {
    private Integer mAid;

    private Integer mPid;

    private static final long serialVersionUID = 1L;

    public Integer getmAid() {
        return mAid;
    }

    public void setmAid(Integer mAid) {
        this.mAid = mAid;
    }

    public Integer getmPid() {
        return mPid;
    }

    public void setmPid(Integer mPid) {
        this.mPid = mPid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Middle other = (Middle) that;
        return (this.getmAid() == null ? other.getmAid() == null : this.getmAid().equals(other.getmAid()))
            && (this.getmPid() == null ? other.getmPid() == null : this.getmPid().equals(other.getmPid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getmAid() == null) ? 0 : getmAid().hashCode());
        result = prime * result + ((getmPid() == null) ? 0 : getmPid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mAid=").append(mAid);
        sb.append(", mPid=").append(mPid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}