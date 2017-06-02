package Monster;
import java.util.Random;

import Unit.Unit;

public class MonSter extends Unit{

	
	protected String SkillName_1;			// 1번 스킬명
	protected String SkillName_2;			// 2번 스킬명
	protected String SkillName_3;			// 3번 스킬명
	
	protected int HP_Chance;
	protected int Attack_Chance;
	protected int Defence_Chance;
	protected int Evasion_Chance;
	
	protected int Add_HP;
	protected int Add_Attack;
	protected int Add_Defence;
	
	protected double DamageSkill_1;			// 1번 스킬 데미지
	protected double DamageSkill_2;			// 2번 스킬 데미지
	protected double DamageSkill_3;			// 3번 스킬 데미지
	
	protected void Set_Monster_Status()
	{
		Random random = new Random();
		HP = HP + Add_HP + random.nextInt(HP_Chance);
		Attack = Attack + Add_Attack + random.nextInt(Attack_Chance);
		Defence = Defence + Add_Defence + random.nextInt(Defence_Chance);
		Evasion = Evasion + random.nextInt(Evasion_Chance);
	}
		
	public void bar()
	{
		System.out.println("================================================");
	}
	
	public void Level(int Level)
	{
		Level_Num = Level;
		Level = Level - 1;
		HP = HP + HP_Rate*Level;
		Attack = Attack + Attack_Rate*Level;
		Defence = Defence + Defence_Rate*Level;
	}
}
