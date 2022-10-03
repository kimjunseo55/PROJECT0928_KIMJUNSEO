package kjs_project0928;

import java.util.Scanner;
class Dictionary{
	private static String[] kor= {"사랑", "아기","돈","미래","희망"};
	private static String [] eng= {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		for(int i=0;i<6;i++) {
			if(i==5) return "없음";
			else if(kor[i].equals(word)) return eng[i];
		}
		return "";
	}

}

public class DicApp {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);

		System.out.println("한영 단어 검색 프로그램입니다.");

		while(true) {

			System.out.print("한글 단어?");

			String word=s.next();

			if(word.equals("그만")) break;

			Dictionary Dic=new Dictionary(); //객체 생성

			String solution=Dic.kor2Eng(word);

			if(!solution.equals("없음")) {

				System.out.println(word+"은 "+solution);

			}

			else {

				System.out.println(word+"는 저의 사전에 없습니다.");

			}

		}
	}
}
