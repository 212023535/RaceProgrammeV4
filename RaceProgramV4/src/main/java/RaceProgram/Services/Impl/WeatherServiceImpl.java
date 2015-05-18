package RaceProgram.Services.Impl;

import RaceProgram.Domain.Weather;
import RaceProgram.Repositories.WeatherRepository;
import RaceProgram.Services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/13.
 */
@Service
public class WeatherServiceImpl implements WeatherService
{
    @Autowired
    WeatherRepository repository;

    public List<Weather> getWeather()
    {
        List<Weather> allWeather = new ArrayList<>();

        Iterable<Weather> weather = repository.findAll();

        for(Weather w1 : weather)
        {
            allWeather.add(w1);
        }

        return allWeather;
    }
}
