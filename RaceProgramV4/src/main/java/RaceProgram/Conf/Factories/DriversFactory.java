package RaceProgram.Conf.Factories;

import RaceProgram.Domain.*;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/04/23.
 */
public class DriversFactory
{
    public static Drivers createDrivers(int vehicleNumber,String driverName,Classes classCode)
    {
        Drivers drivers = new Drivers.Builder(vehicleNumber)
                .classCode(classCode)
                .driverName(driverName)
                .build();
        return drivers;
    }

}
