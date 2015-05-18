package RaceProgram.domain;

import RaceProgram.Conf.Factories.ClassesFactory;
import RaceProgram.Domain.Classes;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/15.
 */
public class ClassesTest
{

    @Test
    public void testClasses() throws Exception
    {
        Classes classes = new Classes.Builder("S&GT").className("Sports % GT").build();
        Assert.assertEquals("S&GT",classes.getClassCode());
    }

    @Test
    public void testCreateClasses() throws Exception
    {
        Map<String,String> values = new HashMap<String, String>();

        values.put("classCode","S&GT");
        values.put("className","Sports & GT");

        Classes classes = ClassesFactory.createClass(values,null,null,null);

        Assert.assertEquals("S&GT",classes.getClassCode());
    }

    @Test
    public void testUpdateClasses() throws Exception
    {
        Map<String,String> values = new HashMap<String, String>();

        values.put("classCode","S&GT");
        values.put("className","Sports & GT");

        Classes classes = ClassesFactory.createClass(values,null,null,null);

        Classes newClasses = new Classes.Builder(classes.getClassCode())
                                        .copy(classes)
                                        .className("SPORTS AND GT")
                                        .build();

        Assert.assertEquals("S&GT",newClasses.getClassCode());
        Assert.assertEquals("SPORTS AND GT",newClasses.getClassName());
        Assert.assertEquals("Sports & GT",classes.getClassName());
    }
}
