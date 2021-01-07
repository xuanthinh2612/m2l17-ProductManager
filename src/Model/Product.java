package Model;

import java.io.Serializable;

public class Product implements Serializable {
    private String productId;
    private String productName;
    private String producerName;
    private int price;

    public Product(String productId, String productName, String producerName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.producerName = producerName;
        this.price = price;
    }

    public Product() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", producerName='" + producerName + '\'' +
                ", price=" + price +
                '}';
    }
}
