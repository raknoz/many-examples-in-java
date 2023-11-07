package design.patterns.builder;

import design.patterns.builder.cars.Car;
import design.patterns.builder.cars.CarType;
import design.patterns.builder.components.Engine;
import design.patterns.builder.components.GPSNavigator;
import design.patterns.builder.components.Transmission;
import design.patterns.builder.components.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
  private CarType type;
  private int seats;
  private Engine engine;
  private Transmission transmission;
  private TripComputer tripComputer;
  private GPSNavigator gpsNavigator;

  public void setCarType(CarType type) {
    this.type = type;
  }

  @Override
  public void setSeats(int seats) {
    this.seats = seats;
  }

  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  @Override
  public void setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;
  }

  @Override
  public void setGPSNavigator(GPSNavigator gpsNavigator) {
    this.gpsNavigator = gpsNavigator;
  }

  public Car getResult() {
    return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
  }
}