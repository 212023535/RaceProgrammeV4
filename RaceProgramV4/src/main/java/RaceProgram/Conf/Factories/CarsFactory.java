package RaceProgram.Conf.Factories;

import RaceProgram.Domain.Cars;

import java.util.Map;

/**
 * Created by student on 2015/05/07.
 */
public class CarsFactory {
    public static Cars createCars(int carNumber,Map<String,String> values)
    {
        Cars cars = new Cars.Builder(carNumber)
                .driverName(values.get("driverName"))
                .classCode(values.get("classCode"))
                .carType(values.get("carType"))
                .build();

        return cars;
    }

}
