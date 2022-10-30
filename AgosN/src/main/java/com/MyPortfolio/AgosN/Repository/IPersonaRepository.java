
package com.MyPortfolio.AgosN.Repository;

import com.MyPortfolio.AgosN.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona , Long>{
    
}
