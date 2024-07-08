
package com.vechile;

import java.util.*;

    class truck extends Vehicle {

    public truck(int weightLoad) {
        super(weightLoad);
    }

    @Override
    public int getVehicleWeightLoad() {
        return weightLoad * 4;
    }
}

