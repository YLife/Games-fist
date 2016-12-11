package peopleAndComputer;

public class Computer extends Player{
	
	@Override
	public int fist() {
		// TODO Auto-generated method stub
		int input=(int)(Math.random()*3+1);
		String str = input==1?"出拳:剪刀":input==2?"出拳:石头":"出拳:布";
		System.out.println(super.getName()+str);
		return input;
	}
	
}
