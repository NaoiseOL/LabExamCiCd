package ie.atu.labexam;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceController {
    public List<Product> myList = new ArrayList<>();

    public List<Product> getProducts(){
        return myList;
    }

    public List<Product> addProducts(Product product){
        myList.add(product);
        return myList;
    }
}
