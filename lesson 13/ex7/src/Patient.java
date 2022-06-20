class Patient extends Person {
    protected int height;
    public Patient(String name, int age, int height) {
        super(name, age);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "height=" + height +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}