package RaceProgram.Services.Impl;

import RaceProgram.Domain.Standings;
import RaceProgram.Repositories.StandingsRepository;
import RaceProgram.Services.StandingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/13.
 */
@Service
public class StandingsServiceImpl implements StandingsService
{
    @Autowired
    StandingsRepository repository;

    public List<Standings> getStandings()
    {
        List<Standings> allStandings = new ArrayList<>();

        Iterable<Standings> standings = repository.findAll();

        for(Standings s1 : standings)
        {
            allStandings.add(s1);
        }

        return allStandings;
    }
}
