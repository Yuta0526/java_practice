public class Practice5_2 {
    public static void main(String[]args){
        email("yuuta@icloud.com","面接日程について","送信した日程でお間違いないでしょうか？");
    }

    public static void email(String address,String title,String text){
        System.out.println(address+"に、以下のメールを送信しました。");
        System.out.println("件名："+title);
        System.out.println("本文："+text);
    }
    
}
