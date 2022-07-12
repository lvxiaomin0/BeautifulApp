package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName image
 */
@TableName(value ="image")
@Data
public class Image implements Serializable {
    /**
     * 图片id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 图片路径
     */
    private String imageurl;

    /**
     * 图片标题
     */
    private String imagetitle;

    /**
     * 图片类型 banner：首页轮播图 nav：菜单 head：头像
     */
    private String imagetype;

    /**
     * 图片状态  1：可用  0：不可用
     */
    private String imagestate;

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
        Image other = (Image) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getImageurl() == null ? other.getImageurl() == null : this.getImageurl().equals(other.getImageurl()))
            && (this.getImagetitle() == null ? other.getImagetitle() == null : this.getImagetitle().equals(other.getImagetitle()))
            && (this.getImagetype() == null ? other.getImagetype() == null : this.getImagetype().equals(other.getImagetype()))
            && (this.getImagestate() == null ? other.getImagestate() == null : this.getImagestate().equals(other.getImagestate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getImageurl() == null) ? 0 : getImageurl().hashCode());
        result = prime * result + ((getImagetitle() == null) ? 0 : getImagetitle().hashCode());
        result = prime * result + ((getImagetype() == null) ? 0 : getImagetype().hashCode());
        result = prime * result + ((getImagestate() == null) ? 0 : getImagestate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", imageurl=").append(imageurl);
        sb.append(", imagetitle=").append(imagetitle);
        sb.append(", imagetype=").append(imagetype);
        sb.append(", imagestate=").append(imagestate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}