package Character;

public class Witch_Doctor extends Character_BasicStatus{
	public Witch_Doctor()
	{
		this.HP = 130;
		this.Mana = 750;
		this.Strength = 8;
		this.Dex = 8;
		this.Intelligence = 10;
		this.Vitality = 8;
		this.Attack = 6;
		this.Defence = 12;
		this.Recovery = 10;
		this.evasion = 3;
		this.Gold = 5000;
	}
	
	public void Level(int Level)
	{
		HP = HP + 190*(Level-1) + (Vitality + 8*(Level-1))*0.05;
		Strength = Strength + 10*(Level-1);
		Dex = Dex + 10*(Level-1);
		Intelligence = Intelligence + 30*(Level-1);
		Vitality = Vitality + 8*(Level-1);
		Attack = Attack + 11*(Level-1);
		Defence = Defence + 10*(Level-1);
		Recovery = Recovery + 7*(Level-1);
		evasion = evasion + 0.3*(Level-1);
		Gold = 5000;
	}
}
