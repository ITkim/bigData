/*��ǰ ����
 * 1. ���� ��� ���뿡 ���ؼ� 3���� �޼ҵ带 ����
 * 2. �ݺ� , ���� � ���� ������ ���� �� �ִ� �ϳ��� lab ����
 * 3. ���� : �� ¦���� �����ϴ� ����...
 * 
 */


package step01.syntax;
import java.util.Scanner;


public class Step10MyArt {

	static int x=5;
	static int y=15;
	
	public static void drawGround(int row,int column,int chX,int chY)
	{
		x=chX;
		y=chY;
		char rec = '��';
		char rec2= '��';
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				
				if(i==x&&j==y)
					makeCharacter('*');
				else
				{
					if(i==0||j==0||i==row-1||j==column-1)
						System.out.print(rec2);
					else
						System.out.print(rec);
				}
					
			}
			System.out.println();
		}
	}
	public static void makeCharacter(char ch)
	{
		System.out.print(ch);
	}
	public static void moveCharacter(char direction,int value)
	{
		if(direction=='r')
		{
			y=y+value;
		}
		else if(direction=='l')
		{
			y=y-value;
		}
		else if(direction=='u')
		{
			x=x-value;
		}
		else if(direction=='d')
		{
			x=x+value;
		}
		
		drawGround(10,31,x,y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String direction;
		String value;
		char dir;
		
		int val;
		int count=0;
		while(true)
		{
			Scanner scan = new Scanner(System.in);  
			
	        
	        if(count==0)
			{
	        	System.out.println("������ ���ƴٴϴ� ¦�ᣪ");
				dir='r';
				val=0;
			}
	        else {
	        	System.out.println("������ ����(r,l,u,d)�� �̵� �Ÿ�(1~5)�� �Է��ϼ���:");  
	        	direction = scan.next();
	        	value = scan.next();
	        	dir = direction.charAt(0);
	        	val = Integer.parseInt(value);
	        }
	        	if(dir=='r'||dir=='l'||dir=='u'||dir=='d'&&(val>=1&&val<=5))
	        	{
	        		moveCharacter(dir,val);
	        	}
	        	else if(dir!='r'||dir!='l'||dir!='u'||dir!='d')
	        		System.out.println("������ �ùٸ��� �Է��ϼ���");
	        	else if(val>5||val<1)
	        		System.out.println("�̵��Ÿ��� �ùٸ��� �Է��ϼ���");
	        
	        count++;
			
		}
	}

}
