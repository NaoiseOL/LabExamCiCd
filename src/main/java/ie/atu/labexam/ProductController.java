package ie.atu.labexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ServiceController myService;

    @Autowired
    public ProductController(ServiceController myService){
        this.myService = myService;
    }

    private List<Product> list = new ArrayList<>();

    @GetMapping
    public List<Product> getProducts(){
        list = myService.getProducts();
        return list;
    }

    @PostMapping
    public List<Product> addProducts(@RequestBody Product product){
        list=myService.addProducts(product);
        return list;
    }


}
