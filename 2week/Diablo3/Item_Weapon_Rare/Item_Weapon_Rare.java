package Item_Weapon_Rare;

import Item.Weapon;

public class Item_Weapon_Rare extends Weapon{
	public Item_Weapon_Rare()	// 일반 아이템 기본 세팅
	{
		Item_Type = "레어 아이템";	// 아이템 종류
		Item_Attack = 10;		// 아이템 방어력
		Item_Vitality = 10;		// 아이템 활력
		Item_Jewelry_Hole_Num = 2;  // 보석홈 개수
	}
}
