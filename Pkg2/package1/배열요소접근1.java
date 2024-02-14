package package1;

public class 배열요소접근1 {

	public static void main(String[] args) {

		String[] names = { "Maria", "Fatiha", "Pradeepa", "Sarah" };
		int index = 1;
		if (index >= 0 && index < names.length) {
			System.out.println("Element at index " + index + ":" + names[index]);
		} else {
			System.out.println("Invalid index: " + index);
		}
		
	}

}
