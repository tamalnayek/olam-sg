package com.examples;

class Box<E> {
	private Object[] items = new Object[10]; // max 10 string elements
	private int index = 0;

	public void add(E item) {
		if (index < 10) {
			items[index] = item;
			index++;
		} else
			throw new IndexOutOfBoundsException();
	}

	public E get(int i) {
		if (i < index)
			return (E) items[i];
		else
			throw new IndexOutOfBoundsException();
	}
}

public class Generics_Ex {

	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		box.add("item-1");
		box.add("item-2");
		box.add("item-3");
		box.add("item-4");
		box.add("item-5");
		box.add("item-6");
		box.add("item-7");
		box.add("item-8");
		box.add("item-9");
		box.add("item-10");

		String item = box.get(5);
		System.out.println(item);

		// -------------------------------
		
		Box<Integer> box2=new Box<>();
		box2.add(123123);

	}

}
