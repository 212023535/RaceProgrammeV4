package RaceProgram.Services.Impl;

import RaceProgram.Domain.Bikes;
import RaceProgram.Repositories.BikesRepository;
import RaceProgram.Services.BikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/13.
 */
@Service
public class BikesServiceImpl implements BikesService
{
    @Autowired
    BikesRepository repository;

    public List<Bikes> getBikes()
    {
        List<Bikes> allBikes = new ArrayList<>();

        Iterable<Bikes> bikes = repository.findAll();

        for(Bikes bikes1 : bikes)
        {
            allBikes.add(bikes1);
        }
        return allBikes;
    }
}
