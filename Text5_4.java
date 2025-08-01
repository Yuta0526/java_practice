public class Text5_4 {
    public static void main(String[]args){
        System.out.println("メソッドを呼び出します");
        hello("ユウタ");
        hello("モモカ");
        hello("コトハ");
        System.out.println("メソッドを終了します");
    }

    public static void hello(String name){
        System.out.println(name+"さん、こんにちは");
    }
    
}
