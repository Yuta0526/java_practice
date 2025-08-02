public class Text5_11 {
    public static int add(int x,int y){
        return x+y;
    }

    public static int add(int x,int y,int z){
        return x+y+z;
    }

    public static void main(String[]args){
        System.out.println("30+110="+add(add(10,20),add(40,10,60)));
    }
    
}
