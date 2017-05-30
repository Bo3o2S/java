package Character;

public class Daemon_Hunter extends Character_BasicStatus{
	public Daemon_Hunter()
	{
		HP = 130;
		Hate = 125;
		Moderation = 30;    
		Strength = 8;
		Dex = 10;
		Intelligence = 8;
		Vitality = 8;
		Attack = 6;
		Defence = 12;
		Recovery = 10;
		evasion = 7;
		Gold = 5000;
	}
	
	public void Level(int level)
	{
		HP = HP + 190*(Level-1) + (Vitality + 10*(Level-1))*0.05;
		Strength = Strength + 10*(Level-1);
		Dex = Dex + 30*(Level-1);
		Intelligence = Intelligence + 10*(Level-1);
		Vitality = Vitality + 10*(Level-1);
		Attack = Attack + 11*(Level-1);
		Defence = Defence + 9*(Level-1);
		Recovery = Recovery + 5*(Level-1);
		evasion = evasion + 0.4*(Level-1);
	}
}
