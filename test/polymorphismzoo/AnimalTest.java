package polymorphismzoo;

import java.util.*;

import junit.framework.TestCase;

public class AnimalTest extends TestCase {

	public void testAnimalZeroConstructor(){
		Animal bear = new Bear();
		assertEquals("newborn", bear.getName());
		assertEquals(0, bear.getAge());
		
		Animal parrot = new Parrot();
		assertEquals("newborn", parrot.getName());
		assertEquals(0, parrot.getAge());
		
		Animal wolf = new Wolf();
		assertEquals("newborn", wolf.getName());
		assertEquals(0, wolf.getAge());
		
		Animal polly = new Parrot(3);
		assertEquals("Polly", polly.getName());
		assertEquals(3, polly.getAge());
	}
	
	public void testToString(){
		Animal bear = new Bear();
		assertEquals("<newborn, 0>", bear.toString());
	}
	
	public void testCompareTo(){
		Animal peter = new Bear("Peter", 3);
		Animal lewis = new Wolf("Lewis", 2);
		Animal aaron = new Parrot("Aaron", 5);
		Animal allen = new Bear("Allen", 7);
		Animal polly = new Parrot("Polly", 1);
		List<Animal> animals = new ArrayList<>();
		animals.add(peter);
		animals.add(lewis);
		animals.add(aaron);
		animals.add(allen);
		animals.add(polly);
		
		Collections.sort(animals);
		
		for (Animal animal : animals){
			System.out.println(animal);
		}
		
	}
}
