package MakeIntSquare;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class MakeIntSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int number = 1;
				boolean con;
				while(con = (number != 0))
				{
					boolean b;
					String str;
					Scanner scan = new Scanner(System.in);
					System.out.println("################ 정사각 배열 만들기 프로그램 ###############");
					System.out.println("자연수로 배열을 만드는 프로그램입니다.");
					System.out.println("자연수 입력시 입력 크기 이하의 숫자가 나열되며 ");
					System.out.println("가로 세로에 숫자가 겹치지 않습니다 ");
					System.out.println("############################################");
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
						int IntSquare[][] = new int [number][number];
						int temp = 0;
						Random random = new Random();
						for(int i = 0; i < number; i++)
						{
							for(int j = 0; j < number; j++)
							{
								IntSquare[i][j] = random.nextInt(number)+1;
								if(j > 0)
								{
									for(int k = 0; k < j; k++)
									{
										while(true)
										{
											if(IntSquare[i][j] != IntSquare[i][k])
												break;
											else
												IntSquare[i][j] = random.nextInt(number)+1;
										}
									}
								}
								System.out.print(IntSquare[i][j]);
								System.out.print("  ");
							}
							System.out.println("\n");
							
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
