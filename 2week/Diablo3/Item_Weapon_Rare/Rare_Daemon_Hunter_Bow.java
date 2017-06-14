package Item_Weapon_Rare;

import java.util.Random;

public class Rare_Daemon_Hunter_Bow extends Item_Weapon_Rare{
	public Rare_Daemon_Hunter_Bow()
	{
		Item_Name = "레어 활";		// 아이템 명
		Item_Dex = 10;			// 아이템 수치
		Set_Weapon_Status();		// 아이템 생성
	}
	
	public void Set_Weapon_Status()	// 무기 수치 생성
	{
		Random rand = new Random();
		Item_Dex = Item_Dex + rand.nextInt(11);
		Item_Attack = Item_Attack + rand.nextInt(11);
		Item_Vitality = Item_Vitality + rand.nextInt(11);
	}
}
