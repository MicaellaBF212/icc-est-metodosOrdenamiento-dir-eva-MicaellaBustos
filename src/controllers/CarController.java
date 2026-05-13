package controllers;

import static org.junit.jupiter.api.Assertions.fail;

import models.Car;


public class CarController {

  // Burbuja avanzado
  public void sortByName(Car[] cars){
    for (int i = 0; i < cars.length; i++) {
      boolean swap = false;
      for (int j = 0; j < cars.length-1-i; j++) {
        if (cars[j].getName().compareTo(cars[j+1].getName())>0) {
          Car aux = cars[j];
          cars[j] = cars[j+1];
          cars[j+1]= aux;
          swap = true;
          
        }
      }
      if (!swap){
        break;        
      }
    }
  }

}
