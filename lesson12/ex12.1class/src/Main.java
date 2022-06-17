public class Main {
    public static void main(String[] args) {
        Employee p1=new Employee( "Petru","2000" );
        ContractEmployee p2=new ContractEmployee( "Petru","2000",300,"Unlimited" );
    RegularEmployee p3=new RegularEmployee( "Petru","2000",2000,"" );
        System.out.println("Numele "+p1.name);
        System.out.println("Data nasterii "+p1.birthDate);
        System.out.println("Contract "+p2.contractPeriod);
        System.out.println("Salariu "+p3.salary);
    }
}