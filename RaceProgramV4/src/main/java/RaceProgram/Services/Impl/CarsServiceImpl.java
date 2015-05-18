package RaceProgram.Services.Impl;

import RaceProgram.Domain.Cars;
import RaceProgram.Repositories.CarsRepository;
import RaceProgram.Services.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/13.
 */
@Service
public class CarsServiceImpl implements CarsService
{
    @Autowired
    CarsRepository repository;

    public List<Cars> getCars()
    {
        List<Cars> allCars = new ArrayList<>();

        Iterable<Cars> cars = repository.findAll();

        for(Cars cars1 : cars)
        {
            allCars.add(cars1);
        }
        return allCars;
    }
}
