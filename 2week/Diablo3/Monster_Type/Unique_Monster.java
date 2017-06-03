package Monster_Type;
import Monster.MonSter;

public class Unique_Monster extends MonSter{	// 유니크 몬스터 공통수치
	
	public Unique_Monster()						// 초기화
	{
		Level_Num = 1;							// 유니크 몬스터 초기 레벨
		HP = 800;								// 유니크 몬스터 생명력
		Attack = 100;							// 유니크 몬스터 공격력
		Defence =100;							// 유니크 몬스터 방어력
		Evasion = 10;							// 유니크 몬스터 회피력
		Exp = 2000;								// 유니크 몬스터 경험치
		Gold = 1000;							// 유니크 몬스터 골드 드랍
		
		HP_Change_Rate = 101;					// 유니크 몬스터 생성시 생명력 차이(0~300)
		Attack_Change_Rate = 21;				// 유니크 몬스터 생성시 공격력 차이(0~100)  
		Defence_Change_Rate = 101;				// 유니크 몬스터 생성시 방어력 차이(0~100)
		Evasion_Change_Rate = 6;				// 유니크 몬스터 생성시 회피력 차이(0~5)
		
		HP_Rate = 80;							// 유니크 몬스터 레벨당 생명력 증가량
		Attack_Rate = 15;						// 유니크 몬스터 레벨당 공격력 증가량
		Defence_Rate = 15;						// 유니크 몬스터 레벨당 방어력 증가량
		Exp_Rate = 600;							// 유니크 몬스터 획득 경험치 증가량
		
		Set_Monster_Status();					// 유니크 몬스터 기본 수치 세팅
	}
}
