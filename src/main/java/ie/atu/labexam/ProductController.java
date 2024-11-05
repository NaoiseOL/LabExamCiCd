package ie.atu.labexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
