package MakeCircle;

import java.io.IOException;
import java.util.Scanner;

public class MakeCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = 1;
		boolean con;
		while(con = (radius != 0))
		{
			boolean b;
			String str;
			Scanner scan = new Scanner(System.in);
			System.out.println("################ 원 만들기 프로그램 ###############");
			System.out.println("\"*\"로 원을 만드는 프로그램입니다.");
			System.out.println("숫자(반지름)입력시 해당 숫자 크기 만큼의 원을 만들 수 있습니다.");
			System.out.println("############################################");
			System.out.print("숫자를 입력해주세요(1부터 숫자 입력, 0입력시 종료) : ");
			str = scan.next();
			scan.nextLine();
			radius = Integer.parseInt(str);
			System.out.println("반지름 "+radius+"이(가) 입력되었습니다");
			if(radius == 0)
			{
				System.out.println("프로그램을 종료합니다");
			}
			else
			{
				
				char circle [][] = new char [radius*2][radius*4]; 
				for(int i = 0;i < radius*2; i++)
				{
					for(int j = 0; j< radius*4; j++)
					{
						if(radius*radius > (i+0.5-radius)*(i+0.5-radius)+(j/2+0.5-radius)*(j/2+0.5-radius))
						{
							circle[i][j]='*';
							circle[i][++j]=' ';
						}						
					}
					System.out.println(circle[i]);
				}
				System.out.println("");
				System.out.println("Enter 키를 누르세요");
				pause();
			}
		}
	}
	public static void pause()
	{
		try{
			System.in.read();
		} catch(IOException e)
		{
			
		}
	}

}
