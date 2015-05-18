package RaceProgram.domain;

import RaceProgram.Conf.Factories.CarsFactory;
import RaceProgram.Domain.Cars;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/16.
 */
public class CarsTest
{
    @Test
    public void testCars() throws Exception
    {
        Cars cars = new Cars.Builder(14).carType("Porsche GT3 Cup").classCode("S&GT").driverName("Craig Jarvis").build();
        Assert.assertEquals("Porsche GT3 Cup",cars.getCarType());
    }

    @Test
    public void testCreate() throws Exception
    {
        Map<String,String> values = new HashMap<String, String>();

        values.put("driverName","Dawie Joubert");
        values.put("classCode","S&GT");
        values.put("carType","Lotus Exige");

        Cars cars = CarsFactory.createCars(14,values);

        Assert.assertEquals(14,cars.getCarNumber());
    }

    @Test
    public void testUpdate() throws Exception {

        Map<String,String> values = new HashMap<String, String>();

        values.put("driverName","Dawie Joubert");
        values.put("classCode","S&GT");
        values.put("carType","Lotus Exige");

        Cars cars = CarsFactory.createCars(14,values);

        Cars newCar = new Cars.Builder(cars.getCarNumber())
                                .copy(cars)
                                .carType("Porsche GT3 Cup")
                                .build();

        Assert.assertEquals(14,cars.getCarNumber());
        Assert.assertEquals("Dawie Joubert",newCar.getDriverName());
        Assert.assertEquals("Porsche GT3 Cup",newCar.getCarType());

    }
}
