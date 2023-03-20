import java.time.LocalDate;

public class CarData {

    private LocalDate localDate;
    private String brand;
    private String price;
    private String color;

    public CarData(LocalDate localDate, String brand, String price, String color) {
        this.localDate = localDate;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarData{" +
                "localDate=" + localDate +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
