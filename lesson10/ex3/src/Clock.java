public class Clock{


    public int minutes;
    public int hours;



    public void next(){
        int count=minutes+1;
        if(count==60){
                hours++;
                minutes=0;
            }else {
            minutes++;
        }
        System.out.println("Time is "+this.hours+":"+this.minutes);
    }
}