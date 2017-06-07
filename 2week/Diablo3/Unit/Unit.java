package Unit;

public class Unit {
	public String Name;					// 유닛 이름
	public int Level_Num;				// 레벨
	public double HP;					// 생명력
	public double Attack;				// 공격력
	public double Defence;				// 방어력
	public double Evasion;				// 회피율
	public long	Exp;					// 경험치
	public long	Gold;					// 드롭or획득 골드


	protected int HP_Rate;				// 생명력 증가율
	protected double Attack_Rate;		// 공격력 증가율
	protected double Defence_Rate;		// 방어력 증가율
	protected double Evasion_Rate;		// 회피 증가율
	protected int Exp_Rate;				// 필요or획득 경험치 증가율
	
	public String Skill_Name;			// 스킬명
	
	public void bar()	// 상하 구분을 위한 경계선
	{
		System.out.println("================================================");
	}
	
	public void bar2()
	{
		System.out.println("------------------------------------------------");
	}
}
