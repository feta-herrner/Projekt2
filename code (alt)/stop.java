import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stop extends startstop
{
    public stop () 
        {
            GreenfootImage image = getImage () ;
            image.scale(image.getWidth() -955, image.getHeight() -955) ;
            setImage (image) ;
        }
    /**
     * Act - do whatever the stop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) 
        {
           ((MyWorld)getWorld()).reset() ;
        }    
    }
}
