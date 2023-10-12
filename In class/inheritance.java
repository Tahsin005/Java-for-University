/*Write a java program to calculate the area of a room and volume with 
 * single inheritance strategy
*/
// import java.util.*;
class Room{
    int length;
    int breadth;
    Room(int x,int y){
        length = x;
        breadth = y;
    }

    int area(){
        return (length * breadth);
    }
}
class Bedroom extends Room{
    int height;
    Bedroom(int x,int y,int z){
        super(x, y);
        height = z;
    }

    int volume(){
        return (length * breadth * height);
    }

}
public class inheritance{
    public static void main(String[] args) {
        Bedroom room1 = new Bedroom(14, 12, 10);
        int area1 = room1.area();
        int volume1 = room1.volume();
        System.out.println("Area1 = " + area1);
        System.out.println("Volume = " + volume1);
    }
}