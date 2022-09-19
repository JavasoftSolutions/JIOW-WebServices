package solutions.javasoft.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solutions.javasoft.dao.model.PriceList;

public interface PriceListRepository extends JpaRepository<PriceList, Long> {

}
