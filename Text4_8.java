public class Text4_8 {
    public static void main(String[]args){
        int[] scores={20,30,40,50,60};
        int sum=scores[0]+scores[1]+scores[2]+scores[3]+scores[4];//要素に値を入れるときの省略記述
        int avg=sum/scores.length;
        System.out.println("合計は："+sum);
        System.out.println("平均は："+avg);


    }
    
}
