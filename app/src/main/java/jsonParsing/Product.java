package jsonParsing;

public class Product {
    private String id = "";
    private String barcode = "";
    private String product_name = "";
    private String brands = "";
    private String image = "";
    // private String[] categories_hierarchy;
    private String nova_score = "";
    // private String[] ingredients_analysis_tags;
    private String ecoscore_grade = "";
    private String manufacturing_places = "";
    private String green_score = "";
    private String image_url = "";

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNova_score() {
        return nova_score;
    }

    public void setNova_score(String nova_score) {
        this.nova_score = nova_score;
    }

    public String getEcoscore_grade() {
        return ecoscore_grade;
    }

    public void setEcoscore_grade(String ecoscore_grade) {
        this.ecoscore_grade = ecoscore_grade;
    }

    public String getManufacturing_places() {
        return manufacturing_places;
    }

    public void setManufacturing_places(String manufacturing_places) {
        this.manufacturing_places = manufacturing_places;
    }

    public String getGreen_score() {
        return green_score;
    }

    public void setGreen_score(String green_score) {
        this.green_score = green_score;
    }
}
