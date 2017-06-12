package Item_Armor_Common;

import java.util.Random;

public class Holy_Warrior_Holy_Armor extends Item_Armor_Common{
	public Holy_Warrior_Holy_Armor()
	{
		Item_Name = "성갑옷";			// 아이템 명
		Item_Strength = 5;			// 아이템 힘 수치
		Set_Armor_Status();			// 갑옷 수치 생성
	}
	
	public void Set_Armor_Status()	// 갑옷 수치 생성
	{
		Random rand = new Random();
		Item_Strength = Item_Strength + rand.nextInt(6);
		Item_Defence = Item_Defence + rand.nextInt(6);
		Item_Vitality = Item_Vitality + rand.nextInt(6);
	}
}
