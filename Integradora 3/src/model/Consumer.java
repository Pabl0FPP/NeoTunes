package model;

public abstract class Consumer extends User{

    private int accumulatedReproductions;
    private double totalReproducedTime;

    public Consumer(String nickname, String id, Date bondingDate, int accumulatedReproductions, double totalReproducedTime) {
        super(nickname, id, bondingDate);
        this.accumulatedReproductions = accumulatedReproductions;
        this.totalReproducedTime = totalReproducedTime;
    }

}
