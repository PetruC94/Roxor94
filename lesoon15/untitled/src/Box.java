public class Box<T> {
    private Object item;
    public void put(Object item) {
        this.item = item;
    }
    public Object get() {
        return this.item;
    }
}