import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class frank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frank extends Actor
{
    /**
     * Act - do whatever the Frank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(1);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            move(1);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(1);
        }
        else if(Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(1);
        }
    }    
}
