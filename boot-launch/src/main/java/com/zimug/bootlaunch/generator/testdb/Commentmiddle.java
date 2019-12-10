package com.zimug.bootlaunch.generator.testdb;

import java.io.Serializable;

/**
 * commentmiddle
 * @author 
 */
public class Commentmiddle implements Serializable {
    private Integer cmAid;

    private Integer cmMid;

    private static final long serialVersionUID = 1L;

    public Integer getCmAid() {
        return cmAid;
    }

    public void setCmAid(Integer cmAid) {
        this.cmAid = cmAid;
    }

    public Integer getCmMid() {
        return cmMid;
    }

    public void setCmMid(Integer cmMid) {
        this.cmMid = cmMid;
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
        Commentmiddle other = (Commentmiddle) that;
        return (this.getCmAid() == null ? other.getCmAid() == null : this.getCmAid().equals(other.getCmAid()))
            && (this.getCmMid() == null ? other.getCmMid() == null : this.getCmMid().equals(other.getCmMid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCmAid() == null) ? 0 : getCmAid().hashCode());
        result = prime * result + ((getCmMid() == null) ? 0 : getCmMid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cmAid=").append(cmAid);
        sb.append(", cmMid=").append(cmMid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}