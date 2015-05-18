package RaceProgram.Services.Impl;

import RaceProgram.Domain.ClassSponsors;
import RaceProgram.Repositories.ClassSponsorRepository;
import RaceProgram.Services.ClassSponsorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/05/13.
 */
@Service
public class ClassSponsorServiceImpl implements ClassSponsorsService
{
    @Autowired
    ClassSponsorRepository repository;

    public List<ClassSponsors> getSponsors()
    {
        List<ClassSponsors> allSponsors = new ArrayList<>();

        Iterable<ClassSponsors> sponsors = repository.findAll();

        for(ClassSponsors cs1 : sponsors)
        {
            allSponsors.add(cs1);
        }

        return allSponsors;
    }
}
