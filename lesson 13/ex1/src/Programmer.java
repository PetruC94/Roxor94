public class Programmer  {
    public Programmer(){
        numProgrammer=1;
        employ();
    }
    private int numProgrammer;
    public Programmer(int numProgrammer) {
     this.numProgrammer = numProgrammer;
        employ();
    }
    private void employ() {
        System.out.println(numProgrammer + " programmer");
    }
}