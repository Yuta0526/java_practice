public class Text3_5 {
    public static void main(String[]args){
        System.out.println("あなたの運勢を占います");
        int fortune=new java.util.Random().nextInt(5)+1;
        switch(fortune){
            case 1,2 ->{//if文の"または"で使う"||"はswitch文では使わない！！
                System.out.println("いいね");
            }
            case 3 ->/*"->"を矢印だと認識したら覚えやすい*/{
                System.out.println("普通です");
            }
            case 4,5 ->{
                System.out.println("うーん");
            }
        }
    }
    
}
