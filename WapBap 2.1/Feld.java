import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Felder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Feld extends Actor
{
    static int spielzuge;
    private int limit = 0 ;
    private String[] cheat = {"b","a","d","a","d","i"} ; 
    private int cheatdepth = 0 ;
    private int cheater=0 ;
    
    /**
     * Act - do whatever the Felder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Feld ()
    {
        GreenfootImage image = getImage () ;
        image.scale(image.getWidth() -950, image.getHeight() -950) ;
        setImage (image);
        spielzuge=1;
    }
    
    
    public void whoischeating ()
    {
        MyWorld Welt = (MyWorld) getWorld();
        if (Greenfoot.isKeyDown("1"))
        {
            cheater = 1 ;
            Welt.addObject(new start(),100,100) ;
            Greenfoot.delay(1) ;
            Welt.removeObjects(Welt.getObjects(start.class)) ;
        }
        else if (Greenfoot.isKeyDown("2"))
        {
            cheater = 2 ;
            Welt.addObject(new start(),100,100) ;
            Greenfoot.delay(1) ;
            Welt.removeObjects(Welt.getObjects(start.class)) ;
        }
    }
    public void act() 
    {
        spielen () ;
        cheats (cheater) ;  
        whoischeating() ;
     }
    
    public void spielen () {
        FourWins Welt = (FourWins) getWorld();
        int x = (getX() -350) / 50;
        int y = (getY() -150) / 50;
        if (Greenfoot.mouseClicked(this)) 
        {
            if (limit==0)
            {
                if ( spielzuge % 2 == 0 ) 
                {
                    spielzuge +=1 ;
                    getWorld().addObject(new Krias(), getX(), getY()) ;
                    limit ++ ;
                    Welt.Feldstatus[x+6*y] = 1;
                    //Welt.showText(""+limit,500,500) ;
                }
                else if ((Greenfoot.mouseClicked(this))) 
                {
                    getWorld().addObject(new Kroiz(), getX(), getY()) ;
                    spielzuge +=1;
                    limit ++ ;
                    Welt.Feldstatus[x+6*y] = 2;
                }
            }
            Welt.checkWin(x+6*y) ;
        }
    }
    
    
    private void cheats (int xy)
    {
            FourWins Welt = (FourWins) getWorld();
            //if (Greenfoot.isKeyDown(""))
            String key = Greenfoot.getKey();
            if (key != null)
            {
                if (cheat[cheatdepth].equals(key))
                {
                    cheatdepth++;
                    Welt.addObject(new start(),100,100) ;
                    Greenfoot.delay(1) ;
                    Welt.removeObjects(Welt.getObjects(start.class)) ;
                    if (cheatdepth == cheat.length)
                    {
                        Welt.bibisLachen.playLoop() ;
                        Greenfoot.delay(70) ;
                        //if(lachTimer==0) {
                        if (xy == 1)
                        {
                            Welt.KroizWin () ;
                            Welt.bibisLachen.pause() ;
                        }
                        else if (xy ==2) 
                        {
                            Welt.KriasWin () ;
                            Welt.bibisLachen.pause() ;
                        }
                      //}
                      //else lachTimer -=1 ;
                    }
                }
                else
                {
                    cheatdepth = 0 ;
                }
            }
    }
    
    //public void increaseSpielzug () {
      //  spielzuge +=1 ;
    //}
}

