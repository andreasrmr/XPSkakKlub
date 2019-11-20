package com.dat18c.xpskakklub.repos;

import com.dat18c.xpskakklub.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReEmployee extends CrudRepository<Employee, Integer> {
}
