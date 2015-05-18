package RaceProgram.Conf.Factories;

import RaceProgram.Domain.Classes;
import RaceProgram.Domain.RaceTimes;

import java.util.Map;

/**
 * Created by student on 2015/05/07.
 */
public class RaceTimesFactory {


    public static RaceTimes createRaceTimes(String raceTime,Classes classCode)
    {
        RaceTimes raceTimes = new RaceTimes.Builder(classCode)
                .raceTime(raceTime)
                .build();
        return raceTimes;
    }
}
