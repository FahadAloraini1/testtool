package lab3;
public class DLLTest {
	public static void main(String[] args) {
		DLL<String> test = new DLL<String>();
		for(int i = 0; i < 10; i++)
			test.addToTail("a" + i);
		test.printAll();
		System.out.println();
		test.printReverse();
		System.out.println();
		test.delete7();
		test.delete7();
		test.delete7();
		test.delete7();
		test.delete7();
		test.delete7();
		test.delete7();
		test.delete7();
		test.delete7();
		test.delete7();
	


	
	}
}