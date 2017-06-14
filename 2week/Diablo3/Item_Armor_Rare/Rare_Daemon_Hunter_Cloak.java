package Item_Armor_Rare;

import java.util.Random;

public class Rare_Daemon_Hunter_Cloak extends Item_Armor_Rare{
	public Rare_Daemon_Hunter_Cloak()
	{
		Item_Name = "레어 망토";			// 아이템 명
		Item_Dex = 10;				// 아이템 민첩 수치
		Set_Armor_Status();			// 갑옷 수치 생성
	}
	
	public void Set_Armor_Status()	// 갑옷 수치 생성
	{
		Random rand = new Random();
		Item_Dex = Item_Dex + rand.nextInt(11);
		Item_Defence = Item_Defence + rand.nextInt(11);
		Item_Vitality = Item_Vitality + rand.nextInt(11);
	}
}
