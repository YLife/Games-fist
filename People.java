package peopleAndComputer;

import java.util.Scanner;

public class People extends Player{
	
	@Override
	public int fist() {
		// TODO Auto-generated method stub
		System.out.print("���ȭ:1.���� 2.ʯͷ 3.��(������Ӧ����):");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if (input==1) {
			System.out.println("���ȭ:����");
		}else if(input==2){
			System.out.println("���ȭ:ʯͷ");
		}else if(input==3){
			System.out.println("���ȭ:��");
		}else{
			System.out.println("��������");
		}
		return input;
	}
	
	
}
