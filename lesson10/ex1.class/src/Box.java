public class Box {
    private double height;
    private double width;
    private double length;
    public Box(double height,double width,double length){
    this.height=height;
    this.length=length;
    this.width=width;
    }
public double getVolume(){
        return height*width*length;
}
}
