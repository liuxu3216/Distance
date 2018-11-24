package com.exercise.distance.Controller;

import com.exercise.distance.Entity.CityStation;
import com.exercise.distance.Entity.TStation;
import com.exercise.distance.Entity.ZzCity;
import com.exercise.distance.JpaRepository.CityStationRepository;
import com.exercise.distance.JpaRepository.TStationRepository;
import com.exercise.distance.JpaRepository.ZCityRepository;
import com.exercise.distance.Util.distanceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = "/distance")
public class DistanceController {

    @Autowired
    TStationRepository tStationRepository;
    @Autowired
    ZCityRepository zCityRepository;
    @Autowired
    CityStationRepository cityStationRepository;

    @GetMapping(value = "/findALl")
    public Map<Double,String> getAll(){
        HashMap<Double,String> hashMap = new HashMap<>();
        HashMap<Double,Integer> hashMap1 = new HashMap<>();
        HashMap<Double,String> hashMap2 = new HashMap<>();
        List<TStation> tStations = tStationRepository.findAll();
        List<ZzCity> zzCities = zCityRepository.findAll();
        for(int j = 0;j<zzCities.size();j++){
            List dis = new ArrayList();
            ZzCity z = zzCities.get(j);
            for (int i = 0 ;i<tStations.size();i++){
                TStation t = tStations.get(i);
                Double s = distanceUtil.getDistance(z.getZlat(),z.getZlon(),t.getLat(),z.getZlon());
                hashMap.put(s,t.getProvince());
                hashMap1.put(s,t.getStationNo());
                hashMap2.put(s,t.getStationName());
                dis.add(s);
            }
            Double minDistance = (Double) Collections.min(dis);
            CityStation cityStation = new CityStation();
            cityStation.setFullName(z.getFullname());
            cityStation.setAreaId(z.getAreaId());
            cityStation.setDistance(minDistance);
            cityStation.setProvince(hashMap.get(minDistance));
            cityStation.setStationName(hashMap2.get(minDistance));
            cityStationRepository.save(cityStation);
        }
        return hashMap;
    }
}
