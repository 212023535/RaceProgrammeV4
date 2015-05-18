package RaceProgram.Conf.Factories;

import RaceProgram.Domain.ClassSponsors;

import java.util.Map;

/**
 * Created by student on 2015/05/07.
 */
public class ClassSponsorsFactory {

    public static ClassSponsors createSponsors(Map<String,String> values)
    {
        ClassSponsors classSponsors = new ClassSponsors
                .Builder(values.get("classCode"))
                .className(values.get("className"))
                .sponsor(values.get("sponsor"))
                .build();
        return classSponsors;
    }
}
