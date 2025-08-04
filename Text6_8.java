package java_textbook;
import java_textbook.CalcLogic.Calc;
//Calc=java_textbookのCalcLogicに所属するCalcだと解釈しろと命令
public class Text6_8 {
    public static void main(String[]args){
        int a=10;
        int b=2;
        int total=Calc.tasu(a,b);
        int delta=Calc.hiku(a,b);//最初にimportしてるからここでは宣言を省略できる！！！
        System.out.println("足すと"+total+"、引くと"+delta);
    }
    
}
