package jsonParsing;
public class Purchase {
    private String purchase_id = "";
    private String product_time = "";
    private String partner_id = "";
    private String partner_name = "";
    private String total_amount = "";
    private String total_coins = "";
    private Product[] products;
    private String partner_icon_url = "";

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getPartner_icon_url() {
        return partner_icon_url;
    }

    public void setPartner_icon_url(String partner_icon_url) {
        this.partner_icon_url = partner_icon_url;
    }

    public String getPurchase_id() {
        return purchase_id;
    }

    public void setPurchase_id(String purchase_id) {
        this.purchase_id = purchase_id;
    }

    public String getProduct_time() {
        return product_time;
    }

    public void setProduct_time(String product_time) {
        this.product_time = product_time;
    }

    public String getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(String partner_id) {
        this.partner_id = partner_id;
    }

    public String getPartner_name() {
        return partner_name;
    }

    public void setPartner_name(String partner_name) {
        this.partner_name = partner_name;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getTotal_coins() {
        return total_coins;
    }

    public void setTotal_coins(String total_coins) {
        this.total_coins = total_coins;
    }
}
