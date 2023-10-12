package second;

import org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.BeforeEach;
import org.seminars.second.Car;
import org.seminars.second.Motorcycle;
import org.seminars.second.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        car = new Car("company1","model1", 3);
        motorcycle = new Motorcycle("company2","model2", 2);
    }

    // - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    public void testCarVehicleInstance() {
        assertInstanceOf(Vehicle.class, car);
    }

    //- Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void testCar4Wheels() {
        assertEquals(4,car.getNumWheels());
    }

    //- Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public void testMotorcycle2Wheels() {
        assertEquals(2,motorcycle.getNumWheels());
    }

    //- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testCar60Speed() {
        car.testDrive();
        assertEquals(60,car.getSpeed());
    }

    //- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testMotorcycle75Speed() {
        motorcycle.testDrive();
        assertEquals(75,motorcycle.getSpeed());
    }

    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    public void testCarPark() {
        car.testDrive();
        car.park();
        assertEquals(0,car.getSpeed());
    }

    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    public void testMotorcyclePark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0,motorcycle.getSpeed());
    }
}
