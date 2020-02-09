import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Felder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Felder extends Actor
{
    static int spielzuge;
    private int limit = 0 ;
    /**
     * Act - do whatever the Felder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Felder ()
    {
        GreenfootImage image = getImage () ;
        image.scale(image.getWidth() -950, image.getHeight() -950) ;
        setImage (image);
        spielzuge=1;
    }
    
    public void act() 
    {
        spielen () ;
        if (Greenfoot.isKeyDown ("right"))
            {
            getWorld().showText("FELIX WINS",500,500) ;
            Greenfoot.stop() ;
            }
        if (Greenfoot.isKeyDown("A")) 
           {
            spielzuge +=1 ;
           }
     }
    
    public void spielen () {
        if (Greenfoot.mouseClicked(this)) 
        {
            if (limit==0)
            {
                if ( spielzuge % 2 == 0 ) 
                {
                    spielzuge +=1 ;
                    getWorld().addObject(new Krias(), getX(), getY()) ;
                    limit +=1 ;
                }
                else if ((Greenfoot.mouseClicked(this))) 
                {
                    getWorld().addObject(new Kroiz(), getX(), getY()) ;
                    spielzuge +=1;
                    limit +=1 ;
                }
            }
        }
    }
    
    //public void increaseSpielzug () {
      //  spielzuge +=1 ;
    //}
}

