package oneline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSequence {

	public static void main(String[] args) {
		List<Integer> randomNumList = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			int random = (int)(Math.random() * 10);
			randomNumList.add(random);
		}
		while(true) {
			System.out.print("2桁の数列を入力してください:");
			String inputStr = scanner.next();
			if (inputStr.length() != 2) {
				System.out.print("入力された数列が2桁以外になっています、2桁の数列を入力してください:");
				continue;
			}
			List<String> inputNumList = new ArrayList<>();
			inputNumList.add(String.valueOf(inputStr.charAt(0))); // inputStrから1文字めを取り出しStringに変換してリストに追加
			inputNumList.add(String.valueOf(inputStr.charAt(1))); 
			if (randomNumList.get(0).toString().equals(inputNumList.get(0)) && randomNumList.get(1).toString().equals(inputNumList.get(1))) {// 1桁目と2桁目が一致
				System.out.print("大正解！！");
				break;
			}
			
			if (!randomNumList.get(0).toString().equals(inputNumList.get(0))) {
				System.out.println("1番目の数値が間違っています。");
			}
			if (!randomNumList.get(1).toString().equals(inputNumList.get(1))) {
				System.out.println("2番目の数値が間違っています。");
			}
		}
	}

}
