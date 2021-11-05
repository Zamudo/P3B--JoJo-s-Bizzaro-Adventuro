import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.net.*;
import java.io.*;
import java.util.ArrayList;
/**
 * Title Screen.
 * 
 * @author Jo 
 * @version 11/1/2021
 */
public class Title extends World
{
    //Creates a label to serve as the title of the game 
    //Title by Frankie
    Label titleLable = new Label("JoJo's Hangman Adventure", 48);
    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 534, 1); 
        //Adds the title into the world
        addObject(titleLable, getWidth() / 2, -getHeight() + 650);
        prepare();
    }

    public void act()
    {
        //When the user presses space on the title screen, they are taken to the next world
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
        //More accurate placements for the objects on the screen
        Label label = new Label("Press <space> to start", 50);
        addObject(label,411,430);
        label.setLocation(416,424);

    }
}

