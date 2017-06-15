package Character_Job;

import Item.Armor;
import Item.Jewelry;
import Item.Weapon;

public interface Character_Job {
	public void Print_Status();		// 캐릭터 스탯창 출력
	public double Normal_Attack();
	public double Skill_Attack();
	public void Wear_Equipment(Object object);
	public boolean Pick_Up_Jewerly(Jewelry jewelry);
	public void Exchange_Jewerly(Jewelry jewelry);
}

class Inven
{
	Weapon weapon = new Weapon();
	Armor armor = new Armor();
	Jewelry jewelry1 = new Jewelry();
	Jewelry jewelry2 = new Jewelry();
	Jewelry jewelry3 = new Jewelry();
}

