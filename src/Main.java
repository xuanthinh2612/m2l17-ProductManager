import Manager.ProductManager;
import Model.Product;
import Storage.ProductReadAndWrite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = ProductReadAndWrite.readFromFile();
        ProductManager manager1 = new ProductManager(list);
        manager1.addNewProduct(new Product("SP01","Iphone 6","Apple",800));
        manager1.addNewProduct(new Product("SP02","Iphone 7","Apple",900));
        manager1.showAll();
//        manager1.edit(0,new Product("SP03","Iphone 7","Apple",900));
//        manager1.delete(0);
    }
}
