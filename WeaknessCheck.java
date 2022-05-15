
public class WeaknessCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//adding zombies and their weakness and/or strengths
		ZombieTypes zombie = new ZombieTypes();
		zombie.addZombiesWeakness("runner", "achilles heel");
		zombie.addZombiesWeakness("big", "fire");
		zombie.addZombiesWeakness("biter", "armor");
		zombie.addZombiesWeakness("armored", "crossbow");
		zombie.addZombiesStrength("runner", "fast");
		zombie.addZombiesStrength("big", "strong");
		zombie.addZombiesStrength("biter", "sharp teeth");
		zombie.addZombiesStrength("armored", "durable");
		
		//check that correct weakness is pulled up by searching a type
		System.out.println(zombie.getWeakness("runner"));
		
		//print full list of types and weakness/strengths
		System.out.println("Weaknesses are " + zombie.weakness);
		System.out.println("Strengths are " + zombie.strengths);
	}

}
