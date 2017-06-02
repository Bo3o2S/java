package Job;

import Character.Character;

public class Holy_Warrior extends Character{

	public Holy_Warrior()	// 성전사 초기화
	{
		// 성전사 기본 스탯 세팅
		Name = "성전사";
		Level_Num = 1;
		HP = 140;
		Attack = 5;
		Defence = 16;
		Evasion = 3;
		Strength = 10;  
		Dex = 8;
		Intelligence = 8;
		Recovery = 10;
		Vitality = 10;
		Defence = 16;
		Gold = 5000;
		Exp = 100;
		
		// 레벨 증가시 수치 향상 비율
		HP_Rate = 200;
		Strength_Rate = 30; 
		Dex_Rate = 10;
		Defence_Rate = 10;
		Intelligence_Rate = 10;		
		Vitality_Rate = 10;
		Recovery_Rate = 10;
		Vital_Hp_Rate = 0.05;		
		Exp_Rate = 200;
		Attack_Rate = 10;
		Defence_Rate = 10;
		Evasion_Rate = 0.3;		
	}
	
	public int Holy_Power = 100;				// 신성력 총량

	double Damage_Justice= 2.45;				// 스킬 "정의" 공격 배수
	double Add_Damage_Justice= 2.45;			// 스킬 "정의" 추가 공격 배수
	double Damage_Fist= 5.45;					// 스킬 "천상의 주먹" 공격 배수
	double Add_Damage_Fist= 2.45;				// 스킬 "천상의 주먹" 추가 공격 배수
	
	int Holy_Power_Make_Justice = 10;			// 스킬 "정의" 신성력 생성량
	int Holy_Power_Use_Fist = 20;				// 스킬 "천상의 주먹" 신성력 사용량 			
	int Holy_Power_Make_Iron = 20;				// 스킬 "철갑피부" 신성력 생성량
	
	int Full_Holy_Power = 100;					// 신성력 최고량
	
	public double Justice()
	{
		double Damage = 0;
		double Damage_Add = 0;
		Damage = Attack*Damage_Justice;				// 데미지
		Damage_Add = Attack*Add_Damage_Justice;		// 추가 데미지
		bar();
		System.out.println("정의을 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
		System.out.println("추가로 "+(int)Damage_Add+"의 데미지를 주었습니다!");
		if(Holy_Power <= (Full_Holy_Power - Holy_Power_Make_Justice))										// 신성력이 90이하인 경우
		{
			System.out.println(Holy_Power_Make_Justice + "의 신성력를 회복합니다");
			Holy_Power = Holy_Power + Holy_Power_Make_Justice;
		}
		else if(Holy_Power > (Full_Holy_Power - Holy_Power_Make_Justice) && Holy_Power < Full_Holy_Power)	// 신성력이 91 ~ 99 일 때
		{
			System.out.println((Full_Holy_Power-Holy_Power) + "의 신성력를 회복합니다");			
			Holy_Power = 100;
		}
		else //신성력 100% 일 때
		{
			System.out.println("신성력이 꽉찼습니다");
		}
		System.out.println("현재 신성력량 "+Holy_Power);	// 현재 신성력 량 
		bar();
		Damage = Damage + Damage_Add;
		return Damage;
	}
	
	public double Fist_of_Heaven()	// 천상의 주먹 스킬
	{
		double Damage = 0;
		double Damage_Add = 0;
		Damage = Attack*Damage_Fist;			// 기본 데미지
		Damage_Add = Attack*Add_Damage_Fist;	// 추가 데미지
		if(Holy_Power >= Holy_Power_Use_Fist)	// 신성력 량이 충분할 때(신성력 20 이상)
		{
			Holy_Power = Holy_Power - Holy_Power_Use_Fist; // 남은 신성력
			bar();
			System.out.println("천상의 주먹을 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
			System.out.println("추가로 "+(int)Damage_Add+" 데미지를 주었습니다!");
			System.out.println("신성력이 "+Holy_Power_Use_Fist+"만큼 감소합니다.");
			System.out.println("현재 신성력량 "+Holy_Power);
			bar();
			return Damage;
		}
		else	// 신성력이 부족할 때
		{
			System.out.println("신성력이 부족합니다. 현재 신성력량 " + Holy_Power);
			Damage = 0;
			return Damage;
		}
	}
	
	public double Iron_Skin()	// 철갑 피부 스킬
	{
		Defence = Defence + Defence*0.2;
		HP = HP + HP*0.1;
		System.out.println("방어력이 " + Defence*0.2 +"만큼 증가하였습니다\n");
		System.out.println("HP가 " + HP*0.1 +"만큼 증가하였습니다\n");
		
		if(Holy_Power <= (Full_Holy_Power - Holy_Power_Make_Iron))										// 신성력이 80이하인 경우
		{
			System.out.println(Holy_Power_Make_Iron + "의 신성력를 회복합니다");
			Holy_Power = Holy_Power + Holy_Power_Make_Iron;
		}
		else if(Holy_Power > (Full_Holy_Power - Holy_Power_Make_Iron) && Holy_Power < Full_Holy_Power)	// 신성력이 81 ~ 89 일 때
		{
			System.out.println((Full_Holy_Power-Holy_Power) + "의 신성력를 회복합니다");			
			Holy_Power = 100;
		}
		else //신성력 100% 일 때
		{
			System.out.println("신성력이 꽉찼습니다");
		}
		System.out.println("현재 신성력량 "+Holy_Power);	// 현재 신성력 량
		bar();
		
		System.out.println("신성력이 " + Holy_Power_Make_Iron +"만큼 증가하였습니다\n");
		bar();
		return 0;
	}
}
