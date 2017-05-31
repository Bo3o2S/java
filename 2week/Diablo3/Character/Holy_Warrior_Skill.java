package Character;

public class Holy_Warrior_Skill extends Holy_Warrior{

		// 성전사 추가 스킬 세팅
		double Damage_S1= 2.45;
		double Damage_S1_Add= 2.45;
		double Damage_S2= 5.45;
		double Damage_S2_Add= 2.45;
		
		int Holy_Power_Make_S1 = 10;
		int Holy_Power_Use_S2 = 20;
		int Holy_Power_Make_S3 = 20;
		
		int Full_Holy_Power = 100;
		
		public double Skill_1()
		{
			double Damage = 0;
			double Damage_Add = 0;
			Damage = Attack*Damage_S1;
			Damage_Add = Attack*Damage_S1_Add;
			bar();
			System.out.println("정의을 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
			System.out.println("추가로 "+(int)Damage_Add+"의 데미지를 주었습니다!");
			if(Holy_Power <= (Full_Holy_Power - Holy_Power_Make_S1))
			{
				System.out.println(Holy_Power_Make_S1 + "의 신성력를 회복합니다");
				Holy_Power = Holy_Power + Holy_Power_Make_S1;
			}
			else if(Holy_Power > (Full_Holy_Power - Holy_Power_Make_S1) && Holy_Power < Full_Holy_Power)
			{
				System.out.println((Full_Holy_Power-Holy_Power) + "의 신성력를 회복합니다");
				Holy_Power = 100;
			}
			else //신성력 100%
			{
				System.out.println("신성력가 꽉찼습니다");
			}
			System.out.println("현재 신성력량 "+Holy_Power);
			bar();
			Damage = Damage + Damage_Add;
			return Damage;
		}
		
		public double Skill_2()
		{
			double Damage = 0;
			double Damage_Add = 0;
			Damage = Attack*Damage_S2;
			Damage_Add = Attack*Damage_S2_Add;
			if(Holy_Power >= Holy_Power_Use_S2)
			{
				Damage = Attack*Damage_S2;
				Holy_Power = Holy_Power - Holy_Power_Use_S2;
				bar();
				System.out.println("천상의 주먹을 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
				System.out.println("추가로 "+(int)Damage_Add+" 데미지를 주었습니다!");
				System.out.println("신성력이 "+Holy_Power_Use_S2+"만큼 감소합니다.");
				System.out.println("현재 신성력량 "+Holy_Power);
				bar();
				return Damage;
			}
			else
			{
				System.out.println("신성력이 부족합니다. 현재 신성력량 " + Holy_Power);
				Damage = 0;
				return Damage;
			}
		}
		
		public double Skill_3()
		{
			Defence = Defence + Defence*0.2;
			HP = HP + HP*0.1;
			Holy_Power = Holy_Power + Holy_Power_Make_S3;
			bar();
			System.out.println("방어력이 " + Defence*0.2 +"만큼 증가하였습니다\n");
			System.out.println("HP가 " + HP*0.1 +"만큼 증가하였습니다\n");
			System.out.println("신성력이 " + Holy_Power_Make_S3 +"만큼 증가하였습니다\n");
			bar();
			return 0;
		}

}
