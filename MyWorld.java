import greenfoot.*;

public class MyWorld extends World {

    public MyWorld() {
        super(600, 400, 1);

        Hero hero = new Hero();
        addObject(hero, 100, 100);

        Banana banana = new Banana();
        addObject(banana, 600, 100);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
