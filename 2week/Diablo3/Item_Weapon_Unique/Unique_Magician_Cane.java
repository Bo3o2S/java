package Item_Weapon_Unique;

import java.util.Random;

public class Unique_Magician_Cane extends Item_Weapon_Unique{
	public Unique_Magician_Cane()
	{
		Item_Name = "유니크 지팡이";		// 아이템 명
		Item_Intelligence = 20;		// 아이템 수치
		Set_Weapon_Status();		// 아이템 생성
	}
	
	public void Set_Weapon_Status()	// 무기 수치 생성
	{
		Random rand = new Random();
		Item_Intelligence = Item_Intelligence + rand.nextInt(21);
		Item_Attack = Item_Attack + rand.nextInt(21);
		Item_Vitality = Item_Vitality + rand.nextInt(21);
	}
}
