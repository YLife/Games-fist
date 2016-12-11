package peopleAndComputer;

import java.util.Scanner;

public class Game {
	int count;
	People people=new People();
	Computer computer=new Computer();
	
	public void initial() {
		System.out.println("--------�� ӭ �� �� �� Ϸ �� ��--------");
		System.out.println();
		System.out.println("        *************");
		System.out.println("        **  ��ȭ��ʼ    **");
		System.out.println("        *************");
		System.out.println();
		System.out.println("��ȭ����:1.���� 2.ʯͷ 3.��");
		Scanner sc = new Scanner(System.in);
		System.out.print("��ѡ��Է���ɫ:1������ 2����Ȩ 3���ܲ�:");
		int input = sc.nextInt();
		System.out.print("�������������:");
		people.setName(sc.next());
		computer.setName(input == 1 ? "����" : input == 2 ? "��Ȩ" : "�ܲ�"); 
		System.out.println(people.getName() + " VS " + computer.getName() + " ��ս");
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Ҫ��ʼ�� (y/n) :");
		int score1=0,score2=0;
		while (true) {
			String x = sc.next();
			System.out.println();
			if ("y".equals(x)) {
				int a = people.fist();
				int b = computer.fist();
				count ++;
				if(isWin(a, b)){
					System.out.println("�������ϲ����Ӯ�ˣ�");
					score1++;

				} else if (a == b) {
					System.out.println("������;֣�");
				} else {
					System.out.println("��������Ǵ󱿵�");
					score2++;

				}
			} else {
				break;
			}
			System.out.println();
			System.out.print("������һ��? y/n :");
		}
		people.setScore(score1);
		computer.setScore(score2);
	}
	
	private boolean isWin(int a, int b){
		String[] win = { "13", "21", "32" };
		for (String string : win) {
			if(string.equals(""+a+b)){
				return true;
			}
		}
		return false;
	}

	public void result() {
		System.out.println("--------------------------------");
		System.out.println(computer.getName() + "  VS " + people.getName());
		System.out.println("��ս������" + count);
		System.out.println();
		System.out.println("����" + "     �÷�");
		System.out.println(people.getName() + "   " + people.getScore());
		System.out.println(computer.getName() + "     " + computer.getScore());
		System.out.println();
		if (people.getScore() > computer.getScore()) {
			System.out.println("�������ϲ��ϲ��");
		} else if (people.getScore() == computer.getScore()) {
			System.out.println("�����ƽ�֣�");
		} else {
			System.out.println("��������Ǵ󱿵���");
		}
		System.out.println("--------------------------------");
	}
}
