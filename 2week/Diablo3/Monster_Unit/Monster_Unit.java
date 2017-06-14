package Monster_Unit;

import Character_Job.Character_Job;

public interface Monster_Unit {
	
	public void Monster_Appear();
	public boolean Kill_Success();
	public double Monster_Attack();
	public double Monster_HP();
	public Object Drop_Item(Character_Job character_job);
}
