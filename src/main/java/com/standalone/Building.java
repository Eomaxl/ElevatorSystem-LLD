package com.standalone;

import java.util.List;

public class Building {

    List<Floor> floorList;

    public Building(List<Floor> floors){
        this.floorList = floors;
    }

    public void addFloor(Floor newFloor){
        floorList.add(newFloor);
    }

    public void removeFloor(Floor floor){
        floorList.remove(floor);
    }

    List<Floor> getAllFloorList(){
        return floorList;
    }
}
