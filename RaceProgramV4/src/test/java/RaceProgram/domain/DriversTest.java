package RaceProgram.domain;

import RaceProgram.Conf.Factories.DriversFactory;
import RaceProgram.Domain.Classes;
import RaceProgram.Domain.Drivers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/04/16.
 */
public class DriversTest
{
    @Test
    public void testDrivers() throws Exception
    {
        Drivers drivers = new Drivers.Builder(88).driverName("Dawie Joubert").build();
        Assert.assertEquals("Dawie Joubert",drivers.getDriverName());
    }

    @Test
    public void testDriversCreate() throws Exception
    {
        Drivers drivers = DriversFactory.createDrivers(14,"Rudi Zeeman",null);

        Assert.assertEquals(14,drivers.getVehicleNumber());
    }

    @Test
    public void testDriversUpdate() throws Exception
    {
        Drivers drivers = DriversFactory.createDrivers(14,"Rudi Zeeman",null);

        Drivers newDriver = new Drivers.Builder(drivers.getVehicleNumber())
                                        .copy(drivers)
                                        .driverName("John Snow")
                                        .build();

        Assert.assertEquals(14,drivers.getVehicleNumber());
        Assert.assertEquals("John Snow",newDriver.getDriverName());
        Assert.assertEquals(14,newDriver.getVehicleNumber());
    }
}
