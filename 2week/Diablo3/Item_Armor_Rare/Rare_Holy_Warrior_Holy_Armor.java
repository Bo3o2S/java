package Item_Armor_Rare;

import java.util.Random;

public class Rare_Holy_Warrior_Holy_Armor extends Item_Armor_Rare{
	public Rare_Holy_Warrior_Holy_Armor()
	{
		Item_Name = "레어 성갑옷";			// 아이템 명
		Item_Strength = 10;			// 아이템 힘 수치
		Set_Armor_Status();			// 갑옷 수치 생성
	}
	
	public void Set_Armor_Status()	// 갑옷 수치 생성
	{
		Random rand = new Random();
		Item_Strength = Item_Strength + rand.nextInt(11);
		Item_Defence = Item_Defence + rand.nextInt(11);
		Item_Vitality = Item_Vitality + rand.nextInt(11);
	}
}
