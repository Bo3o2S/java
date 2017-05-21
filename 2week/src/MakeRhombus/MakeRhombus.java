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
			System.out.println("################ 마름모 만들기 프로그램 ############### ");
			System.out.println("\"*\"로 마름모를 만드는 프로그램입니다.");
			System.out.println("숫자입력시 해당 숫자 크기 만큼의 마름모를 만들 수 있습니다.");
			System.out.println("단, 마름모가 상하 대칭이므로 홀수만 입력(1부터)해야 합니다.");
			System.out.println("예시)"+"\t"+"1입력시"+"\t"+"3입력시"+"\t"+"5입력시");
			System.out.println("\t"+"  *"+"\t"+"  *"+"\t"+"  *");
			System.out.println("\t"+"\t"+" ***"+"\t"+" ***");
			System.out.println("\t"+"\t"+"  *"+"\t"+"*****");
			System.out.println("\t"+"\t"+"\t"+" ***");
			System.out.println("\t"+"\t"+"\t"+"  *");
			System.out.println("############################################### ");
			System.out.print("숫자를 입력해주세요(1부터 홀수 단위로 입력, 0입력시 종료) : ");
			str = scan.next();
			scan.nextLine();
			number = Integer.parseInt(str);
			System.out.println(number+"이(가) 입력되었습니다");
			System.out.println(number+"크기만큼의 마름모를 만듭니다");
			char rhombus[][] = new char [number][number];
			if(number == 0)
			{
				System.out.println("프로그램을 종료합니다");
			}
			else
			{
				if(b = (number%2 != 1))					// 2로 나누었을 경우
				{
					System.out.println("홀수를 입력하세요!");
				}
				else if(number == 1)
				{
					System.out.println("*");
				}
				else
				{
					for(int i = 0; i < number-1; i++)
					{
						int j = number/2-i;
						int k = i*2+1;
						if(i > number/2)
						{
							j = i-number/2;
						}
						while(true)
						{
							rhombus[i][j] = '*';
							k--;
							if(k == 0)
								break;
							j++;
						}
					}
				}
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
