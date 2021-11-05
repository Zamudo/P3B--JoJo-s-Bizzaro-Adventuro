import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.net.*;
import java.io.*;
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Stand Proud");
        arr.add("Death");
        arr.add("Menacing");
        arr.add("Power");
        arr.add("Freeze");
        arr.add("Egypt");
        arr.add("Drain");
        arr.add("Punch");
        arr.add("Gambler");
        arr.add("Emerald Splash");
        arr.add("Phantom Blood");
        arr.add("Family");
        arr.add("Face");
        arr.add("Erase");
        arr.add("Forgiveness");
        arr.add("Bites The Dust");
        arr.add("Mirror");
        arr.add("Cloud");
        arr.add("Traitor");
        arr.add("Betrayal");
        arr.add("Soccer Ball");
        arr.add("Infinite");
        arr.add("Requiem");
        arr.add("Follower");
        arr.add("Knives");
        arr.add("Time Stop");
        arr.add("Spin");
        arr.add("Steel Ball");
        arr.add("Alternate Universe");
        arr.add("Justice");
        String currentWord;
        
        if(Greenfoot.isKeyDown("1"))
        {
            currentWord = "turtle";
            Label wordLabel = new Label(currentWord, 48);
        }
    }
}
