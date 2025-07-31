public class Practice4_4 {
    public static void main(String[]args){
        int[]numbers={3,4,9,};
        System.out.println("1桁の数字を入力してください");
        int input=new java.util.Scanner(System.in).nextInt();
        for(int n:numbers){
            if(input==n){/*"=="の左右の順序は特段気にしなくても良きかな？ */
                System.out.println("アタリ！");
            }//else{System.out.println("はずれー");を入れれば外した回数分文字が表示される
            }
        }

    }

