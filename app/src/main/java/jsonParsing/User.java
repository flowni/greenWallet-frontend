package jsonParsing;

public class User {
    // {"id": 1, "name": "Nicholas", "email": "nicholas@summ-ai.com", "barcode": "023723387323", "total_coins_earned": 100, "balance": 100}
    private String id;
    private String name;
    private String email;
    private String barcode;
    private String total_coins_earned;
    private String balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTotal_coins_earned() {
        return total_coins_earned;
    }

    public void setTotal_coins_earned(String total_coins_earned) {
        this.total_coins_earned = total_coins_earned;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
