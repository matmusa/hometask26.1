public class Car {

    private int  carId;
    private int carNumber;

    public Car(int carId, int carNumber) {
        this.carId = carId;
        this.carNumber = carNumber;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carNumber=" + carNumber +
                '}';
    }
}
