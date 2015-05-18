package RaceProgram.services;

import RaceProgram.App;
import RaceProgram.Conf.Factories.ClassSponsorsFactory;
import RaceProgram.Conf.Factories.ClassesFactory;
import RaceProgram.Conf.Factories.GridFactory;
import RaceProgram.Conf.Factories.RaceTimesFactory;
import RaceProgram.Domain.ClassSponsors;
import RaceProgram.Domain.Classes;
import RaceProgram.Domain.Grid;
import RaceProgram.Domain.RaceTimes;
import RaceProgram.Repositories.ClassRepository;
import RaceProgram.Services.ClassesService;
import junit.framework.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/05/14.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class ClassesServicesTest extends AbstractTestNGSpringContextTests
{
    @Autowired
    private ClassesService service;

    private long id;

    @Autowired
    private ClassRepository repository;
    private List<Classes> classesList;

    Map<String,String> sValues = new HashMap<String, String>();
    Map<String,String> v8mValues = new HashMap<String, String>();
    Map<String,String> s600Values = new HashMap<String, String>();

    @BeforeMethod
    public void setUp() throws Exception
    {
        sValues.put("classCode",null);
        sValues.put("className",null);
        sValues.put("sponsor","Novel Ford");

        v8mValues.put("classCode","V8M");
        v8mValues.put("className","V8 Masters");

        s600Values.put("classCode","S600");
        s600Values.put("className","Super 600");

        classesList = new ArrayList<>();
    }

    @Test
    public void create() throws Exception
    {
        ClassSponsors sponsor = ClassSponsorsFactory.createSponsors(sValues);

        Grid grid = GridFactory.createGrid(14,6,null,null);

        RaceTimes raceTimes = RaceTimesFactory.createRaceTimes("11:40",null);

        Classes v8m = ClassesFactory.createClass(v8mValues,sponsor,grid,raceTimes);

        Classes s600 = ClassesFactory.createClass(s600Values,null,null,null);

        classesList.add(v8m);
        classesList.add(s600);

        repository.save(classesList);

        id=s600.getId();

        Assert.assertNotNull(s600.getId());

    }

    @Test
    public void testGetClasses() throws Exception
    {
        List<Classes> classList = service.getClasses(id);

        org.testng.Assert.assertTrue(classList.size() == 2);
    }

}
