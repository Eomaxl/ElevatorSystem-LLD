package com.model;

import java.util.HashSet;
import java.util.Set;

public class InternalButtons {

    InternalDispatcher dispatcher = new InternalDispatcher();

    Set<Integer> floorNo = new HashSet<>(Set.of(1,2,3,4,5,6,7,8,9,10));
    int buttonSelected;

    void pressButton(int destination, ElevatorCar elevatorCar) {
        // 1. check if the destination is in the list of available floor
        if (!floorNo.contains(destination)) {
            throw new RuntimeException("Floor does not exist");
        }

        // 2. Submit the request to the jobDispatcher
        dispatcher.submitInternalRequest(destination, elevatorCar);
    }
}
