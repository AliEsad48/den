package day27_staticKeyword;

public class StaticMember {
	
	static int x;
	int y;
	
	StaticMember(){
		x+=2;//x=2 x= 4
		y++;// y=1	y= 1
	}
	static int getSquare() {
		return x*x;
			}
	
	public static void main(String[] args) {
		StaticMember sm1= new StaticMember();
		StaticMember sm2= new StaticMember();
		
		int z= sm1.getSquare();
	System.out.println("-x"+ z + "-y"+ sm2.y);
		
		
		

	}

}
