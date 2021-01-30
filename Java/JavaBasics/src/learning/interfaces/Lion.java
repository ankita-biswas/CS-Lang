package learning.interfaces;

class Lion implements StuffedAnimal {

    @Override
    public void chooseAninal() {
	System.out.println("Lion");
    }

    @Override
    public void chooseStufffing() {
	System.out.println("Cotton");
    }

    @Override
    public void chooseClothing() {
	System.out.println("Coat");
    }

    @Override
    public void chooseName() {
	System.out.println("Timmy");
    }

}
