package Item_Weapon_Common;

import java.util.Random;

public class Common_Babarian_Giant_Sword extends Item_Weapon_Common{
	public Common_Babarian_Giant_Sword()
	{
		Item_Name = "일반 거대검";		// 아이템 명
		Item_Strength = 1000;			// 아이템 수치
		Set_Weapon_Status();			// 아이템 생성
	}
	
	public void Set_Weapon_Status()	// 무기 수치 생성
	{
		Random rand = new Random();
		Item_Strength = Item_Strength + rand.nextInt(6);
		Item_Attack = Item_Attack + rand.nextInt(6);
		Item_Vitality = Item_Vitality + rand.nextInt(6);
	}
}
