import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    String lvlOneString = "JoJo's mother, Ms. Holly, is a woman capable of calming the hearts of others. People feel at ease around her. This may sound awkward... but if I were to fall in love, I'd like it to be with someone like her. I would give my all for her. And I would want to always see her warm, happy smile.";
    public MyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 534, 1); 
        
        Frank frank = new Frank();
        addObject(frank, 300, 300);
        
        Random r = new Random();
        
        Stack<String> stack = new Stack<String>();
        
        ArrayList<String> arr = new ArrayList<String>();
        
        String input = Greenfoot.ask("frank");
    }
    public void levelOne()
    {
        countDown();
        
    }
    public void countDown()
    {
        private int timer = 3000;
        public void act()
        {
            timer--;
            if (timer <= 0)
            {
                Greenfoot.stop();
            }
        }
    }
}
