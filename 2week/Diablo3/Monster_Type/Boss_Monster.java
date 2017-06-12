package Monster_Type;
import Monster.MonSter;


public class Boss_Monster extends MonSter{	// 보스 몬스터 공통수치

	public Boss_Monster()					// 초기화
	{
		Monster_Type = "보스 몬스터";				// 종류 : 보스 몬스터
		Level_Num = 1;						// 보스 몬스터 초기 레벨
		HP = 1200;							// 보스 몬스터 생명력
		Attack = 500;						// 보스 몬스터 공격력
		Defence = 400;						// 보스 몬스터 방어력
		Evasion = 20;						// 보스 몬스터 회피력
		Exp = 5000;							// 보스 몬스터 경험치
		Gold = 10000;						// 보스 몬스터 골드 드랍
		
		HP_Change_Rate = 301;				// 보스 몬스터 생성시 생명력 차이(0~300)
		Attack_Change_Rate = 101;			// 보스 몬스터 생성시 공격력 차이(0~100)  
		Defence_Change_Rate = 101;			// 보스 몬스터 생성시 방어력 차이(0~100)
		Evasion_Change_Rate = 6;			// 보스 몬스터 생성시 회피력 차이(0~5)
		
		HP_Rate = 100;						// 보스 몬스터 레벨당 생명력 증가량
		Attack_Rate = 20;					// 보스 몬스터 레벨당 공격력 증가량
		Defence_Rate = 20;					// 보스 몬스터 레벨당 방어력 증가량
		Exp_Rate = 1000;					// 보스 몬스터 획득 경험치 증가량
		
		Set_Monster_Status();				// 보스 몬스터 기본 수치 세팅
	}
}
