import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Felder2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Felder2 extends Felder
{
    public int countFelder2 = 0 ;
    /**
     * Act - do whatever the Felder2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        spielen() ;
        if (isTouching(Kroiz.class))
        {
            countFelder2 = 1 ;
        }
        if (isTouching(Krias.class))
        {
            countFelder2 = 2 ;   
        }
        getWorld().showText("countFelder2"+countFelder2,500,550) ;
    }   
}
