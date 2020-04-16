import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Placeholder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Placeholder extends MyWorld
{

    /**
     * Constructor for objects of class Placeholder.
     * 
     */
    public Placeholder()
    {
    }
    
    public void startgame()
    {
        setBackground(new GreenfootImage("einfachRot.png"));
        showText("Sorry, dieses Spiel wurde noch nicht programmiert... :(",500,320);
        showText("Klicke, um wieder ins Menü zu gelangen",500,400);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            reset();
        }
    }
}
