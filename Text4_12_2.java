public class Text4_12_2 {
    public static void main(String[]args){
        int[] seq=new int[10];
        for(int i=0;i<seq.length;i++){
            seq[i]=new java.util.Random().nextInt(4);
        }
        for(int i=0;i<seq.length;i++){
            char[]base={'A','T','G','C'};
            System.out.print(base[seq[i]]+"");//seqの要素数とbaseの要素数が合致するからseqが指定されるとbaseも指定される

        }//変数+""で変数の中身が文字列として表示される
    }
    
}
