package RaceProgram.Conf.Factories;

import RaceProgram.Domain.*;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/04/23.
 */
public class ClassesFactory
{
    public static Classes createClass(Map<String,String> values,ClassSponsors classSponsors,Grid gridSize,RaceTimes raceTimes)
    {
        Classes classes = new Classes.Builder(values.get("classCode"))
                                    .className(values.get("className"))
                                    .classSponsors(classSponsors)
                                    .gridSize(gridSize)
                                    .raceTime(raceTimes)
                                    .build();
        return classes;
    }

}
