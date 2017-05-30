package Character;

public class Babarian_Skill extends Babarian{
	public double Skill(int skill_Num, int Level)
	{
		Level(Level);
		double Damage = 0;
		if(skill_Num == 1)
		{
			Damage = Attack*2.2;
			System.out.println("광분을 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
			
			if(Anger <= 96)
			{
				System.out.println("4의 분노를 회복합니다");
				Anger = Anger + 4;
			}
			else
			{
				System.out.println("분노가 꽉찼습니다");
			}
			return Damage;
		}
		if(skill_Num == 2)
		{
			if(Anger >= 20)
			{
				Damage = Attack*5.35;
				System.out.println("선조의 망치를 시전합니다."+(int)Damage+"의 데미지를 주었습니다!");
				return Damage;
			}
			else
			{
				System.out.println("분노가 부족합니다. 현재 분노량 " + Anger);
				return Damage;
			}
				
		}
		if(skill_Num == 3)
		{
			Defence = Defence + Defence*0.2;
			HP = HP + HP*0.1;
		}
		return 0;
	}
}
