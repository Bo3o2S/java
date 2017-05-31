package Basic_Status;

public class Character_BasicStatus {
	
		//캐릭터 기본스탯
		public int Level_Num = 1;
		public double HP = 100;
		public int Arcane_Power = 100;
		public int	Anger = 100;
		public int Spirit_Power = 250;
		public int Holy_Power = 100;
		public int Hate = 125;
		public int Moderation = 30;
		public int Mana = 750;
			
		public int Strength = 8;
		public int Dex = 8;
		public int Intelligence = 8;
		public int Vitality = 8;
				
		public double Attack = 5;
		public double Defence = 12;
		public double Recovery = 10;
		public double evasion = 3;
		public long Gold = 5000;
		public long Exp = 500;
			
		public int HP_Rate = 190;
		public int Strength_Rate = 10;
		public int Dex_Rate = 10;
		public int Intelligence_Rate = 10;
		public int Vitality_Rate = 8;
		public int Recovery_Rate = 5;
	
		public double Attack_Rate = 10;
		public double Defence_Rate = 9;
		public double Evasion_Rate = 0.3;
		public double Vital_Hp_Rate = 0.05;
		public long Exp_Rate = 300;
		
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
