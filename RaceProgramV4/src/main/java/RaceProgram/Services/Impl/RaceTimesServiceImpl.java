package RaceProgram.Services.Impl;

import RaceProgram.Domain.RaceTimes;
import RaceProgram.Repositories.RaceTimesRepository;
import RaceProgram.Services.RaceTimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/13.
 */
@Service
public class RaceTimesServiceImpl implements RaceTimesService
{
    @Autowired
    RaceTimesRepository repository;

    public List<RaceTimes> getRaceTimes()
    {
        List<RaceTimes> allRaceTimes = new ArrayList<>();

        Iterable<RaceTimes> raceTimes = repository.findAll();

        for(RaceTimes rt1 : raceTimes)
        {
            allRaceTimes.add(rt1);
        }

        return allRaceTimes;
    }
}
