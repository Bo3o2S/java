package Item_Armor_Unique;

import java.util.Random;

public class Unique_Holy_Warrior_Holy_Armor extends Item_Armor_Unique{
	public Unique_Holy_Warrior_Holy_Armor()
	{
		Item_Name = "유니크 성갑옷";			// 아이템 명
		Item_Strength = 20;			// 아이템 힘 수치
		Set_Armor_Status();			// 갑옷 수치 생성
	}
	
	public void Set_Armor_Status()	// 갑옷 수치 생성
	{
		Random rand = new Random();
		Item_Strength = Item_Strength + rand.nextInt(21);
		Item_Defence = Item_Defence + rand.nextInt(21);
		Item_Vitality = Item_Vitality + rand.nextInt(21);
	}
}
