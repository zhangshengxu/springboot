package com.zimug.bootlaunch.generator.testdb;

import java.io.Serializable;

/**
 * comment
 * @author 
 */
public class Comment implements Serializable {
    private Integer cmid;

    private String comment;

    private String nickname;

    private String tonickname;

    private static final long serialVersionUID = 1L;

    public Integer getCmid() {
        return cmid;
    }

    public void setCmid(Integer cmid) {
        this.cmid = cmid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTonickname() {
        return tonickname;
    }

    public void setTonickname(String tonickname) {
        this.tonickname = tonickname;
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
        Comment other = (Comment) that;
        return (this.getCmid() == null ? other.getCmid() == null : this.getCmid().equals(other.getCmid()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getTonickname() == null ? other.getTonickname() == null : this.getTonickname().equals(other.getTonickname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCmid() == null) ? 0 : getCmid().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getTonickname() == null) ? 0 : getTonickname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cmid=").append(cmid);
        sb.append(", comment=").append(comment);
        sb.append(", nickname=").append(nickname);
        sb.append(", tonickname=").append(tonickname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}