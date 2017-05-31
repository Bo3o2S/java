package Character;

public class Magician extends Character_BasicStatus{
	
	// 마법사  추가스탯

	int Magic_Hp = 30;
	int Magic_Intelligence = 2;
	int Magic_Intelligence_Rate = 20;
	double Magic_Attack = 1;
	double Magic_Attack_Rate = 1;
	
	public Magician()
	{
		HP = HP + Magic_Hp;
		Intelligence = Intelligence + Magic_Intelligence;
		Intelligence_Rate = Intelligence_Rate + Magic_Intelligence_Rate;
		Attack = Attack + Magic_Attack;
		Attack_Rate = Attack_Rate + Magic_Attack_Rate;
	}
}
