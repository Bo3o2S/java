package Character;

public class Monk extends Character_BasicStatus{
	public Monk()
	{
		HP = 135;
		Spirit_Power = 250;
		Strength = 8;
		Dex = 10;
		Intelligence = 8;
		Vitality = 9;
		Attack = 5.5;
		Defence = 14;
		Recovery = 10;
		evasion = 7;
		Gold = 5000;
	}
	
	public void Level(int Level)
	{
		HP = HP + 195*(Level-1) + (Vitality + 10*(Level-1))*0.05;
		Spirit_Power = 250;
		Strength = Strength + 10*(Level-1);
		Dex = Dex + 30*(Level-1);
		Intelligence = Intelligence + 10*(Level-1);
		Vitality = Vitality + 10*(Level-1);
		Attack = 5.5;
		Defence = 14;
		Recovery = 10;
		evasion = 7;
		Gold = 5000;
	}
}
