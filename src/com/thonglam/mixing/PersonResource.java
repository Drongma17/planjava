package com.thonglam.mixing;

import com.thonglam.mixing.Person;

import java.util.HashMap;
import java.util.Map;

public class PersonResource {

    public Person getPerson(){

        Person p=new Person();
        p.setAge(41);
        p.setFirstName("Ngawang");
        p.setLastName("Yeshi");

       p.setCitizenships(new String[]{"China", "USA"});

        Map<String, Object> criditedcard = new HashMap<>();
        criditedcard.put("tibetan", "VISA");
        criditedcard.put("State bank", "Master");
        criditedcard.put("saving card", "ASIM");
        p.setCreditCards(criditedcard);

        return p;
    }
}
