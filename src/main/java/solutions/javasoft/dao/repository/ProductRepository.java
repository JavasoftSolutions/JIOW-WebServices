package solutions.javasoft.dao.repository;

import org.springframework.data.repository.CrudRepository;
import solutions.javasoft.dao.model.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
}
