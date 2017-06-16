package Item_Weapon_Rare;

import java.util.Random;

import Item_Weapon_Unique.Item_Weapon_Unique;

public class Rare_Babarian_Giant_Sword extends Item_Weapon_Unique{
	public Rare_Babarian_Giant_Sword()
	{
		Item_Name = "레어 거대검";		// 아이템 명
		Item_Strength = 2500;			// 아이템 수치
		Set_Weapon_Status();		// 아이템 생성
	}
	
	public void Set_Weapon_Status()	// 무기 수치 생성
	{
		Random rand = new Random();
		Item_Strength = Item_Strength + rand.nextInt(1001);
		Item_Attack = Item_Attack + rand.nextInt(1001);
		Item_Vitality = Item_Vitality + rand.nextInt(1001);
	}
}
