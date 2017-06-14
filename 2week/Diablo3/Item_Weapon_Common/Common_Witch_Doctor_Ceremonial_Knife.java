package Item_Weapon_Common;

import java.util.Random;

public class Common_Witch_Doctor_Ceremonial_Knife extends Item_Weapon_Common{
	public Common_Witch_Doctor_Ceremonial_Knife()
	{
		Item_Name = "일반 의식용칼";		// 아이템 명
		Item_Intelligence = 5;		// 아이템 수치
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
