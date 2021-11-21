package jsonParsing;
//[[1, "2021-11-19 08:15:00", 1, "Edeka", 27.0, "27.0000"], [2, "2021-11-19 14:20:15", 1, "Edeka", 5.0, "5.0000"], [4, "2021-11-20 07:09:20", 2, "Lidl", 128.0, "128.0000"]]
public class Purchase {
    private String purchase_id = "";
    private String product_time = "";
    private String partner_id = "";
    private String partner_name = "";
    private String total_amount = "";
    private String total_coins = "";

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
