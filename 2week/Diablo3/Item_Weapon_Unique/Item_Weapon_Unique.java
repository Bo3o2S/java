package Item_Weapon_Unique;

import Item.Weapon;

public class Item_Weapon_Unique extends Weapon{
	public Item_Weapon_Unique()	// 일반 아이템 기본 세팅
	{
		Item_Type = "유니크 아이템";	// 아이템 종류
		Item_Attack = 20;		// 아이템 방어력
		Item_Vitality = 20;		// 아이템 활력
		Item_Jewelry_Hole_Num = 3;  // 보석홈 개수
	}
}
