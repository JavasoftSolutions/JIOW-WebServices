package solutions.javasoft.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solutions.javasoft.dao.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
