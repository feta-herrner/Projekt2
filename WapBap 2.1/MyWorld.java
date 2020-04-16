import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   
    //erster Array-Versuch, aber auch noch umständlicher, als nötig.3
    //private int[] x = {350,400,450,500,550,600} ;
    //private int[] y = {150,200,250,300,450,500} ;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        startgame();
    }
    
    public void reset () 
    {
        Greenfoot.setWorld(new Selection());
    }
    
    public void resume ()
    {
        removeObjects(getObjects(pausiert.class));
        removeObjects(getObjects(resume.class));
    }
    
    public void pause ()
    {
        pausiert pausiert = new pausiert();
        addObject(pausiert,500,300);
        resume resume = new resume();
        addObject(resume,500,350);
    }
    
    public void startgame()
    {
    }
}
