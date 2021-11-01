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
        super(800, 600, 1); 
        
        addObject(titleLable, getWidth() / 2, -getHeight() + 650);
    }
}
