package Basic_Status;
import java.util.Random;

public class MonSter_BasicStatus {

	public int Hp = 100;
	public int Attack = 10;
	public int Defence = 10;
	public int Evasion = 3;
	
	protected int Hp_Rate = 0;
	protected int Attack_Rate = 0;
	protected int Defence_Rate = 0;
	protected int Evasion_Rate = 0;
	
	protected int Add_Hp = 0;
	protected int Add_Attack = 0;
	protected int Add_Defence = 0;
	
	protected void Set_Monster_Status()
	{
		Random random = new Random();
		Hp = Hp + Add_Hp + random.nextInt(Hp_Rate);
		Attack = Attack + Add_Attack + random.nextInt(Attack_Rate);
		Defence = Defence + Add_Defence + random.nextInt(Defence_Rate);
		Evasion = Evasion + random.nextInt(Evasion_Rate);
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
		System.out.println("");
		System.out.println("================================================");
		System.out.println("");
	}
}
