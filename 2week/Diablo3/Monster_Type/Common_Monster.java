package Monster_Type;
import Monster.MonSter;
import Monster_Unit.Compulsion_Common_Monster;

public class Common_Monster extends MonSter{	// 일반 몬스터 공통수치
	
	public Common_Monster()						// 초기화
	{
		Monster_Type = "일반";					// 종류 : 일반 몬스터
		Level_Num = 1;							// 일반 몬스터 초기 레벨
		HP = 100;								// 일반 몬스터 생명력
		Attack = 10;							// 일반 몬스터 공격력
		Defence = 20;							// 일반 몬스터 방어력
		Evasion = 3;							// 일반 몬스터 회피력
		Exp = 100;								// 일반 몬스터 경험치
		Gold = 100;								// 일반 몬스터 골드 드랍
		
		HP_Change_Rate = 101;					// 일반 몬스터 생성시 생명력 차이(0~100)
		Attack_Change_Rate = 11;				// 일반 몬스터 생성시 공격력 차이(0~10) 
		Defence_Change_Rate = 11;				// 일반 몬스터 생성시 방어력 차이(0~10)
		Evasion_Change_Rate = 3;				// 일반 몬스터 생성시 회피력 차이(0~2)
		
		HP_Rate = 20;							// 일반 몬스터 레벨당 생명력 증가량
		Attack_Rate = 5;						// 일반 몬스터 레벨당 공격력 증가량
		Defence_Rate = 5;						// 일반 몬스터 레벨당 방어력 증가량
		Exp_Rate = 200;							// 일반 몬스터 획득 경험치 증가량
		
		Set_Monster_Status();					// 일반 몬스터 기본 수치 세팅
	}
	
	
}
