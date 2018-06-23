package taxi;

public interface Tariff {
    long calculatePrice(Ride ride);
}