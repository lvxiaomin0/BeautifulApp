package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName project
 */
@TableName(value ="project")
@Data
public class Project implements Serializable {
    /**
     * 项目id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 项目介绍
     */
    private String proexplain;

    /**
     * 项目价格
     */
    private Double proprice;

    /**
     * 项目步骤
     */
    private String prostep;

    /**
     * 关联项目类型id
     */
    private Long protypeid;

    /**
     * 项目名称
     */
    private String proname;

    /**
     * 关联图片id
     */
    private Long imageid;

    /**
     * 项目状态
     */
    private String prostatus;

    /**
     * 关联公司id
     */
    private Long busid;

    /**
     * 
     */
    private Long tecid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
        Project other = (Project) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProexplain() == null ? other.getProexplain() == null : this.getProexplain().equals(other.getProexplain()))
            && (this.getProprice() == null ? other.getProprice() == null : this.getProprice().equals(other.getProprice()))
            && (this.getProstep() == null ? other.getProstep() == null : this.getProstep().equals(other.getProstep()))
            && (this.getProtypeid() == null ? other.getProtypeid() == null : this.getProtypeid().equals(other.getProtypeid()))
            && (this.getProname() == null ? other.getProname() == null : this.getProname().equals(other.getProname()))
            && (this.getImageid() == null ? other.getImageid() == null : this.getImageid().equals(other.getImageid()))
            && (this.getProstatus() == null ? other.getProstatus() == null : this.getProstatus().equals(other.getProstatus()))
            && (this.getBusid() == null ? other.getBusid() == null : this.getBusid().equals(other.getBusid()))
            && (this.getTecid() == null ? other.getTecid() == null : this.getTecid().equals(other.getTecid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProexplain() == null) ? 0 : getProexplain().hashCode());
        result = prime * result + ((getProprice() == null) ? 0 : getProprice().hashCode());
        result = prime * result + ((getProstep() == null) ? 0 : getProstep().hashCode());
        result = prime * result + ((getProtypeid() == null) ? 0 : getProtypeid().hashCode());
        result = prime * result + ((getProname() == null) ? 0 : getProname().hashCode());
        result = prime * result + ((getImageid() == null) ? 0 : getImageid().hashCode());
        result = prime * result + ((getProstatus() == null) ? 0 : getProstatus().hashCode());
        result = prime * result + ((getBusid() == null) ? 0 : getBusid().hashCode());
        result = prime * result + ((getTecid() == null) ? 0 : getTecid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", proexplain=").append(proexplain);
        sb.append(", proprice=").append(proprice);
        sb.append(", prostep=").append(prostep);
        sb.append(", protypeid=").append(protypeid);
        sb.append(", proname=").append(proname);
        sb.append(", imageid=").append(imageid);
        sb.append(", prostatus=").append(prostatus);
        sb.append(", busid=").append(busid);
        sb.append(", tecid=").append(tecid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}