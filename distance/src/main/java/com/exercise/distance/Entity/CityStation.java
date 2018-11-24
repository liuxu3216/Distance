package com.exercise.distance.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "city_station", schema = "public", catalog = "one_information")
public class CityStation {
    private long id;
    private String areaId;
    private Double distance;
    private String province;
    private String stationNo;
    private String stationName;
    private String fullName;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "area_id", nullable = true, length = 255)
    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    @Basic
    @Column(name = "distance", nullable = true, precision = 0)
    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @Basic
    @Column(name = "province", nullable = true, length = 255)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "station_no", nullable = true, length = 255)
    public String getStationNo() {
        return stationNo;
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo;
    }

    @Basic
    @Column(name = "station_name", nullable = true, length = 255)
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Basic
    @Column(name = "full_name", nullable = true, length = 255)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityStation that = (CityStation) o;
        return id == that.id &&
                Objects.equals(areaId, that.areaId) &&
                Objects.equals(distance, that.distance) &&
                Objects.equals(province, that.province) &&
                Objects.equals(stationNo, that.stationNo) &&
                Objects.equals(stationName, that.stationName) &&
                Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, areaId, distance, province, stationNo, stationName, fullName);
    }
}
