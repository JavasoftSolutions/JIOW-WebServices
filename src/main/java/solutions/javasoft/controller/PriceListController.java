package solutions.javasoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solutions.javasoft.dao.model.PriceList;
import solutions.javasoft.dao.model.Product;
import solutions.javasoft.dao.repository.PriceListRepository;
import solutions.javasoft.dao.repository.ProductRepository;
import solutions.javasoft.dto.PriceListDto;

import javax.transaction.Transactional;

@RequestMapping("priceList")
@RestController
public class PriceListController {

    @Autowired
    private PriceListRepository priceListRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public PriceList createPriceList(@RequestBody PriceListDto priceListDto) {
        Product product = productRepository.getById(priceListDto.getProductCode());
        PriceList priceList = new PriceList();
        priceList.setPrice(priceListDto.getPrice());
        priceList.setName(priceListDto.getName());
        priceList.setDescription(priceListDto.getDescription());
        priceList.setProduct(product);
        return priceListRepository.save(priceList);
    }
}
