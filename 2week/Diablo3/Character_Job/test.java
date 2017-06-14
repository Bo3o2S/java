package Character_Job;

import Item_Armor_Common.Common_Babarian_Leather_Clothes;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babarian baba = new Babarian();
		Common_Babarian_Leather_Clothes leather = new Common_Babarian_Leather_Clothes();
		baba.Inventory(leather);
		System.out.println(baba.armor.Item_Name);
	}

}
