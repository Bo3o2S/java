package Item_Armor_Common;

import Item.Armor;
import Item.Jewelry;

public class Item_Armor_Common extends Armor{
	public Item_Armor_Common()	// 일반 아이템 기본 세팅
	{
		Item_Type = "일반 아이템";	// 아이템 종류
		Item_Defence = 5;		// 아이템 방어력
		Item_Vitality = 5;		// 아이템 활력
		Item_Jewelry_Hole_Num = 1;  // 보석홈 개수
	}
	public Item_Jewelry_Hole jewelry_hole = new Item_Jewelry_Hole();
}
class Item_Jewelry_Hole{
	Jewelry jewelry = new Jewelry();
}