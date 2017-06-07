package Monster;
import java.util.Random;

import Common_Monster.Compulsion_Common_Monster;
import Monster_Type.Common_Monster;
import Unit.Unit;

public class MonSter extends Unit{	// 몬스터 기본 세팅

	
	protected int HP_Change_Rate;									// 몬스터 생성시 생명력 차이
	protected int Attack_Change_Rate;								// 몬스터 생성시 공격력 차이
	protected int Defence_Change_Rate;								// 몬스터 생성시 빙어력 차이
	protected int Evasion_Change_Rate;								// 몬스터 생성시 회피력 차이
	public String Monster_Type;										// 몬스터 생성시 종류(일반, 챔피언, 유니크, 보스)
	
	protected void Set_Monster_Status()	// 몬스터 기본 수치 세팅
	{
		Random random = new Random();								
		HP = HP + random.nextInt(HP_Change_Rate);					// 기본 생명력 + 생명력 차이량
		Attack = Attack + random.nextInt(Attack_Change_Rate);		// 기본 생명력 + 공격력 차이량
		Defence = Defence + random.nextInt(Defence_Change_Rate);	// 기본 생명력 + 방어력 차이량
		Evasion = Evasion + random.nextInt(Evasion_Change_Rate);	// 기본 생명력 + 회피력 차이량
	}
		
	public void bar() // 구분선
	{
		System.out.println("================================================");
	}
	
	public void Level(int Level) // 레벨별 몬스터 수치 세팅
	{
		Level_Num = Level;											// 레벨 
		Level = Level - 1;											// 1렙일 때는 기본수치. 2렙부터 수치 변화
		HP = HP + HP_Rate*Level;									// 기본생명력 + 생명력 증가분
		Attack = Attack + Attack_Rate*Level;						// 기본공격력 + 공격력 증가분
		Defence = Defence + Defence_Rate*Level;						// 기본방어력 + 방어력 증가분
		Exp = Exp + Exp_Rate*Level;									// 기본 획득 경험치 + 경험치 증가분
	}
	
	
}
