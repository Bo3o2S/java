package Item_Armor_Rare;

import Item.Armor;
import Item.Item_Interface;
import Item.Jewelry;
import Item.Item_Jewelry_Hole;
public class Item_Armor_Rare extends Armor implements Item_Interface{
	public Item_Armor_Rare()	// 일반 아이템 기본 세팅
	{
		Item_Type = "레어 아이템";	// 아이템 종류
		Item_Defence = 2500;		// 아이템 방어력
		Item_Vitality = 2500;		// 아이템 활력
		Item_Jewelry_Hole_Num = 2;  // 보석홈 개수
	}
	
	public Item_Jewelry_Hole jewelry_hole = new Item_Jewelry_Hole();
	
	public double Insert_Jewelry(Jewelry jewelry, int num)
	{
		if(num == 1)
		{
			System.out.println("1번 홈에 보석을 장착합니다");
			if(jewelry_hole.jewelry1 == null)
			{
				jewelry_hole.jewelry1 = jewelry;
				if(jewelry_hole.jewelry1.Attack != 0)
					return jewelry_hole.jewelry1.Attack;
				if(jewelry_hole.jewelry1.Defence != 0)
					return jewelry_hole.jewelry1.Defence;
			}
			else
				System.out.println("보석을 제거해야 장착 가능합니다");
		}
		else if(num == 2)
		{
			System.out.println("2번 홈에 보석을 장착합니다");
			if(jewelry_hole.jewelry2 == null)
			{
				jewelry_hole.jewelry2 = jewelry;
				if(jewelry_hole.jewelry2.Attack != 0)
					return jewelry_hole.jewelry2.Attack;
				if(jewelry_hole.jewelry2.Defence != 0)
					return jewelry_hole.jewelry2.Defence;
			}
			else
				System.out.println("보석을 제거해야 장착 가능합니다");
		}
		return 0;
	}
	
	public void Remove_Jewelry(int num)
	{
		if(num == 1)
		{
			jewelry_hole.jewelry1 = null;
			System.out.println("1번 홈의 보석을 제거하였습니다");
		}
		else if(num == 2)
		{
			jewelry_hole.jewelry2 = null;
			System.out.println("2번 홈의 보석을 제거하였습니다");
		}
	}
}

