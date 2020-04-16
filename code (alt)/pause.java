import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pause extends startstop
{
    public pause () 
        {
            GreenfootImage image = getImage () ;
            image.scale(image.getWidth() -13, image.getHeight() -30) ;
            setImage (image) ;
        }
    /**
     * Act - do whatever the pause wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            ((MyWorld)getWorld()).pause() ;
        }
    }    
}
