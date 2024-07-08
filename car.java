
package com.vechile;

import java.util.*;
class car extends Vehicle {

    public car(int weightLoad) {
        super(weightLoad);
    }

    @Override
    public int getVehicleWeightLoad() {
        return weightLoad;
    }
}

