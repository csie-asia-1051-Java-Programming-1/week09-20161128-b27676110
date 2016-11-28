package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int data [] = new 
		int n = scn.nextInt();
		for(int i = 1;i<=n;i++){
			if(n%i==0){
				System.out.print(i+" ");
				
				for(int j = 0;j<data.length;j++){
					data[j] = {i};
				}
				
			}
		}
		

	}

}
