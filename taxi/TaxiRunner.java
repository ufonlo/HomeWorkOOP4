package taxi;

public class TaxiRunner {
    public static void main(String[] args) {
        Tariff familyTariff = new FamilyTariff();
        Tariff standardTariff = new StandardTariff();
        Ride rideOne= new Ride(2,15,55,familyTariff);
        Ride rideTwo= new Ride(3,8,27,standardTariff);
        RidesHistory ridesHistory = new RidesHistory();
        ridesHistory.addRide(rideOne);
        ridesHistory.addRide(rideTwo);

        System.out.println(ridesHistory);
        System.out.println(rideOne.getPrice());
        System.out.println(rideTwo.getPrice());
        System.out.println(ridesHistory.getTotalPrice());//330
    }
}