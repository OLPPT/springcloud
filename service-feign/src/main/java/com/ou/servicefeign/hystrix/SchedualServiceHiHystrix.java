package com.ou.servicefeign.hystrix;

import com.ou.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "error,"+name;
    }
}
