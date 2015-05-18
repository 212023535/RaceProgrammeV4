package RaceProgram.Conf.Factories;

import RaceProgram.Domain.Drivers;
import RaceProgram.Domain.Grid;

import java.util.List;

/**
 * Created by student on 2015/05/07.
 */
public class GridFactory {

    public static Grid createGrid(int gridSize,int gridPosition,String classCode,List<Drivers> driversList)
    {
        Grid grid = new Grid.Builder(gridSize)
                .driverName(driversList)
                .gridPosition(gridPosition)
                .classCode(classCode)
                .build();

        return grid;
    }
}
