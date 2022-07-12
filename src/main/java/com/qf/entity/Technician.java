package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName technician
 */
@TableName(value ="technician")
@Data
public class Technician implements Serializable {
    /**
     * 技师id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 技师简介
     */
    private String techexplain;

    /**
     * 技师姓名
     */
    private String techname;

    /**
     * 关联商家id
     */
    private Long busid;

    /**
     * 技师头像路径
     */
    private String imageurl;

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
        Technician other = (Technician) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTechexplain() == null ? other.getTechexplain() == null : this.getTechexplain().equals(other.getTechexplain()))
            && (this.getTechname() == null ? other.getTechname() == null : this.getTechname().equals(other.getTechname()))
            && (this.getBusid() == null ? other.getBusid() == null : this.getBusid().equals(other.getBusid()))
            && (this.getImageurl() == null ? other.getImageurl() == null : this.getImageurl().equals(other.getImageurl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTechexplain() == null) ? 0 : getTechexplain().hashCode());
        result = prime * result + ((getTechname() == null) ? 0 : getTechname().hashCode());
        result = prime * result + ((getBusid() == null) ? 0 : getBusid().hashCode());
        result = prime * result + ((getImageurl() == null) ? 0 : getImageurl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", techexplain=").append(techexplain);
        sb.append(", techname=").append(techname);
        sb.append(", busid=").append(busid);
        sb.append(", imageurl=").append(imageurl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}