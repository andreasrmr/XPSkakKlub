package com.dat18c.xpskakklub.services;


import com.dat18c.xpskakklub.models.Contingent;
import com.dat18c.xpskakklub.repos.ReContingent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SeContingent {

    @Autowired
    ReContingent reContingent;

    public List<Contingent> getAll(){
        //Optional<Contingent> optionalContingent = reContingent.findAll();
        List<Contingent> contingentList = new ArrayList<>();
        for(Contingent c : reContingent.findAll()){
            contingentList.add(c);
        }
        return contingentList;
    }

    public Contingent findById(int id){
        Optional<Contingent> optionalContingent = reContingent.findById(id);
        if(optionalContingent.isPresent()){
            return optionalContingent.get();
        }
        else {
            throw new RuntimeException("Contingent not found");
        }
    }

    public void delete(int id){
        reContingent.deleteById(id);
    }
    public void save(Contingent contingent){
        reContingent.save(contingent);
    }
}
