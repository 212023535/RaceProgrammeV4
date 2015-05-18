package RaceProgram.domain;

import RaceProgram.Conf.Factories.BikesFactory;
import RaceProgram.Domain.Bikes;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/05/08.
 */
public class BikesTest
{
    @Test
    public void testBikes() throws Exception
    {
        Bikes bikes = new Bikes.Builder(14).bikeType("Ducati 999").classCode("SS").driverName("Craig Jarvis").build();
        Assert.assertEquals("Ducati 999", bikes.getBikeType());
    }

    @Test
    public void testCreateBikes() throws Exception
    {
        Map<String,String> values = new HashMap<String, String>();

        values.put("driverName","Test");
        values.put("classCode","Test2");
        values.put("carType","Test3");

        Bikes bikes = BikesFactory.createBikes(14, values);

        Assert.assertEquals(14,bikes.getBikeNumber());
    }

    @Test
    public void testUpdateBikes() throws Exception {

        Map<String,String> values = new HashMap<String, String>();

        values.put("driverName","Test");
        values.put("classCode","Test2");
        values.put("carType","Test3");

        Bikes bikes = BikesFactory.createBikes(14, values);

        Bikes newBikes = new Bikes.Builder(bikes.getBikeNumber())
                                    .copy(bikes)
                                    .driverName("Tester")
                                    .build();

        Assert.assertEquals("Test",bikes.getDriverName());
        Assert.assertEquals(14,newBikes.getBikeNumber());
        Assert.assertEquals("Tester",newBikes.getDriverName());

    }
}
