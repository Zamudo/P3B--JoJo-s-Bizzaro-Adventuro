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
    public MyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        Frank frank = new Frank();
        addObject(frank, 300, 300);
        
        Random r = new Random();
        
        Stack<String> stack = new Stack<String>();
        
        ArrayList<String> arr = new ArrayList<String>();
        
        arr.add("alligator");
        arr.add("acrylic");
        arr.add("acoustic");
        arr.add("aftershave");
        arr.add("alibi");
        arr.add("anthropology");
        arr.add("august");
        arr.add("baby");
        arr.add("bagel");
        arr.add("balloon");
        arr.add("banana");
        arr.add("basketball");
        arr.add("bathroom");
        arr.add("beast");
        arr.add("blizzard");
        arr.add("bread");
        arr.add("calculator");
        arr.add("cat");
        arr.add("cheese");
        arr.add("chest");
        arr.add("chimpanzee");
        arr.add("coffee");
        arr.add("cold");
        arr.add("cotton");
        arr.add("crush");
        arr.add("danger");
        arr.add("death");
        arr.add("dedication");
        arr.add("desire");
        arr.add("dirt");
        arr.add("doctor");
        arr.add("dream");
        arr.add("duck");
        arr.add("egg");
        arr.add("exclamation");
        arr.add("eyelash");
        arr.add("family");
        arr.add("feast");
        arr.add("february");
        arr.add("fertilizer");
        arr.add("fiber");
        arr.add("finger");
        arr.add("fisherman");
        arr.add("flame");
        arr.add("flare");
        arr.add("foam");
        arr.add("frost");
        arr.add("game");
        arr.add("geometry");
        arr.add("ghost");
        
        for(int i = 50; i > 0; i--)
        {
            int num = Greenfoot.getRandomNumber(i);
            stack.push(arr.get(num));
            System.out.println(arr.get(num));
            arr.remove(num);
        }
    }
}
