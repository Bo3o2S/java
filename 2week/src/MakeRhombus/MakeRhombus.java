package MakeRhombus;

import java.util.Scanner;
import java.io.*;

public class MakeRhombus {
	public static void main(String[] args) {
		int number = 1;
		boolean con;
		while(con = (number != 0))
		{
			boolean b;
			String str;
			Scanner scan = new Scanner(System.in);
			System.out.println("################ 마름모 만들기 프로그램 ###############");
			System.out.println("\"*\"로 마름모를 만드는 프로그램입니다.");
			System.out.println("숫자입력시 해당 숫자 크기 만큼의 마름모를 만들 수 있습니다.");
			System.out.println("###############################################");
			System.out.print("숫자를 입력해주세요(1부터 숫자 입력, 0입력시 종료) : ");
			str = scan.next();
			scan.nextLine();
			number = Integer.parseInt(str);
			System.out.println(number+"이(가) 입력되었습니다");
			if(number == 0)
			{
				System.out.println("프로그램을 종료합니다");
			}
			else
			{
				number = number*2 +1;
				char rhombus[][] = new char [number][number];
				int j = 0,k = 0, l = 1;
				for(int i = 0; i < number; i++)
				{
					
					if(i > number/2) // 마름모 중간 이후						
					{
						j = i - number/2;
						k = number - 2*l;
						l++;
					}
					else // 마름모 중간 이전									
					{
						j = number/2-i;
						k = i*2+1;
					}
					while(true) // 별찍기
					{
						if(k == 0)
						{
							System.out.println(rhombus[i]);
							break;
						}
						rhombus[i][j] = '*';
						k--;
						j++;
					}
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
