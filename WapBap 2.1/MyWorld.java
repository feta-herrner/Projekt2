import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound bibisLachen = new GreenfootSound("bibislache.mp3");
    public int[] Feldstatus = new int [36] ;
    private String[] Spielbilder = {"tictactau.png", "emptyGame.png","emptyGame.png","emptyGame.png","emptyGame.png","emptyGame.png",
        "emptyGame.png","emptyGame.png"} ;
    private String[] Spiele = {"tictactau", "emptyGame","emptyGame","emptyGame","emptyGame","emptyGame",
        "emptyGame","emptyGame"} ;
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
    
    //Felderbauen in... ungefähr 100x schneller lol
    private void felderbauen ()
    {
        for ( int r=0; r<36; r++) {
            int reihe = (int)Math.ceil(r/6);
            int spalte = r%6 ;
            Feldstatus [r] = 0 ;
            Feld Feld = new Feld() ;
            addObject (Feld,350+spalte*50, 150+reihe*50) ;
        }
    }
    
    private void Spielesammlung ()
    {
        for(int s=0; s<8; s++) {
            int reihe = (int)Math.ceil(s/4) ;
            int spalte = s%4 ;
            GreenfootImage image = new GreenfootImage (Spiele[s]+".png");
            Spielauswahl Spielauswahl = new Spielauswahl (image,Spiele[s]) ;
            addObject (Spielauswahl,200+spalte*200, 250+reihe*200) ;
            //Spielauswahl.setImage(Spielbilder[s]) ;
            //Spielauswahl.skalieren () ;
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        //Spielauswahl Spielauswahl = new Spielauswahl();
        //addObject(Spielauswahl,150,250);
        Spielesammlung () ;
    }
    
    public void checkWin (int feldnummer)
    {
        int Typ = Feldstatus [feldnummer] ;
        //showText("Feld"+feldnummer,100,100) ;
        checkall(Typ,feldnummer) ;
    }
    
    private void checkall (int Typ, int feldnummer)
    {
        int gleicheLinks = 0;
        int gleicheRechts = 0;
        int gleicheOben = 0;
        int gleicheUnten = 0;
        
            boolean keinTrefferLinks = false ;
            boolean keinTrefferRechts = false ;
            boolean keinTrefferOben = false ;
            boolean keinTrefferUnten = false ;
        for(int n=1; n<5; n++)
        {
            if(Math.ceil(feldnummer/6) == Math.ceil((feldnummer+n)/6))
            {
                if(feldnummer+n >= 0 && feldnummer+n < Feldstatus.length)
                {
                    if(Feldstatus[feldnummer+n] == Typ)
                    {
                        gleicheRechts ++ ;
                        if(gleicheRechts + gleicheLinks>=3)
                        {
                            whoWins(Typ) ;
                            break ;
                        }
                    }
                    else
                    {
                        keinTrefferRechts = true ;
                    }
                }
            }
            else
            {
                keinTrefferRechts = true ;
            }
            
            if(Math.ceil(feldnummer/6) == Math.ceil((feldnummer-n)/6))
            {
                if(feldnummer-n >= 0 && feldnummer-n < Feldstatus.length)
                {
                    if(Feldstatus[feldnummer-n] == Typ)
                    {
                        gleicheLinks ++ ;
                        if ((gleicheLinks + gleicheRechts) >= 3)
                        {
                            whoWins(Typ) ;
                            break ;
                        }
                    }
                    else
                    {
                        keinTrefferLinks = true ;
                    }
                }
            }
            else 
            {
                keinTrefferLinks = true ;
            }
            if(keinTrefferLinks && keinTrefferRechts)
            {
                break ;
            }
        }
        
        for (int n=6; n<30; n+=6)
        {
            if(feldnummer+n >= 0 && feldnummer+n < Feldstatus.length)
            {
                if(Feldstatus[feldnummer+n] == Typ)
                    {
                        gleicheUnten ++ ;
                        if ((gleicheOben + gleicheUnten) >= 3)
                        {
                            whoWins(Typ) ;
                            break ;
                        }
                    }
                    else
                    {
                        keinTrefferUnten = true ;
                    }
            }
            else
            {
                keinTrefferUnten = true ;
            }
            if(feldnummer-n >= 0 && feldnummer-n < Feldstatus.length)
            {
                if(Feldstatus[feldnummer-n] == Typ)
                {
                    gleicheOben ++ ;
                    if ((gleicheOben + gleicheUnten) >= 3)
                    {
                        whoWins(Typ) ;
                        break;
                    }
                }
                else
                {
                    keinTrefferOben = true ;
                }
            }
            else 
            {
                keinTrefferOben = true; 
            }
            if(keinTrefferOben && keinTrefferUnten)
            {
                break ;
            }
        }
        //vertikal:
        
        int gleichediag1 = 0 ;
        int gleichediag2 = 0 ;
        int gleichediag3 = 0 ;
        int gleichediag4 = 0 ;
        
        for (int n=1; n<8; n++) 
        {
            boolean keineTrefferdiag1 = false ;
            boolean keineTrefferdiag2 = false ;
            if(feldnummer+n*6+n>=0 && feldnummer+n*6+n<Feldstatus.length)
            {
                if(Feldstatus[feldnummer+n*6+n] == Typ)
                {
                    gleichediag1 ++ ;
                    if ((gleichediag1 + gleichediag2) >= 3)
                    {
                        whoWins(Typ) ;
                        break;
                    }
                }
                else
                {
                   keineTrefferdiag1 = true ; 
                }
            }
            else 
            {
                keineTrefferdiag1 = true ;
            }
            if(feldnummer-n*6-n>=0 && feldnummer-n*6-n<Feldstatus.length)
            {
                if(Feldstatus[feldnummer-n*6-n] == Typ)
                {
                    gleichediag2 ++ ;
                    if ((gleichediag1 + gleichediag2) >= 3)
                    {
                        whoWins(Typ) ;
                        break;
                    }
                }
                else
                {
                    keineTrefferdiag2 = true ;
                }
            }
            else 
            {
                keineTrefferdiag2 = true ;
            }
            if (keineTrefferdiag1 && keineTrefferdiag2)
            { 
                break ;
            }
        }
        
        for (int n=1; n<8; n++)
        {
            boolean keineTrefferdiag3 = false ;
            boolean keineTrefferdiag4 = false ;
            if (feldnummer+n*6-n >= 0 && feldnummer+n*6-n < Feldstatus.length)
            {
                if(Feldstatus[feldnummer+n*6-n] == Typ)
                {
                    gleichediag3++ ;
                    if((gleichediag3 + gleichediag4) >= 3)
                    {
                        whoWins(Typ) ;
                        break;
                    }
                }
                else
                {
                    keineTrefferdiag3 = true ;
                }
            }
            else 
            {
                keineTrefferdiag3 = true ;
            }
            
            if (feldnummer-n*6+n >= 0 && feldnummer-n*6+n < Feldstatus.length)
            {
                if(Feldstatus[feldnummer-n*6+n] == Typ)
                {
                    gleichediag4++ ;
                    if((gleichediag3 + gleichediag4) >= 3)
                    {
                        whoWins(Typ) ;
                        break;
                    }
                }
                else
                {
                    keineTrefferdiag4 = true ;
                }
            }
            else 
            {
                keineTrefferdiag4 = true ;
            }
            if (keineTrefferdiag3 && keineTrefferdiag4)
            {
                break ;
            }
          }
    }
    
    
    private void whoWins(int x) 
    {
        if (x%2 == 0)
        {
            KroizWin() ;
        }
        else 
        {
            KriasWin() ;
        }
    }
    
    public void KroizWin ()
    {
       Greenfoot.delay(60) ;
        List Alles = getObjects(null);
       removeObjects(Alles); 
       setBackground("XWINS.png") ;
       Greenfoot.delay(100) ;
       reset () ;
    }
    
    public void KriasWin()
    {
       Greenfoot.delay(60) ;
       List Alles = getObjects(null);
       removeObjects(Alles); 
       setBackground("OWINS.png") ;
       Greenfoot.delay(100) ;
       reset () ;
    }
    
    public void reset () 
    {
        List Alles = getObjects(null);
        removeObjects(Alles);
        setBackground(new GreenfootImage("Hintergraund.png")) ;
        prepare() ;
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
    
    public void startgame (int gamenumber) 
    {
        if(gamenumber == 0)
        {
            startvierGewinnt() ;
        }
        for (int t=1; t<8; t++)
        {
            if (gamenumber == t) 
            {
                setBackground(new GreenfootImage("einfachRot.png"));
                List Spiele = getObjects(null);
                removeObjects(Spiele);
                showText("Sorry, Spiel Nummer "+(t+1),500,300) ;
                showText("wurde noch nicht programmiert... :(",500,320) ;
                Greenfoot.delay(300) ;
                showText("",500,300) ;
                showText("",500,320) ;
                reset() ;
            }
        }
    }
    
    private void startvierGewinnt ()
    {
        setBackground(new GreenfootImage("viergewinntBackground.png"));
        List Spiele = getObjects(null);
        removeObjects(Spiele);
        startstop () ;
        felderbauen() ;
    }
    
    private void startstop ()
    {
      stop stop = new stop();
      addObject(stop,30,30);
      pause pause = new pause();
      addObject(pause, 65,30);
    }
    
    /**
     * alter code für das Bauen der Felder:
     *
    private void felderbauen() {
        Felder felder1 = new Felder();
        addObject(felder1,350,150);

        Felder felder2 = new Felder();
        addObject(felder2,400,150);
        
        Felder felder3 = new Felder();
        addObject(felder3,450,150);
        
        Felder felder4 = new Felder();
        addObject(felder4,500,150);
        
        Felder felder5 = new Felder();
        addObject(felder5,550,150);
        
        Felder felder6 = new Felder();
        addObject(felder6,600,150);
        
        Felder felder7 = new Felder();
        addObject(felder7,350,200);
        
        Felder felder8 = new Felder();
        addObject(felder8,400,200);
        
        Felder felder9 = new Felder();
        addObject(felder9,450,200);
        
        Felder felder10 = new Felder();
        addObject(felder10,500,200);
        
        Felder felder11 = new Felder();
        addObject(felder11,550,200);
        
        Felder felder12 = new Felder();
        addObject(felder12,600,200);
        
        Felder felder13 = new Felder();
        addObject(felder13,350,250);
        
        Felder felder14 = new Felder();
        addObject(felder14,400,250);
        
        Felder felder15 = new Felder();
        addObject(felder15,450,250);
        
        Felder felder16 = new Felder();
        addObject(felder16,500,250);
        
        Felder felder17 = new Felder();
        addObject(felder17,550,250);
        
        Felder felder18 = new Felder();
        addObject(felder18,600,250);
        
        Felder felder19 = new Felder();
        addObject(felder19,350,300);
        
        Felder felder20 = new Felder();
        addObject(felder20,400,300);
      
        Felder felder21 = new Felder();
        addObject(felder21,450,300);
        
        Felder felder22 = new Felder();
        addObject(felder22,500,300);
        
        Felder felder23 = new Felder();
        addObject(felder23,550,300);
        
        Felder felder24 = new Felder();
        addObject(felder24,600,300);
        
        Felder felder25 = new Felder();
        addObject(felder25,350,350);
        
        Felder felder26 = new Felder();
        addObject(felder26,400,350);
        
        Felder felder27 = new Felder();
        addObject(felder27,450,350);
        
        Felder felder28 = new Felder();
        addObject(felder28,500,350);
        
        Felder felder29 = new Felder();
        addObject(felder29,550,350);
        
        Felder felder30 = new Felder();
        addObject(felder30,600,350);
        
        Felder felder31 = new Felder();
        addObject(felder31,350,400);
        
        Felder felder32 = new Felder();
        addObject(felder32,400,400);
        
        Felder felder33 = new Felder();
        addObject(felder33,450,400);
        
        Felder felder34 = new Felder();
        addObject(felder34,500,400);
        
        Felder felder35 = new Felder();
        addObject(felder35,550,400);
        
        Felder felder36 = new Felder();
        addObject(felder36,600,400);
    }
    */
}
