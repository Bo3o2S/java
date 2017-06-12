package Monster_Type;

import Monster.MonSter;

public class Champion_Monster extends MonSter{  // 챔피언 몬스터 공통수치
	
	public Champion_Monster()
	{
		Monster_Type = "챔피언 몬스터";					// 종류 : 챔피언 몬스터
		Level_Num = 1;							// 챔피언 몬스터 초기 레벨
		HP = 500;								// 챔피언 몬스터 생명력
		Attack = 50;							// 챔피언 몬스터 공격력
		Defence = 50;							// 챔피언 몬스터 방어력
		Evasion = 5;							// 챔피언 몬스터 회피력 		
		Exp = 1000;								// 챔피언 몬스터 경험치
		Gold = 500;								// 챔피언 몬스터 골드 드랍
		HP_Change_Rate = 101;					// 챔피언 몬스터 생성시 생명력 차이(0~100)
		Attack_Change_Rate = 11;				// 챔피언 몬스터 생성시 공격력 차이(0~10)  
		Defence_Change_Rate = 51;				// 챔피언 몬스터 생성시 방어력 차이(0~50)
		Evasion_Change_Rate = 3;				// 챔피언 몬스터 생성시 회피력 차이(0~2)
		
		HP_Rate = 50;							// 챔피언 몬스터 레벨당 생명력 증가량
		Attack_Rate = 10;						// 챔피언 몬스터 레벨당 공격력 증가량
		Defence_Rate = 10;						// 챔피언 몬스터 레벨당 방어력 증가량
		Exp_Rate = 400;							// 챔피언 몬스터 획득 경험치 증가량
		
		Set_Monster_Status();					// 챔피언 몬스터 기본 수치 세팅
	}
}
