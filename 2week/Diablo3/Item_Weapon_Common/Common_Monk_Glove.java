package Item_Weapon_Common;

import java.util.Random;

public class Common_Monk_Glove extends Item_Weapon_Common{
	public Common_Monk_Glove()
	{
		Item_Name = "일반 주먹무기";		// 아이템 명
		Item_Dex = 5;				// 아이템 수치
		Set_Weapon_Status();			// 아이템 생성
	}
	
	public void Set_Weapon_Status()	// 무기 수치 생성
	{
		Random rand = new Random();
		Item_Dex = Item_Dex + rand.nextInt(6);
		Item_Attack = Item_Attack + rand.nextInt(6);
		Item_Vitality = Item_Vitality + rand.nextInt(6);
	}
}
