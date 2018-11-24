package com.exercise.distance.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_station", schema = "public", catalog = "one_information")
public class TStation {
    private Double lat;
    private Double lng;
    private String province;
    private Double sensorAltitude;
    private Double stationAltitude;
    private String stationName;
    private int stationNo;

    @Basic
    @Column(name = "lat", nullable = true, precision = 0)
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "lng", nullable = true, precision = 0)
    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
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
    @Column(name = "sensor_altitude", nullable = true, precision = 0)
    public Double getSensorAltitude() {
        return sensorAltitude;
    }

    public void setSensorAltitude(Double sensorAltitude) {
        this.sensorAltitude = sensorAltitude;
    }

    @Basic
    @Column(name = "station_altitude", nullable = true, precision = 0)
    public Double getStationAltitude() {
        return stationAltitude;
    }

    public void setStationAltitude(Double stationAltitude) {
        this.stationAltitude = stationAltitude;
    }

    @Basic
    @Column(name = "station_name", nullable = true, length = 255)
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Id
    @Column(name = "station_no", nullable = false)
    public int getStationNo() {
        return stationNo;
    }

    public void setStationNo(int stationNo) {
        this.stationNo = stationNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TStation tStation = (TStation) o;
        return stationNo == tStation.stationNo &&
                Objects.equals(lat, tStation.lat) &&
                Objects.equals(lng, tStation.lng) &&
                Objects.equals(province, tStation.province) &&
                Objects.equals(sensorAltitude, tStation.sensorAltitude) &&
                Objects.equals(stationAltitude, tStation.stationAltitude) &&
                Objects.equals(stationName, tStation.stationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lat, lng, province, sensorAltitude, stationAltitude, stationName, stationNo);
    }
}
