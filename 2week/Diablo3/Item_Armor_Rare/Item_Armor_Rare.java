package Item_Armor_Rare;

import Item.Armor;
import Item.Jewelry;

public class Item_Armor_Rare extends Armor{
	public Item_Armor_Rare()	// 일반 아이템 기본 세팅
	{
		Item_Type = "레어 아이템";	// 아이템 종류
		Item_Defence = 10;		// 아이템 방어력
		Item_Vitality = 10;		// 아이템 활력
		Item_Jewelry_Hole_Num = 2;  // 보석홈 개수
	}
	public Item_Jewelry_Hole jewelry_hole = new Item_Jewelry_Hole();
}

class Item_Jewelry_Hole{
	Jewelry jewelry1 = new Jewelry();
	Jewelry jewelry2 = new Jewelry();
}
