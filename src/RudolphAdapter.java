public class RudolphAdapter implements Reindeers{
	private Rudolph theRedNosedReindeer;

	public RudolphAdapter(Rudolph newRudolph){
		theRedNosedReindeer = newRudolph;
	}

	@Override
	public void flySled() {
		theRedNosedReindeer.embarrassedFlying();
	}

	@Override
	public void flyBehavior() {
		theRedNosedReindeer.redNosedFlying();
	}
}
