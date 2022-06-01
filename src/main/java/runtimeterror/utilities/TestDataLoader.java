package runtimeterror.utilities;

import runtimeterror.businesslogic.Car;
import runtimeterror.businesslogic.Dealership;
import runtimeterror.businesslogic.DealershipFactory;

import java.io.FileNotFoundException;

public class TestDataLoader {
    public void loadData() throws FileNotFoundException {
        Dealership dealership = DealershipFactory.getDealership("Ignite");
        dealership.getCustomers().addCustomer("Zohaib", "Adnan", 741, "zohaib", "1234", "03080001370");
        dealership.getCustomers().addCustomer("Moiz", "Sajid", 692, "moiz", "1234", "12345678");

        for (int i = 0; i < 1; i++) {
            Car car = dealership.getCatalogue().addCar("2018", "Honda", "Civic", 47, 1247, "2018_honda_civic.png");
            car.addVariant("6-Speed MT", 2000, "Manual", 158, 5.8, 3600000);
            car.addVariant("7-Speed CVT", 2000, "Automatic", 158, 6.1, 3800000);
            car.addColor("Black");
            car.addColor("Grey");
            car.addColor("Silver");
            car.addColor("White");

            car = dealership.getCatalogue().addCar("2019", "Toyota", "Corolla", 50, 1285, "2019_toyota_corolla.png");
            car.addVariant("6-Speed MT", 1800, "Manual", 132, 7.5, 3300000);
            car.addVariant("7-Speed CVT", 1800, "Automatic", 132, 7.8, 3500000);
            car.addColor("Black");
            car.addColor("Gold");
            car.addColor("Metallic");
            car.addColor("White");

            dealership.getCatalogue().addCar("2019", "Kia", "Sportage", 62, 1631, "2019_kia_sportage.png");
            dealership.getCatalogue().addCar("2017", "Mitsubishi", "Lancer", 59, 1320, "2017_mitsubishi_lancer.png");
            dealership.getCatalogue().addCar("2018", "BMW", "5 Series", 68, 2064, "2018_bmw_5_series.png");
            dealership.getCatalogue().addCar("2018", "Hyundai", "Elantra", 53, 1255, "2018_hyundai_elantra.png");
            dealership.getCatalogue().addCar("2018", "Toyota", "Camry", 55, 1470, "2018_toyota_camry.png");
        }
    }
}
