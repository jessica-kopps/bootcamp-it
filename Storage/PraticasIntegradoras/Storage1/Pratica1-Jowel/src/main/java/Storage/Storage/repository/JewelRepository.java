package Storage.Storage.repository;

import Storage.Storage.model.Jewel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JewelRepository extends JpaRepository<Jewel, Long>{

}