package com.dat18c.xpskakklub.repos;

import com.dat18c.xpskakklub.models.CompanyInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReCompanyInfo extends CrudRepository<CompanyInfo, Integer> {


}
