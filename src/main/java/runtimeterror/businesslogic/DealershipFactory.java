package runtimeterror.businesslogic;

public class DealershipFactory {
    private static Dealership dealership = null;

    public static Dealership getDealership(String name) {
        if (dealership == null)
            dealership = new Dealership(name);
        return dealership;
    }

    public static Dealership getDealership() {
        if (dealership == null)
            dealership = new Dealership(null);
        return dealership;
    }
}
