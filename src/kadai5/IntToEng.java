package kadai5;
import java.util.Scanner;
import java.io.*;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {
		
	System.out.println("0から99のまでの数字を1つ入力してください。");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッドimport java.io.*;
    static String translateEng(int n) {

	
	//0~19
	String[] x = {"zero", "one", "two", "three", "four","five", "six", "seven", "eight", "nine","ten", "eleven", "twelve", "thirteen", "fourteen","fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	
	//10の倍数
	String[] y = {"twenty", "thirty", "forty", "fifty", "sixty","seventy", "eighty", "ninety"};
	

	int a;
	if(0<=n && n<20){
	    a = x[n];
	} else if(n.charAt(1)==0){
	    a = y[n.charAt(0)-2];
	}
	
        return a.toString();
    }
}
