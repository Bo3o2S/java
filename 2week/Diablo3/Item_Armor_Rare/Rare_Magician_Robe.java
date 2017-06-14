package Item_Armor_Rare;

import java.util.Random;

public class Rare_Magician_Robe extends Item_Armor_Rare{
	public Rare_Magician_Robe()
	{
		Item_Name = "레어 로브";			// 아이템 명
		Item_Intelligence = 10;		// 아이템 지능 수치
		Set_Armor_Status();			// 갑옷 수치 생성
	}
	
	public void Set_Armor_Status()	// 갑옷 수치 생성
	{
		Random rand = new Random();
		Item_Intelligence = Item_Intelligence + rand.nextInt(11);
		Item_Defence = Item_Defence + rand.nextInt(11);
		Item_Vitality = Item_Vitality + rand.nextInt(11);
	}
}
