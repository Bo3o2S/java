package Character;

public class Holy_Warrior extends Character_BasicStatus{
	public Holy_Warrior()
	{
		HP = 140;
		Holy_Power = 100;
		Strength = 10;
		Dex = 8;
		Intelligence = 8;
		Vitality = 10;
		Attack = 5;
		Defence = 16;
		Recovery = 10;
		evasion = 3;
		Gold = 5000;
	}

	public void Level(int Level)
	{
		HP = HP + 200*(Level-1) + (Vitality + 10*(Level-1))*0.05;
		Strength = Strength + 30*(Level-1);
		Dex = Dex + 10*(Level-1);
		Intelligence = Intelligence + 10*(Level-1);
		Vitality = Vitality + 10*(Level-1);
		Attack = Attack + 10*(Level-1);
		Defence = Defence + 10*(Level-1);
		Recovery = Recovery + 7*(Level-1);
		evasion = evasion + 0.3*(Level-1);
		Gold = 5000;
	}
}
