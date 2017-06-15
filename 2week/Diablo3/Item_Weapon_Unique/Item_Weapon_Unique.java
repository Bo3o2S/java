package Item_Weapon_Unique;

import Item.Weapon;
import Monster.MonSter;

import java.util.Random;

import Character.Character;
import Game.Damage_Calculator;
import Game.SharedResource_Battle;

public class Item_Weapon_Unique extends Weapon{
	
	public Item_Weapon_Unique()	// 일반 아이템 기본 세팅
	{
		Item_Type = "유니크 아이템";	// 아이템 종류
		Item_Attack = 20;		// 아이템 공격력
		Item_Vitality = 20;		// 아이템 활력
		Item_Jewelry_Hole_Num = 3;  // 보석홈 개수
	}
	
	public String Thunder_of_Heaven = "하늘의 번개";
	public String Explosion = "익스플로전";
	public String Summons_Damon = "악마 소환";
	double Thunder_of_Heaven_Attack_Rate = 4.0;
	double Thunder_of_Heaven_Add_Attack_Rate = 1.0;
	double Explosion_Attack_Rate = 4.0;
	double Explosion_Add_Attack_Rate = 2.0;
	double Summons_Damon_Attack_Rate = 6.0;
	double Summons_Damon_Add_Attack_Rate = 10.0;
	
	public void Unique_Weapon_Skill(MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		Random rand = new Random();
		if(rand.nextInt(3) == 0)
		{
			if(rand.nextInt(100)<30)
				Thunder_of_Heaven(monster, sharedresource_battle);
		}
		else if(rand.nextInt(3) == 1)
		{
			if(rand.nextInt(100)<30)
				Explosion(monster, sharedresource_battle);
		}
		else if(rand.nextInt(3) == 2)
		{
			if(rand.nextInt(100)<30)
				Summons_Damon(monster, sharedresource_battle);
		}
	}
	
	
	public void Thunder_of_Heaven(MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		bar();
		Thread thread = new Thread(new Runnable() 
		{
			int count = 0;
			@Override
			public void run() {
					double Damage = 0;
					int duration = 1;
					Damage = Item_Attack*Thunder_of_Heaven_Attack_Rate;
					System.out.println("유니크 무기 고유 스킬 " + Thunder_of_Heaven + "이 발동합니다!");
					System.out.println(Damage + "만큼 데미지를 입힙니다!");
					Damage_Calculator damage_calculator = new Damage_Calculator(Damage, monster);
					Damage = damage_calculator.Damage_Conversion();
					sharedresource_battle.Character_Attack(Damage);
					monster.HP = sharedresource_battle.Monster_HP;
					System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
					if(sharedresource_battle.Monster_HP > 0)
						System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
				try {
						while(true)
						{
							if(count<3)
								break;
							bar();
							Thread.sleep(duration*1000);
							Damage = Item_Attack*Thunder_of_Heaven_Add_Attack_Rate;
							System.out.println(Thunder_of_Heaven + "의 추가 데미지가 발동합니다!");
							System.out.println(Damage + "만큼 데미지를 입힙니다!");
							Damage = damage_calculator.Damage_Conversion();
							sharedresource_battle.Character_Attack(Damage);
							monster.HP = sharedresource_battle.Monster_HP;
							System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
							count++;
							if(sharedresource_battle.Monster_HP > 0)
								System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
							bar();
							
						}
						
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		bar();
	}
	
	public void Explosion(MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		bar();
		Thread thread = new Thread(new Runnable() 
		{
			
			int count = 0;
			int duration = 1;
			@Override
			public void run() {
				double Damage = 0;
				Damage = Item_Attack*Explosion_Attack_Rate;
				System.out.println("유니크 무기 고유 스킬 " + Explosion + "이 발동합니다!");
				System.out.println(Damage + "만큼 데미지를 입힙니다!");
				Damage_Calculator damage_calculator = new Damage_Calculator(Damage, monster);
				Damage = damage_calculator.Damage_Conversion();
				sharedresource_battle.Character_Attack(Damage);
				monster.HP = sharedresource_battle.Monster_HP;
				System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
				if(sharedresource_battle.Monster_HP > 0)
					System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
				try {
						while(true)
						{
							if(count<2)
								break;
							bar();
							Thread.sleep(duration*1000);
							Damage = Item_Attack*Explosion_Add_Attack_Rate;
							System.out.println(Explosion + "의 추가 데미지가 발동합니다!");
							System.out.println(Damage + "만큼 데미지를 입힙니다!");
							Damage = damage_calculator.Damage_Conversion();
							sharedresource_battle.Character_Attack(Damage);
							monster.HP = sharedresource_battle.Monster_HP;
							System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
							count++;
							if(sharedresource_battle.Monster_HP > 0)
								System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
							bar();
						}
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		bar();
	}
	
	public void Summons_Damon(MonSter monster, SharedResource_Battle sharedresource_battle)
	{
		bar();
		Thread thread = new Thread(new Runnable() 
		{
			Random rand = new Random();
			@Override
			public void run() {
					double Damage = 0;
					int duration = 1;
					Damage = Item_Attack*Summons_Damon_Attack_Rate;
					System.out.println("유니크 무기 고유 스킬 " + Summons_Damon + "이 발동합니다!");
					System.out.println(Damage + "만큼 데미지를 입힙니다!");
					Damage_Calculator damage_calculator = new Damage_Calculator(Damage, monster);
					Damage = damage_calculator.Damage_Conversion();
					sharedresource_battle.Character_Attack(Damage);
					monster.HP = sharedresource_battle.Monster_HP;
					System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
					if(sharedresource_battle.Monster_HP > 0)
						System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
				try {
						if(rand.nextInt(10) < 1)
						{
							Thread.sleep(duration*1000);
							Damage = Item_Attack*Summons_Damon_Add_Attack_Rate;
							System.out.println(Summons_Damon + "의 추가 데미지가 발동합니다!");
							System.out.println(Damage + "만큼 데미지를 입힙니다!");
							Damage = damage_calculator.Damage_Conversion();
							sharedresource_battle.Character_Attack(Damage);
							monster.HP = sharedresource_battle.Monster_HP;
							System.out.println(monster.Name + "이(가) " +(int) Damage + "만큼 데미지를 받았습니다!");			// 몬스터가 받는 데미지
							if(sharedresource_battle.Monster_HP > 0)
								System.out.println(monster.Name + "의 현재 생명력은 " + (int)sharedresource_battle.Monster_HP + " 입니다!");			// 몬스터가 받는 데미지
							bar();
						}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		bar();
	}
}
