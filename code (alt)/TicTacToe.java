import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TicTacToe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicTacToe extends Spiele
{
    /**
     * Act - do whatever the TicTacToe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public TicTacToe ()
    {
        GreenfootImage image = getImage () ;
        image.scale(image.getWidth() -530, image.getHeight() -530) ;
        setImage (image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) 
        {
            ((MyWorld)getWorld()).startvierGewinnt();
        }
    } 
}
