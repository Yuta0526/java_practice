package java_textbook;

public class Text8_16 {
    public static void main(String[]args){
        Text8_2 h=new Text8_2();//勇者を生成
        h.name="ミナト";//フィールドに初期値をセット（名前つけた）
        h.hp=100;
        
        Text8_6 m1=new Text8_6();
        m1.hp=50;
        m1.suffix='A';//キノコに名前付け

        Text8_6 m2=new Text8_6();
        m2.hp=48;
        m2.suffix='B';

        h.slip();
        m1.run();
        m2.run();
        h.run();
    }
    
    
}
