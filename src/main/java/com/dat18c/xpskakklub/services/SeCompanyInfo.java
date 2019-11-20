package com.dat18c.xpskakklub.services;

import com.dat18c.xpskakklub.models.CompanyInfo;
import com.dat18c.xpskakklub.repos.ReCompanyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeCompanyInfo {

    @Autowired
    ReCompanyInfo reCompanyInfo;

    public CompanyInfo getInfo(){
        Optional<CompanyInfo> optionalCompanyInfo = reCompanyInfo.findById(0);
        if(optionalCompanyInfo.isPresent()){
            return optionalCompanyInfo.get();
        }
        else {
            return new CompanyInfo();
        }

    }
}
