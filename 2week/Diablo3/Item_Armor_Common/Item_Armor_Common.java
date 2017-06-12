package Item_Armor_Common;

import Item.Armor;

public class Item_Armor_Common extends Armor{
	public Item_Armor_Common()	// 일반 아이템 기본 세팅
	{
		Item_Type = "일반 아이템";	// 아이템 종류
		Item_Defence = 5;		// 아이템 방어력
		Item_Vitality = 5;		// 아이템 활력
		Item_Jewelry_Hole = 1;  // 보석홈 개수
	}
}
