package RaceProgram.domain;

import RaceProgram.Conf.Factories.GridFactory;
import RaceProgram.Domain.Drivers;
import RaceProgram.Domain.Grid;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/08.
 */
public class GridTest
{
    @Test
    public void testGridCreate() throws Exception
    {
        List<Drivers> driversList = new ArrayList<Drivers>();

        Grid grid = GridFactory.createGrid(15,2,"TEST",driversList);

        Assert.assertEquals("TEST",grid.getClassCode());
    }

    @Test
    public void testGridUpdate() throws Exception
    {
        List<Drivers> driversList = new ArrayList<Drivers>();

        Grid grid = GridFactory.createGrid(15,2,"TEST",driversList);

        Grid newGrid = new Grid.Builder(8).copy(grid).gridPosition(6).build();

        Assert.assertEquals(15,grid.getGridSize());
        Assert.assertEquals(6,newGrid.getGridPosition());
    }
}
