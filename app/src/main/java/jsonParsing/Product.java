package jsonParsing;

public class Product {
    private String product_id = "";
    private String product_name = "";
    private String quantity = "";
    private String total_amount = "";
    private String coins_earned = "";
    private String product_image = "";
    private String barcode = "";

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getCoins_earned() {
        return coins_earned;
    }

    public void setCoins_earned(String coins_earned) {
        this.coins_earned = coins_earned;
    }
}
