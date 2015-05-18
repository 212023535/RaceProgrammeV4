package RaceProgram.Conf.Factories;

import RaceProgram.Domain.PitCrews;

/**
 * Created by student on 2015/05/07.
 */
public class PitCrewsFactory {


    public static PitCrews createPitCrews(boolean answer, String driverName)
    {
        PitCrews pitCrews = new PitCrews.Builder(driverName)
                .answer(answer)
                .build();

        return pitCrews;
    }
}
