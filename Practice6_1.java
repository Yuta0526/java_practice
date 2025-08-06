package java_textbook;
import java_textbook.SubPractice6_1.Zenhan;
import java_textbook.SubPractice6_1.Kouhan;//このimportは無しで良い
public class Practice6_1 {
    public static void main(String[]args)throws Exception{
        Zenhan.doWarusa();
        Zenhan.doTogame();
        Kouhan.callDeae();//SubPractice.を追加すれば呼び出せる（importでSubPracticeまでは宣言してるから、java_textbook.はいらない？）
        Kouhan.showMondokoro();

    }
    
}
