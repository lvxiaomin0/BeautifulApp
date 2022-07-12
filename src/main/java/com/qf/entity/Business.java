package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName business
 */
@TableName(value ="business")
@Data
public class Business implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 商家名称
     */
    private String busname;

    /**
     * 商家地址
     */
    private String busaddress;

    /**
     * 商家介绍
     */
    private String busexplain;

    /**
     * 商家电话
     */
    private String bustell;

    /**
     * 服务时间
     */
    private String servertime;

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
        Business other = (Business) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBusname() == null ? other.getBusname() == null : this.getBusname().equals(other.getBusname()))
            && (this.getBusaddress() == null ? other.getBusaddress() == null : this.getBusaddress().equals(other.getBusaddress()))
            && (this.getBusexplain() == null ? other.getBusexplain() == null : this.getBusexplain().equals(other.getBusexplain()))
            && (this.getBustell() == null ? other.getBustell() == null : this.getBustell().equals(other.getBustell()))
            && (this.getServertime() == null ? other.getServertime() == null : this.getServertime().equals(other.getServertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBusname() == null) ? 0 : getBusname().hashCode());
        result = prime * result + ((getBusaddress() == null) ? 0 : getBusaddress().hashCode());
        result = prime * result + ((getBusexplain() == null) ? 0 : getBusexplain().hashCode());
        result = prime * result + ((getBustell() == null) ? 0 : getBustell().hashCode());
        result = prime * result + ((getServertime() == null) ? 0 : getServertime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", busname=").append(busname);
        sb.append(", busaddress=").append(busaddress);
        sb.append(", busexplain=").append(busexplain);
        sb.append(", bustell=").append(bustell);
        sb.append(", servertime=").append(servertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}