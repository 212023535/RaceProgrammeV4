package RaceProgram.Conf.Factories;

import RaceProgram.Domain.Bikes;

import java.util.Map;

/**
 * Created by student on 2015/05/07.
 */
public class BikesFactory {

    public static Bikes createBikes(int bikeNumber,Map<String,String> values)
    {
        Bikes bikes = new Bikes.Builder(bikeNumber)
                .driverName(values.get("driverName"))
                .classCode(values.get("classCode"))
                .bikeType(values.get("bikeType"))
                .build();

        return bikes;
    }
}
