package oneline;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		int random = (int)(Math.random() * 10);
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("数字を入力してください。");
			int num = scanner.nextInt();
			if( num == random) {
				break;
			}else if(num > random) {
				System.out.println("ちがうよ,でかいでかい");
			} else {
				System.out.println("ちがうよ,ちいさいちいさい");
			}
			
			
		}
		System.out.println("あたり！" + random + "でした！");
	}

}
