package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName order
 */
@TableName(value ="order")
@Data
public class Order implements Serializable {
    /**
     * 订单id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 关联user表的openId
     */
    private String openid;

    /**
     * 项目名称
     */
    private String proname;

    /**
     * 预约时间
     */
    private Date makedate;

    /**
     * 预约客户姓名
     */
    private String username;

    /**
     * 预约状态
     */
    private String orderstate;

    /**
     * 下单时间
     */
    private Date placedate;

    /**
     * 手机号
     */
    private String usertell;

    /**
     * 留言
     */
    private String information;

    /**
     * 关联商家id
     */
    private Long busid;

    /**
     * 关联产品id
     */
    private Long proid;

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
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getProname() == null ? other.getProname() == null : this.getProname().equals(other.getProname()))
            && (this.getMakedate() == null ? other.getMakedate() == null : this.getMakedate().equals(other.getMakedate()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getOrderstate() == null ? other.getOrderstate() == null : this.getOrderstate().equals(other.getOrderstate()))
            && (this.getPlacedate() == null ? other.getPlacedate() == null : this.getPlacedate().equals(other.getPlacedate()))
            && (this.getUsertell() == null ? other.getUsertell() == null : this.getUsertell().equals(other.getUsertell()))
            && (this.getInformation() == null ? other.getInformation() == null : this.getInformation().equals(other.getInformation()))
            && (this.getBusid() == null ? other.getBusid() == null : this.getBusid().equals(other.getBusid()))
            && (this.getProid() == null ? other.getProid() == null : this.getProid().equals(other.getProid()))
            && (this.getTecid() == null ? other.getTecid() == null : this.getTecid().equals(other.getTecid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getProname() == null) ? 0 : getProname().hashCode());
        result = prime * result + ((getMakedate() == null) ? 0 : getMakedate().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getOrderstate() == null) ? 0 : getOrderstate().hashCode());
        result = prime * result + ((getPlacedate() == null) ? 0 : getPlacedate().hashCode());
        result = prime * result + ((getUsertell() == null) ? 0 : getUsertell().hashCode());
        result = prime * result + ((getInformation() == null) ? 0 : getInformation().hashCode());
        result = prime * result + ((getBusid() == null) ? 0 : getBusid().hashCode());
        result = prime * result + ((getProid() == null) ? 0 : getProid().hashCode());
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
        sb.append(", openid=").append(openid);
        sb.append(", proname=").append(proname);
        sb.append(", makedate=").append(makedate);
        sb.append(", username=").append(username);
        sb.append(", orderstate=").append(orderstate);
        sb.append(", placedate=").append(placedate);
        sb.append(", usertell=").append(usertell);
        sb.append(", information=").append(information);
        sb.append(", busid=").append(busid);
        sb.append(", proid=").append(proid);
        sb.append(", tecid=").append(tecid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}