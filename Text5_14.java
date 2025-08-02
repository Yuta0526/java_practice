public class Text5_14 {
    public static int[]makeArray(int size){
        int[]newArray=new int[size];
        for(int i=0;i<newArray.length;i++){
            newArray[i]=i;//要素数０，１，２に０，１，２を代入している
        }
        return newArray;
    }

    public static void main(String[]args){
        int[]array=makeArray(3);//="int[]array={0,1,2}"ってことかな（配列へ実際に値が入ってなければ全て０が表示される）
        for(int i:array){
            System.out.println(i);
        }
    }
    
}
