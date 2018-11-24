package com.exercise.distance.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "zz_city", schema = "public", catalog = "one_information")
public class ZzCity {
    private String jianname;
    private String zongzhanname;
    private Double zlat;
    private Double zlon;
    private String cid;
    private String fullname;
    private String pinyin;
    private String post;
    private Double clat;
    private Double clon;
    private String code;
    private String areaId;

    @Basic
    @Column(name = "jianname", nullable = true, length = 255)
    public String getJianname() {
        return jianname;
    }

    public void setJianname(String jianname) {
        this.jianname = jianname;
    }

    @Basic
    @Column(name = "zongzhanname", nullable = true, length = 255)
    public String getZongzhanname() {
        return zongzhanname;
    }

    public void setZongzhanname(String zongzhanname) {
        this.zongzhanname = zongzhanname;
    }

    @Basic
    @Column(name = "zlat", nullable = true, precision = 0)
    public Double getZlat() {
        return zlat;
    }

    public void setZlat(Double zlat) {
        this.zlat = zlat;
    }

    @Basic
    @Column(name = "zlon", nullable = true, precision = 0)
    public Double getZlon() {
        return zlon;
    }

    public void setZlon(Double zlon) {
        this.zlon = zlon;
    }

    @Basic
    @Column(name = "cid", nullable = true, length = 255)
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "fullname", nullable = true, length = 255)
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Basic
    @Column(name = "pinyin", nullable = true, length = 255)
    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    @Basic
    @Column(name = "post", nullable = true, length = 255)
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Basic
    @Column(name = "clat", nullable = true, precision = 0)
    public Double getClat() {
        return clat;
    }

    public void setClat(Double clat) {
        this.clat = clat;
    }

    @Basic
    @Column(name = "clon", nullable = true, precision = 0)
    public Double getClon() {
        return clon;
    }

    public void setClon(Double clon) {
        this.clon = clon;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 255)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "area_id", nullable = true, length = 32)
    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZzCity zzCity = (ZzCity) o;
        return Objects.equals(jianname, zzCity.jianname) &&
                Objects.equals(zongzhanname, zzCity.zongzhanname) &&
                Objects.equals(zlat, zzCity.zlat) &&
                Objects.equals(zlon, zzCity.zlon) &&
                Objects.equals(cid, zzCity.cid) &&
                Objects.equals(fullname, zzCity.fullname) &&
                Objects.equals(pinyin, zzCity.pinyin) &&
                Objects.equals(post, zzCity.post) &&
                Objects.equals(clat, zzCity.clat) &&
                Objects.equals(clon, zzCity.clon) &&
                Objects.equals(code, zzCity.code) &&
                Objects.equals(areaId, zzCity.areaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jianname, zongzhanname, zlat, zlon, cid, fullname, pinyin, post, clat, clon, code, areaId);
    }
}
