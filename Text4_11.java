public class Text4_11 {
    public static void main(String[]args){
        int[]scores={20,80,40,50,60};
        int count=0;
        for(int i=0;i<scores.length;i++){
            if(scores[i]>=50){
                count++;/* "count++"はただ１を足してるだけ
                ifの通過した分だけ＋していけばよいから"++で事足りる*/
            }
        }
        System.out.println("50点以上の科目数は："+count);
    }
    
}
