package kjs_project0928;

import java.util.Scanner;
class Phone{
	String name, number;
	public Phone(String name, String number) {

		this.name=name; this.number=number;
	}
	public String return_name(){

		return name;
	}
	public String return_number(){

		return number;

	}
}
public class PhoneBook {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수>>");
		int num=scanner.nextInt();

		Phone [] phone=new Phone[num]; //배열
		for(int i=0;i<num;i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name=scanner.next();

			String number=scanner.next();

			phone[i]=new Phone(name,number);
		}
		System.out.print("저장되었습니다...\n");
		
		while(true) {
			System.out.print("검색할 이름>>");
			String new_name=scanner.next();
			if(!new_name.equals("그만")) {

				for(int i=0;i<num+1;i++) {

					if(i==num) System.out.print(new_name+" 이 없습니다.\n");

					else if(phone[i].return_name().equals(new_name)) {

				 		System.out.print(new_name+"의 번호는 "+phone[i].number+" 입니다.\n");

						break;

					}
				}
			}
			else break;
		}
	}
}
