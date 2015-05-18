package RaceProgram.Services.Impl;

import RaceProgram.Domain.PitCrews;
import RaceProgram.Repositories.PitCrewsRepository;
import RaceProgram.Services.PitCrewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/13.
 */
@Service
public class PitCrewsServiceImpl implements PitCrewsService
{
    @Autowired
    PitCrewsRepository repository;

    public List<PitCrews> getPitCrews()
    {
        List<PitCrews> allPitCrews = new ArrayList<>();

        Iterable<PitCrews> pitCrews = repository.findAll();

        for(PitCrews pc1 : pitCrews)
        {
            allPitCrews.add(pc1);
        }

        return allPitCrews;
    }
}
