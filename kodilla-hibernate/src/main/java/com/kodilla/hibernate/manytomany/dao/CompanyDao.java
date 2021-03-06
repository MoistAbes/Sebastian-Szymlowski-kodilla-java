package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

//17.4

public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> retrieveNameWithThreeFirstLetters(@Param("CHARACTERS") String characters);

    @Query(nativeQuery = true)
    List<Company> retrieveCompanyWithAnyTextFragment(@Param("CHARACTERS") String characters);

}
