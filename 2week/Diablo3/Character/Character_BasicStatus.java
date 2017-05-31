package Character;

public class Character_BasicStatus {
	
		//캐릭터 기본스탯
		int Level_Num = 1;
		double HP = 100;
		int Arcane_Power = 100;
		int	Anger = 100;
		int Spirit_Power = 250;
		int Holy_Power = 100;
		int Hate = 125;
		int Moderation = 30;
		int Mana = 750;
		
		int Strength = 8;
		int Dex = 8;
		int Intelligence = 8;
		int Vitality = 8;
			
		double Attack = 5;
		double Defence = 12;
		double Recovery = 10;
		double evasion = 3;
		long Gold = 5000;
		long Exp = 500;
		
		int HP_Rate = 190;
		int Strength_Rate = 10;
		int Dex_Rate = 10;
		int Intelligence_Rate = 10;
		int Vitality_Rate = 8;
		int Recovery_Rate = 5;

		double Attack_Rate = 10;
		double Defence_Rate = 9;
		double Evasion_Rate = 0.3;
		double Vital_Hp_Rate = 0.05;
		long Exp_Rate = 300;
		
		public void Level(int Level)
		{
			Level_Num = Level;
			Level = Level - 1;
			HP = HP + HP_Rate*Level + (Vitality + Vitality_Rate*Level)*Vital_Hp_Rate;
			Strength = Strength + Strength_Rate*Level;
			Dex = Dex + Dex_Rate*Level;
			Intelligence = Intelligence + Intelligence_Rate*Level;
			Vitality = Vitality + Vitality_Rate*Level;
			Attack = Attack + Attack_Rate*Level;
			Defence = Defence + Defence_Rate*Level;
			Recovery = Recovery + Recovery_Rate*Level;
			evasion = evasion + Evasion_Rate*Level;
			Exp = Exp + Level*Exp_Rate;
		}
		
		public double Skill(int skill_Num)
		{
			
			double Damage = 0;
			
			if(skill_Num == 1)
				Damage = Skill_1();
			if(skill_Num == 2)
				Damage = Skill_2();
			if(skill_Num == 3)
				Damage = Skill_3();
			
			return Damage;
		}
		public double Skill_1()
		{
			return 0;
		}
		public double Skill_2()
		{
			return 0;
		}
		public double Skill_3()
		{
			return 0;
		}
		
		public void bar()
		{
			System.out.println("================================================");
		}
		
}
