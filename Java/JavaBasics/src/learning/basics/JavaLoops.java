package learning.basics;

public class JavaLoops {

    // While:
    // while (true) { ...}
    public void learnWhileLoop() {
	int i = 0;

	while (i < 100) {
	    System.out.print("#");
	    i++;

	    if (i > 10) {
		break;
	    }
	}
    }

    // For
    // for (init value; true condition; optional statement) {}

    public void learnForLoop() {
	for (int k = 0; k < 10; k++) {
	    for (int i = 0; i < 10; i++) {
		System.out.print("# ");
	    }
	    System.out.println();
	}
    }

    // Do - while
    public void learDoWhileLoop() {
	int i = 0;
	do {
	    System.out.println("#");
	    i++;
	} while (i < 0);
    }

    public static void main(String[] args) {
	JavaLoops myClass = new JavaLoops();
	// myClass.learnWhileLoop();
	// myClass.learnForLoop();
	myClass.learDoWhileLoop();
    }

}
