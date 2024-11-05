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

    public List<Product> updateProduct(String productCode, Product product){
        for(Product p: myList){
            if(p.getProductCode().equals(productCode)){
                p.setProductName(product.getProductName());
                p.setCategory(product.getCategory());
                p.setQuantity(product.getQuantity());
                p.setPrice(product.getPrice());
            }
        }
        return myList;
    }

    public List<Product> deleteProduct(String productCode){
        for(Product p: myList){
            if(p.getProductCode().equals(productCode)){
                myList.remove(p);
            }
        }
        return myList;
    }
}
