package RaceProgram.Conf.Factories;

import RaceProgram.Domain.Classes;
import RaceProgram.Domain.Drivers;
import RaceProgram.Domain.Standings;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/05/07.
 */
public class StandingsFactory {
    public static Standings createStandings(int position,List<Drivers> driversList,Map<Classes,Classes> values)
    {
        Standings standings = new Standings.Builder(values.get("classCode"))
                .position(position)
                .className(values.get("className"))
                .driverName(driversList)
                .build();

        return standings;
    }
}
