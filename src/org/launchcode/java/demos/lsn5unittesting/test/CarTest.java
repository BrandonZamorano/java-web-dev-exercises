package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {
    private Car testCar;

    @Before
    public void createCarObject() {
        testCar = new Car("Toyota", "Prius", 10, 50);
    }
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
//        Car testCar = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, testCar.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

}
