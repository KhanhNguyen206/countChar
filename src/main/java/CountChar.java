import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String str="nnnkkk";

        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào đây kí tự muốn đếm");
        char n='n';
        int count=0;

        for (int i=0; i<str.length(); i++){
            if((str.charAt(i))== n){
                count++;
            }
        }
        System.out.println(count);
    }
}
