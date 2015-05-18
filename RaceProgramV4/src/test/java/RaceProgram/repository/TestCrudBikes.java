package RaceProgram.repository;

import RaceProgram.App;
import RaceProgram.Domain.Bikes;
import RaceProgram.Repositories.BikesRepository;
import org.junit.Assert;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/04/30.
 */

@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration


public class TestCrudBikes extends AbstractTestNGSpringContextTests
{
    String classCode;
    int bikeNumber;

    @Autowired
    private BikesRepository repository;

    @Test
    public void testCreate() throws Exception
    {
        List<Bikes> bikesList = new ArrayList<Bikes>();
        Bikes bikes = new Bikes.Builder(46).bikeType("Honda CBR 600RR").classCode("S600").driverName("Valentino Rossi").build();
        repository.save(bikesList);
        classCode= bikes.getClassCode();
        Assert.assertNotNull(bikes.getClassCode());
    }
//
    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception
    {
        Bikes bikes = repository.findOne(bikeNumber);
        Assert.assertEquals("46",bikes.getBikeNumber());
    }

    @Test (dependsOnMethods = "testRead")
    public void testUpdate() throws Exception
    {
        Bikes bikes = repository.findOne(bikeNumber);
        Bikes newBike = new Bikes.Builder(76).bikeType("Suzuki GSX-R 750").classCode("SBS").driverName("Trevino Solomons").build();
        repository.save(newBike);
        Assert.assertEquals("SBS",bikes.getClassCode());
        Assert.assertEquals(76,bikes.getBikeNumber());
    }

    @Test (dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception
    {
        Bikes bikes = repository.findOne(bikeNumber);
        repository.delete(bikes);
        Bikes newBikes = repository.findOne(bikeNumber);
        Assert.assertNull(newBikes);
    }
}
