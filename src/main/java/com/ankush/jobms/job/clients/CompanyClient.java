package com.ankush.jobms.job.clients;

import com.ankush.jobms.job.external.Company;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "COMPANYMS")
public interface CompanyClient {

    @GetMapping("/companies/{id}")
    Company getCompany(@PathVariable("id") Long id);

}
//It scans for and registers beans for all interfaces annotated with @FeignClient.
//You can customize Feign client behavior by defining configuration classes
// and specifying them in the @FeignClient annotation.