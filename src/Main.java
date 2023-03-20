import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {



Car car=new Car(1,9191);
CarData carData=new CarData(LocalDate.of(1992,12,12),"volkswagen","4000$","green");

        HashMap<Car,CarData>hashMap=new HashMap<>();
        hashMap.put(car,carData);
        System.out.println(hashMap.entrySet());
    

    }
}