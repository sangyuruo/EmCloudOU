package com.emcloud.ou.repository;

import com.emcloud.ou.domain.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;

import java.util.List;


/**
 * Spring Data JPA repository for the Company entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
  /// Page<Company> findAllByCompanyNameContaining(Pageable pageable, String companyName);
   // @Query("from Company c where  c.addressName like %:companyName% or c.companyName like %:addressName%")
   // List<Company> findalltest(@Param("companyName") String companyName, @Param("addressName") String addressName);
   Page<Company> findByCompanyNameContainingOrAddressNameContaining(Pageable pageable, String companyName, String addressName);

   List<Company> findAll();
   List<Company> findByCompanyName(String companyName);
}
