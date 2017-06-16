package Game;

public class SharedResource_Battle
{
	public double Character_HP;
	public double Monster_HP;
	public int Attack_Choice_Num;
	public double Boss_Monster_Sheild;
	public SharedResource_Battle(double character_hp, double monster_hp)
	{
		this.Character_HP = character_hp;
		this.Monster_HP = monster_hp;
	}
	
	public synchronized void Monster_Attack(double Damage)
	{
		Character_HP = Character_HP - Damage;
	}
	
	public synchronized void Character_Attack(double Damage)
	{
		Monster_HP = Monster_HP - Damage;
	}
	
	public synchronized double Sheild_Energy(double Damage)
	{
		Boss_Monster_Sheild = Boss_Monster_Sheild - Damage;
		return Damage/4;
	}
}
