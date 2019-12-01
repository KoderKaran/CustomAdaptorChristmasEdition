public class StoryTime {
	public static void main(String[] args){
		Prancer prancer = new Prancer();
		Rudolph theSadReindeer = new Rudolph();
		RudolphAdapter theRedNosedReindeer = new RudolphAdapter(theSadReindeer);

		System.out.println("Santa needed to get the presents to all the good boys and girls, so he hops on his sled and flies off with his reindeer!\n");
		prancer.flySled();
		prancer.flyBehavior();
		System.out.println("");
		theRedNosedReindeer.flySled();
		theRedNosedReindeer.flyBehavior();
		System.out.println("\nSilly programmer! You didn't need to make an adapter for Rudolph. He is just like the other reindeer!\n*Insert Moral Lesson Here*");

	}
}
