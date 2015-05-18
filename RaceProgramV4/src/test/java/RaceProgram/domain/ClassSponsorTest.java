package RaceProgram.domain;

import RaceProgram.Conf.Factories.ClassSponsorsFactory;
import RaceProgram.Domain.ClassSponsors;
import junit.framework.Assert;
import org.junit.Test;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/05/08.
 */
public class ClassSponsorTest
{
    @Test
    public void testClassSponsors() throws Exception
    {
        ClassSponsors classSponsor = new ClassSponsors.Builder("Test1").sponsor("Test2").className("Test3").build();
        Assert.assertEquals("Test1",classSponsor.getClassCode());
    }

    @Test
    public void testCreateClassSponsors() throws Exception
    {
        Map<String,String> values = new HashMap<String, String>();

        values.put("classCode","S&GT");
        values.put("className","test");
        values.put("sponsor","test2");

        ClassSponsors classSponsors = ClassSponsorsFactory.createSponsors(values);

        Assert.assertEquals("S&GT",classSponsors.getClassCode());
    }

    @Test
    public void testUpdateClassSponsors() throws Exception
    {
        Map<String,String> values = new HashMap<String, String>();

        values.put("classCode","S&GT");
        values.put("className","test");
        values.put("sponsor","test2");

        ClassSponsors classSponsors = ClassSponsorsFactory.createSponsors(values);

        ClassSponsors newClassSponsor = new ClassSponsors.Builder("TEST").copy(classSponsors).classCode("TEST").build();

        Assert.assertEquals("S&GT",classSponsors.getClassCode());
        Assert.assertEquals("TEST",newClassSponsor.getClassCode());
        Assert.assertEquals("test",newClassSponsor.getClassName());

    }
}
