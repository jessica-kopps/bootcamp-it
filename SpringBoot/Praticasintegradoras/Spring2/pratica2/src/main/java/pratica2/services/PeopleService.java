package pratica2.services;


import org.springframework.stereotype.Service;
import pratica2.dtos.PeopleDTO;
import pratica2.entitys.People;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeopleService {

    private final List<People> peopleList = new ArrayList<>();

    public boolean PeopleDTO create(PeopleDTO peopleDTO){
        PeopleDTO peopleDTO = new PeopleDTO();

        peopleList.add();

    }
}
