package Item_Armor_Unique;

import java.util.Random;

public class Unique_Monk_Monk_Suit extends Item_Armor_Unique{
	public Unique_Monk_Monk_Suit()
	{
		Item_Name = "유니크 승려복";			// 아이템 명
		Item_Dex = 20;				// 아이템 민첩 수치
		Set_Armor_Status();			// 갑옷 수치 생성
	}
	
	public void Set_Armor_Status()	// 갑옷 수치 생성
	{
		Random rand = new Random();
		Item_Dex = Item_Dex + rand.nextInt(21);
		Item_Defence = Item_Defence + rand.nextInt(21);
		Item_Vitality = Item_Vitality + rand.nextInt(21);
	}
}
