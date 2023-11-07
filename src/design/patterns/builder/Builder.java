package design.patterns.builder;

import design.patterns.builder.cars.CarType;
import design.patterns.builder.components.Engine;
import design.patterns.builder.components.GPSNavigator;
import design.patterns.builder.components.Transmission;
import design.patterns.builder.components.TripComputer;

public interface Builder {
  void setCarType(CarType type);
  void setSeats(int seats);
  void setEngine(Engine engine);
  void setTransmission(Transmission transmission);
  void setTripComputer(TripComputer tripComputer);
  void setGPSNavigator(GPSNavigator gpsNavigator);
}
