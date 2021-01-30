package learning.interfaces;

class Dog implements StuffedAnimal {

    @Override
    public void chooseAninal() {
	System.out.println("Dog");
    }

    @Override
    public void chooseStufffing() {
	System.out.println("Wool");
    }

    @Override
    public void chooseClothing() {
	System.out.println("Coat");
    }

    @Override
    public void chooseName() {
	System.out.println("Jimmy");
    }

}