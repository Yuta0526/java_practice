package java_textbook;

public class Text8_11 {
    public static void main(String[]args){
        Text8_2 h=new Text8_2();//勇者を生成
        h.name="ミナト";//フィールドに初期値をセット（名前つけた）
        h.hp=100;
        System.out.println("勇者"+h.name+"を生み出しました！");
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();
    }
    
}
