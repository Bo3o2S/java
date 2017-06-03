package Job;

import Character.Character;

public class Witch_Doctor extends Character implements Character_Job{
	
	public int Mana = 750;
	// 부두술사  추가스탯
	int WD_Hp = 30;
	int WD_Intelligence = 2;
	int WD_Intelligence_Rate = 20;
	double WD_Attack = 1;
	double WD_Attack_Rate = 1;
	
	public Witch_Doctor()
	{
		Name = "부두술사";
		HP = HP + WD_Hp;
		Intelligence = Intelligence + WD_Intelligence;
		Intelligence_Rate = Intelligence_Rate + WD_Intelligence_Rate;
		Attack = Attack + WD_Attack;
		Attack_Rate = Attack_Rate + WD_Attack_Rate;
	}
	
	@Override
	public double Normal_Attack() {
		// TODO Auto-generated method stub
		double Damage = 0;
		Damage = Attack;
		System.out.println(Name + "가 " + Attack + "만큼의 데미지를 입힙니다");		// 몬스터에게 주는 데미지
		return Damage;
	}

	@Override
	public void Print_Status() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double Skill_Attack() {
		// TODO Auto-generated method stub
		return 0;
	}		
}
