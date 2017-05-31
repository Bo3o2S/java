package Character;

import Character_Skill.Babarian_Skill;

public class test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babarian_Skill baba = new Babarian_Skill();
		System.out.println((int)baba.Strength);
		baba.Skill(1);
		baba.Skill(2);
		System.out.println((int)baba.Strength);
	}

}
