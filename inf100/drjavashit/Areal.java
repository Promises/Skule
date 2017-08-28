public class Areal{
  public static void main(String[] args){
    double side = 5.0;
    double radius = 10.0;
    double areal = side*side;
    System.out.println("Arealet til eit kvadrat med sidelengde på " + side + " er " + areal);
    areal = 3.14*radius*radius;
    System.out.println("Arealet til sirkelen med radius på " + radius + " er " + areal);
  }
}
