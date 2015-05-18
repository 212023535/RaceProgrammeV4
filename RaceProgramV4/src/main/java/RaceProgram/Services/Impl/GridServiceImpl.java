package RaceProgram.Services.Impl;

import RaceProgram.Domain.Grid;
import RaceProgram.Repositories.GridRepository;
import RaceProgram.Services.GridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/13.
 */
@Service
public class GridServiceImpl implements GridService
{
    @Autowired
    GridRepository repository;

    public List<Grid> getGrid()
    {
        List<Grid> allGrid = new ArrayList<>();

        Iterable<Grid> grid = repository.findAll();

        for(Grid grid1 : grid)
        {
            allGrid.add(grid1);
        }

        return allGrid;
    }
}
