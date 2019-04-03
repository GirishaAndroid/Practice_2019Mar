package andorid.sample.practice_2019mar.databindingsample.model;

import java.math.BigDecimal;

public class Product {

    private static final String TAG = "Product";

    private String title;
    private String description;
    private int image;
    private BigDecimal price;
    private BigDecimal sale_price;
    private int num_ratings;
    private BigDecimal ratings;
    private int serial_number;

    public Product(String title, String description, int image, BigDecimal price, BigDecimal sale_price, int num_ratings, BigDecimal ratings, int serial_number) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.price = price;
        this.sale_price = sale_price;
        this.num_ratings = num_ratings;
        this.ratings = ratings;
        this.serial_number = serial_number;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image=" + image +
                ", price=" + price +
                ", sale_price=" + sale_price +
                ", num_ratings=" + num_ratings +
                ", ratings=" + ratings +
                ", serial_number=" + serial_number +
                '}';
    }

    public static String getTAG() {
        return TAG;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSale_price() {
        return sale_price;
    }

    public void setSale_price(BigDecimal sale_price) {
        this.sale_price = sale_price;
    }

    public int getNum_ratings() {
        return num_ratings;
    }

    public void setNum_ratings(int num_ratings) {
        this.num_ratings = num_ratings;
    }

    public BigDecimal getRatings() {
        return ratings;
    }

    public void setRatings(BigDecimal ratings) {
        this.ratings = ratings;
    }

    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }

    public boolean hasSalePrice() {
        double saleprice = sale_price.doubleValue();
        if (saleprice > 0) {
            return true;
        } else
            return false;
    }
}
