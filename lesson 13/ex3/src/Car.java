class Car extends Vehicle {
    protected int numberOfSeats;

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;

    }

}