
package com.vechile;

import java.util.*;
//abstract class Vechiletest {
//    
//    
//   int  weightLoad;
//   
//   
//   public void Vechile(int weightLoad){
//       this.weightLoad=weightLoad;
//       
//   }
//   
//   
//   public int getweightload(){
//       return weightLoad;
//   }
//   }
   
   abstract class Vehicle {
    int weightLoad;

    public Vehicle(int weightLoad) {
        this.weightLoad = weightLoad;
    }

    public abstract int getVehicleWeightLoad();
}
 

