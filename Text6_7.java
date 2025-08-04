package java_textbook;

public class Text6_7 {
    public static void main(String[]args){
        int a=10;
        int b=2;
        int total=java_textbook.CalcLogic.Calc.tasu(a,b);
        int delta=java_textbook.CalcLogic.Calc.hiku(a,b);
        System.out.println("足すと"+total+"、引くと"+delta);
    }//CalcLogicフォルダからCalcファイルを呼び出してる
    /*CalcLogicフォルダはText6_7と並びが同じだけど、java_textbookから書かなきゃいけない
     Calcファイルのpackgeの欄を見て判断でも良さそう！！！*/
    
}
