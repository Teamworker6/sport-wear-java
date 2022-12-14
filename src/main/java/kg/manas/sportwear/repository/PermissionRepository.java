package kg.manas.sportwear.repository;


import kg.manas.sportwear.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {

    //Optional<Permission> findByPermissionNameAndRdtIsNull(String roleName);
    Optional<Permission> findByIdAndRdtIsNull(Long id);

    Optional<List<Permission>> findAllByRdtIsNull();
}
