package package3_OOPs;

public class Myvechile implements engine {
	
	int gear;
	int speed;

	@Override
	public void changeGear(int gear) {
		// TODO Auto-generated method stub
		this.gear = gear;
		System.out.println("Gear : " + gear);

	}

	@Override
	public void speedUp(int speed) {
		// TODO Auto-generated method stub
		this.speed = speed;
		System.out.println("Speed : " + speed);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Myvechile obj = new Myvechile();
		obj.changeGear(2);
		obj.speedUp(40);

	}

}
