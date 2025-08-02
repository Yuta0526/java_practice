public class Text5_10 {
    public static int add(int x,int y){
        return x+y;//int ans=x+yを挟まなくても結果は同じ（内容によっては変数を置いた方が良いかも）
    }

    public static double add(double x,double y){
        return x+y;
    }

    public static String add(String x,String y){
        return x+y;
    }

    public static void main(String[]args){//メソッド名が同じでも仮引数の型が違うから許される=オーバーロード
        System.out.println(add(10,20));
        System.out.println(add(3.5,2.7));
        System.out.println(add("Hello","World"));
    }
    
}
