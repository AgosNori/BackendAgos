
package com.MyPortfolio.AgosN.Security.Repository;

import com.MyPortfolio.AgosN.Security.Entity.Rol;
import com.MyPortfolio.AgosN.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository  extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
