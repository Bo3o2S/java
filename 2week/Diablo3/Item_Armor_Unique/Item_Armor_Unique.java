package Item_Armor_Unique;

import Item.Armor;
import Item.Jewelry;

public class Item_Armor_Unique extends Armor{
	public Item_Armor_Unique()	// 일반 아이템 기본 세팅
	{
		Item_Type = "유니크 아이템";	// 아이템 종류
		Item_Defence = 20;		// 아이템 방어력
		Item_Vitality = 20;		// 아이템 활력
		Item_Jewelry_Hole_Num = 3;  // 보석홈 개수
	}
	public Item_Jewelry_Hole jewelry_hole = new Item_Jewelry_Hole();
	
	public void Insert_Jewelry(Jewelry jwelry)
	{
		if(jewelry_hole.jewelry1 != null)
		{
			jewelry_hole.jewelry1 = jwelry;
		}
		else if(jewelry_hole.jewelry1 != null)
		{
			jewelry_hole.jewelry2 = jwelry;
		}
		else if(jewelry_hole.jewelry3 != null)
		{
			jewelry_hole.jewelry3 = jwelry;
		}
	}
	
	public void Remove_Jewelry(int num)
	{
		if(num == 1)
		{
			jewelry_hole.jewelry1 = null;
		}
		else if(num == 2)
		{
			jewelry_hole.jewelry2 = null;
		}
		else if(num == 3)
		{
			jewelry_hole.jewelry3 = null;
		}
	}
}

class Item_Jewelry_Hole{
	Jewelry jewelry1 = new Jewelry();
	Jewelry jewelry2 = new Jewelry();
	Jewelry jewelry3 = new Jewelry();
}