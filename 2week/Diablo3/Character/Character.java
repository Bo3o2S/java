package Character;

import Unit.Unit;

public class Character extends Unit{
	
		//캐릭터 기본스탯
		public String ID;					// 아이디
					
		public int Strength;				// 힘
		public int Dex;						// 민첩
		public int Intelligence;			// 지능
		public int Vitality;				// 활력
		public double Recovery;				// 회복력
		
		protected int Strength_Rate;		// 힘 증가량
		protected int Dex_Rate;				// 민첩 증가량
		protected int Intelligence_Rate;	// 지능 증가량
		protected int Vitality_Rate;		// 활력 증가량
		protected int Recovery_Rate;		// 회복력 증가량
	
		
		protected double Vital_Hp_Rate;		// 활력이 HP에 미치는 증가량. HP = 활력*Vital_Hp_Rate
		protected long Exp_Rate;			// 레벨에 따른 필요 경험치 증가량
		
		public void Level(int Level)		// 레벨에 따른 스탯 증가
		{
			Level_Num = Level;																	// 현재 레벨
			Level = Level - 1;																	// 1레벨은 고정값이므로
			HP = Full_HP + HP_Rate*Level + (Vitality + Vitality_Rate*Level)*Vital_Hp_Rate;		// 현재 생명력
			Full_HP = Full_HP + HP_Rate*Level + (Vitality + Vitality_Rate*Level)*Vital_Hp_Rate;	// 전체 생명력
			Strength = Strength + Strength_Rate*Level;											// 레벨당 힘
			Dex = Dex + Dex_Rate*Level;															// 레벨당 민첩
			Intelligence = Intelligence + Intelligence_Rate*Level;								// 레벨당 지능
			Vitality = Vitality + Vitality_Rate*Level;											// 레벨당 활력
			Attack = Attack + Attack_Rate*Level;												// 레벨당 공격력
			Defence = Defence + Defence_Rate*Level;												// 레벨당 방여력
			Recovery = Recovery + Recovery_Rate*Level;											// 레벨당 회복력
			Evasion = Evasion + Evasion_Rate*Level;												// 레벨당 회피율
			Exp = Full_Exp + Level*Exp_Rate;													// 레벨업 필요 경험치
			Full_Exp = Full_Exp + Level*Exp_Rate;												// 전체 경험치
		}
		
}
