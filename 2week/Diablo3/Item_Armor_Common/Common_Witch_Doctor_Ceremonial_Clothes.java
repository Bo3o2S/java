package Item_Armor_Common;

import java.util.Random;

public class Common_Witch_Doctor_Ceremonial_Clothes extends Item_Armor_Common{
	public Common_Witch_Doctor_Ceremonial_Clothes()
	{
		Item_Name = "일반 의식용옷";		// 아이템 명
		Item_Intelligence = 5;		// 아이템 지능 수치
		Set_Armor_Status();			// 갑옷 수치 생성
	}
	
	public void Set_Armor_Status()	// 갑옷 수치 생성
	{
		Random rand = new Random();
		Item_Intelligence = Item_Intelligence + rand.nextInt(6);
		Item_Defence = Item_Defence + rand.nextInt(6);
		Item_Vitality = Item_Vitality + rand.nextInt(6);
	}
}
