package peopleAndComputer;

import java.util.Scanner;

public class Game {
	int count;
	People people=new People();
	Computer computer=new Computer();
	
	public void initial() {
		System.out.println("--------欢 迎 进 入 游 戏 世 界--------");
		System.out.println();
		System.out.println("        *************");
		System.out.println("        **  猜拳开始    **");
		System.out.println("        *************");
		System.out.println();
		System.out.println("出拳规则:1.剪刀 2.石头 3.布");
		Scanner sc = new Scanner(System.in);
		System.out.print("请选择对方角色:1：刘备 2：孙权 3：曹操:");
		int input = sc.nextInt();
		System.out.print("请输入你的姓名:");
		people.setName(sc.next());
		computer.setName(input == 1 ? "刘备" : input == 2 ? "孙权" : "曹操"); 
		System.out.println(people.getName() + " VS " + computer.getName() + " 对战");
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("要开始吗？ (y/n) :");
		int score1=0,score2=0;
		while (true) {
			String x = sc.next();
			System.out.println();
			if ("y".equals(x)) {
				int a = people.fist();
				int b = computer.fist();
				count ++;
				if(isWin(a, b)){
					System.out.println("结果：恭喜，你赢了！");
					score1++;

				} else if (a == b) {
					System.out.println("结果：和局！");
				} else {
					System.out.println("结果：你是大笨蛋");
					score2++;

				}
			} else {
				break;
			}
			System.out.println();
			System.out.print("继续下一轮? y/n :");
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
		System.out.println("对战次数：" + count);
		System.out.println();
		System.out.println("姓名" + "     得分");
		System.out.println(people.getName() + "   " + people.getScore());
		System.out.println(computer.getName() + "     " + computer.getScore());
		System.out.println();
		if (people.getScore() > computer.getScore()) {
			System.out.println("结果：恭喜恭喜！");
		} else if (people.getScore() == computer.getScore()) {
			System.out.println("结果：平局！");
		} else {
			System.out.println("结果：你是大笨蛋！");
		}
		System.out.println("--------------------------------");
	}
}
