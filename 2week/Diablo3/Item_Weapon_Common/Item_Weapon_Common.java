package Item_Weapon_Common;

import Item.Weapon;

public class Item_Weapon_Common extends Weapon{
	public Item_Weapon_Common()	// 일반 아이템 기본 세팅
	{
		Item_Type = "일반 아이템";	// 아이템 종류
		Item_Attack = 5;		// 아이템 공격력
		Item_Vitality = 5;		// 아이템 활력
		Item_Jewelry_Hole_Num = 1;  // 보석홈 개수
	}
}
