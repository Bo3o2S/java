package Item_Weapon_Unique;

import java.util.Random;

public class Unique_Monk_Glove extends Item_Weapon_Unique{
	public Unique_Monk_Glove()
	{
		Item_Name = "유니크 주먹무기";		// 아이템 명
		Item_Dex = 20;			// 아이템 수치
		Set_Weapon_Status();		// 아이템 생성
	}
	
	public void Set_Weapon_Status()	// 무기 수치 생성
	{
		Random rand = new Random();
		Item_Dex = Item_Dex + rand.nextInt(21);
		Item_Attack = Item_Attack + rand.nextInt(21);
		Item_Vitality = Item_Vitality + rand.nextInt(21);
	}
}