import java.util.Date;

//this class represents a product
public class Product{

    private String name;
    private float price;
    private int stock;
    Date updated;

    //updated should
    public Product(String name, float price, int stock, Date updated){
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.updated = updated;
    }

    String getName(){
        return name;
    }

    float getPrice(){
        return price;
    }

    int getStock(){
        return stock;
    }

    Date getUpdated(){
        return updated;
    }
}

