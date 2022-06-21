package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyEmployeeFacade {

    public List<Company> retrieveCompaniesWithAnyTextFragment(CompanyDao companyDao, String textFragment){
        List<Company> companies = companyDao.retrieveCompanyWithAnyTextFragment("%" + textFragment + "%");
        return companies;
    }

    public List<Employee> retrieveEmployeesWithAnyTextFragment(EmployeeDao employeeDao, String textFragment){
        List<Employee> employees = employeeDao.retrieveEmployeeWithAnyTextFragmentName( "%" + textFragment + "%");
        return employees;

    }



}
