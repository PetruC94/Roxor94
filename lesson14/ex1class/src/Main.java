public class Main {
    public static void main(String[] args) {
        Parent first=new fisrtsubclass();
        Parent second= new secondsubclas();
        Parent[] parents= {first,second};
        for (Parent parent : parents) {
            parent.message();
        }
    }

}

