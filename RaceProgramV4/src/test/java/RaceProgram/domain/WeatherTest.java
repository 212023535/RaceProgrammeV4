package RaceProgram.domain;

import RaceProgram.Conf.Factories.WeatherFactory;
import RaceProgram.Domain.Weather;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/05/08.
 */
public class WeatherTest
{
    @Test
    public void testCreateWeather() throws Exception
    {
        Weather weather = WeatherFactory.createWeather("19-04-2015","Sunny");

        Assert.assertEquals("Sunny",weather.getWeather());
    }

    @Test
    public void testUpdateWeather() throws Exception
    {
        Weather weather = WeatherFactory.createWeather("19-04-2015","Sunny");

        Weather newWeather = new Weather.Builder("date").copy(weather).weather("rain").build();

        Assert.assertEquals("Sunny",weather.getWeather());
        Assert.assertEquals("rain",newWeather.getWeather());
    }
}
