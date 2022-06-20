class Vehicle {
    protected String licensePlate;

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                '}';
    }

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;

    }
}