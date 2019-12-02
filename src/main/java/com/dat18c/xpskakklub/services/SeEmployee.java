package com.dat18c.xpskakklub.services;

import com.dat18c.xpskakklub.models.Employee;
import com.dat18c.xpskakklub.models.Member;
import com.dat18c.xpskakklub.repos.ReEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SeEmployee {

    @Autowired
    ReEmployee reEmployee;

    public Employee findById(int id){
        Optional<Employee> optionalEmployee = reEmployee.findById(id);
        if(optionalEmployee.isPresent()){
            return optionalEmployee.get();
        }
        else {
            throw new RuntimeException("Employee not found");
        }
    }
    public void delete(int id){
        reEmployee.deleteById(id);
    }
    public void save(Employee employee){
        reEmployee.save(employee);
    }

    public List<Employee> getAll(){
        List<Employee> employeeList = new ArrayList<>();
        for(Employee employee : reEmployee.findAll()){
            employeeList.add(employee);
        }
        return employeeList;
    }

}
