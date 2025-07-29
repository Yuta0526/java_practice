public class Text4_10 {
    public static void main(String[]args){
        int[]scores={20,30,40,50,60};
        int sum=0;
        for(int i=0;i<scores.length;i++){//最初のintを忘れた
            sum+=scores[i];//足していくことをループの中に加えている
        }//"sum+=?"="sum=sum+?"であるsumに?入れただけじゃ変数に代入し直したことになっちゃう（前にやりました）
        int avg=sum/scores.length;
        System.out.println("合計点は："+sum);
        System.out.println("平均点は："+avg);
    }
    
}
