package learning.basics;

public class JavaScope {

    public String golablMessage = "hi";

    public String msg = "test";

    public static void main(String[] args) {
	JavaScope myObject = new JavaScope();
	myObject.testThis();
    }

    public void testThis() {
	String msg = "test2";
	System.out.println(this.msg);
	System.out.println(msg);

    }

    public void testScope() {
	System.out.println(golablMessage);

	// System.out.println(localMsg);

    }

    public void testScope2() {

	String localMsg = "hello";

	System.out.println(localMsg);
    }

    @SuppressWarnings("unused")
    public void testScope3() {

	String myMsg = "Hey Bill!";

	{
	    System.out.println(myMsg);
	    String myMsg2 = "Hey Jim!";

	}

	// System.out.println(myMsg2); // myMsg2 is unavailable here
    }
}
