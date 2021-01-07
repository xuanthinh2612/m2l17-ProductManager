package Manager;

import Model.Product;
import Storage.ProductReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    public List<Product> list = new ArrayList<>();

    public ProductManager(List<Product> list) {
        this.list = list;
    }

    public void addNewProduct(Product product){
       list.add(product);
       ProductReadAndWrite.writeToFile(list);
        System.out.println("added success");
    }
    public void showAll(){
        for (Product p: list) {
            System.out.println(p.toString());
        }
    }
    public void edit(int index,Product product){

        list.set(index,product);
        ProductReadAndWrite.writeToFile(list);
        System.out.println("added success");
    }
    public void delete(int index){

        list.remove(index);
        ProductReadAndWrite.writeToFile(list);
    }
}
