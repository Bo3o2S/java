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
			System.out.println("################ ������ ����� ���α׷� ############### ");
			System.out.println("\"*\"�� ������ ����� ���α׷��Դϴ�.");
			System.out.println("�����Է½� �ش� ���� ũ�� ��ŭ�� ������ ���� �� �ֽ��ϴ�.");
			System.out.println("��, ������ ���� ��Ī�̹Ƿ� Ȧ���� �Է�(1����)�ؾ� �մϴ�.");
			System.out.println("����)"+"\t"+"1�Է½�"+"\t"+"3�Է½�"+"\t"+"5�Է½�");
			System.out.println("\t"+"  *"+"\t"+"  *"+"\t"+"  *");
			System.out.println("\t"+"\t"+" ***"+"\t"+" ***");
			System.out.println("\t"+"\t"+"  *"+"\t"+"*****");
			System.out.println("\t"+"\t"+"\t"+" ***");
			System.out.println("\t"+"\t"+"\t"+"  *");
			System.out.println("############################################### ");
			System.out.print("���ڸ� �Է����ּ���(1���� Ȧ�� ������ �Է�, 0�Է½� ����) : ");
			str = scan.next();
			scan.nextLine();
			number = Integer.parseInt(str);
			System.out.println(number+"��(��) �ԷµǾ����ϴ�");
			System.out.println(number+"ũ�⸸ŭ�� ������ ����ϴ�");
			char rhombus[][] = new char [number][number];
			if(number == 0)
			{
				System.out.println("���α׷��� �����մϴ�");
			}
			else
			{
				if(b = (number%2 != 1))					// 2�� �������� ���
				{
					System.out.println("Ȧ���� �Է��ϼ���!");
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
				System.out.println("Enter Ű�� ��������");
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
