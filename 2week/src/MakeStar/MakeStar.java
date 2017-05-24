package MakeStar;

import java.io.IOException;
import java.util.Scanner;

public class MakeStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		boolean con;
		while(con = (number != 0))
		{
			boolean b;
			String str;
			Scanner scan = new Scanner(System.in);
			System.out.println("################ 별 만들기 프로그램 ############### ");
			System.out.println("\"*\"로 별을 만드는 프로그램입니다.");
			System.out.println("숫자입력시 해당 숫자 크기 만큼의 별을 만들 수 있습니다.");
//			System.out.println("예시)"+"\t"+"1입력시"+"\t"+"2입력시"+"\t"+"3입력시");
//			System.out.println("\t"+"  *"+"\t"+"  *"+"\t"+"  *");
//			System.out.println("\t"+"\t"+" ***"+"\t"+" ***");
//			System.out.println("\t"+"\t"+"  *"+"\t"+"*****");
//			System.out.println("\t"+"\t"+"\t"+" ***");
//			System.out.println("\t"+"\t"+"\t"+"  *");
			System.out.println("############################################### ");
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
				int col = 6+(number-1)*2;
				int row = 9+(number-1)*4;
				char star[][] = new char [col][row];
				System.out.println("Enter 키를 누르세요");
				int i = 0,j = 0;
				for(; i < col; i++)
				{				
					int k = 0, count = 0, start = 0;
					for(; j <= number; j++)
					{	
						count = k*2+1;
						start = (row-count)/2;
						while(true)
						{
							if(count ==0)
								break;
							star[i][start] = '*';
							start++;
							count--;
						}
						k++;
						i++;						
					}
					
					count = 9+(number-1)*4;
					start = (row-count)/2;
					while(true)
					{
						if(count ==0)
							break;
						star[i][start] = '*';
						start++;
						count--;
					}
					i++;
					
				}
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