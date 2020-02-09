import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Felder1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Felder1 extends Felder
{
    public int countFelder1 = 0 ;
    /**
     * Act - do whatever the Felder1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        spielen() ;
        if (isTouching(Kroiz.class))
        {
            countFelder1 = 1 ;
        }
        if (isTouching(Krias.class))
        {
            countFelder1 = 2 ;   
        }
        getWorld().showText("countFelder1"+countFelder1,500,500) ;
    }    
}
