class Dog {

	String name;

	public static void main (String[] args) {

		Dog dog1 = new Dog();

		dog1.bark();

		dog1.name = "Bart";

		Dog[] myDogs = new Dog[3];

		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";

		System.out.println("Last dog's name is " + myDogs[2].name);

		int x = 0;

		while (x < myDogs.length) {
			myDogs[x].bark();
			++x;
		}
	}

	public int bark() {
		System.out.println(name + " says Ruff!");
		return 0;
	}
}