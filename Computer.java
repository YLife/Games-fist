package peopleAndComputer;

public class Computer extends Player{
	
	@Override
	public int fist() {
		// TODO Auto-generated method stub
		int input=(int)(Math.random()*3+1);
		String str = input==1?"��ȭ:����":input==2?"��ȭ:ʯͷ":"��ȭ:��";
		System.out.println(super.getName()+str);
		return input;
	}
	
}
