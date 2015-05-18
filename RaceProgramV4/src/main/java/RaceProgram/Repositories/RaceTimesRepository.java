package RaceProgram.Repositories;

import RaceProgram.Domain.Classes;
import RaceProgram.Domain.RaceTimes;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by student on 2015/04/16.
 */
public interface RaceTimesRepository extends CrudRepository<RaceTimes,Classes>
{
}
