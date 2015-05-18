package RaceProgram.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by student on 2015/04/17.
 */
@Entity
public class Weather
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String date;
    private String weather;

    private Weather(){}

    public Weather(Builder builder) {
        date = builder.date;
        weather = builder.weather;
        id=builder.id;
    }

    public String getWeather() {
        return weather;
    }

    public String getDate() {
        return date;
    }

    public Long getId() {
        return id;
    }

    public static class Builder
    {
        private String weather;
        private String date;
        private Long id;

        public Builder(String date)
        {
            this.date = date;
        }

        public Builder weather(String value)
        {
            this.weather = value;
            return this;
        }

        public Builder id(Long value){
            this.id=value;
            return this;
        }

        public Builder copy(Weather values)
        {
            this.weather = values.getWeather();
            this.date = values.getDate();
            return this;
        }

        public Weather build()
        {
            return new Weather(this);
        }
    }

    @Override
    public String toString() {
        return "Weather{" +
                "date='" + date + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }
}
