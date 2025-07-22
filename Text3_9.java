public class Text3_9 {
    public static void main(String[]args){
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                System.out.print(i*j);/*入れ子構造の場合は内側から先に処理される（正確に言えば外・内・内・内・外・内～みたいな感じ） */
                System.out.print("　");
            }
            System.out.println("");//System.out.printlnとSystem.out.printの違いは改行するか否か（"print"の方が改行無し！）
        }
    }
    
}
