package Character;
import java.util.Random;
public class Damon_Hunter_Skill extends Daemon_Hunter{
	public double Skill(int skill_Num, int Level)
	{
		Level(Level);
		Random random = new Random();
		double Damage = 0;
		double Damage_Add = 0;
		if(skill_Num == 1)
		{
			Damage = Attack*150;
			System.out.println("굶주린 화살을 시전합니다"+(int)Damage+"의 데미지를 주었습니다!");
			if(random.nextInt(100) <= 34)
			{
				Damage_Add = Attack*300;
				System.out.println("추가데미지"+(int)Damage_Add+"를 주었습니다!");
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
