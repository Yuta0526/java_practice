public class Practice5_4{
    public static void main(String[]args){
        int x=10;
        int y=23;
        double z=5.0;
        int ans=calcTrinangleArea(x,y);
        double Ans=calcCircleArea(z);
        System.out.println("・三角形の底辺の長さが"+x+"cm、高さが"+y+"cmの場合、面積は"+ans+"平方cm");
        System.out.println("・円の半径が"+z+"cmの場合、面積は"+Ans+"平方cm");
    }

    public static int calcTrinangleArea(int x,int y){
        return x*y/2;
    }

    public static double calcCircleArea(double z){
        return z*z*3.14;
    }
}