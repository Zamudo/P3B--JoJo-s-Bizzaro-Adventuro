import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Jo 
 * @version 11/1/2021
 */
public class Title extends World
{
    Label titleLable = new Label("JoJo's EPIC TypeRacer BATTLE", 48);
    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 534, 1); 

        addObject(titleLable, getWidth() / 2, -getHeight() + 650);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Frank frank = new Frank();
        addObject(frank,345,271);
        Label label = new Label("Press <space> to start", 50);
        addObject(label,411,430);
        label.setLocation(416,424);
        frank.setLocation(384,271);
    }
}
