package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {

    Long itemId = 0L;
    String itemName = "";
    Double itemPrice = 0.01;

    public Item() {

    }

    public Item(Long id, String name, Double price) {

        itemId = id;
        itemName = name;
        itemPrice = price;
    }

    public String getName() {

        return itemName;
    }

    public void setName(String name) {

        itemName = name;
    }

    public Long getId() {

        return itemId;
    }

    public void setId(Long id) {

        itemId = id;
    }

    public Double getPrice() {

        return itemPrice;
    }

    public void setPrice(Double price) {

        itemPrice = price;
    }
}
