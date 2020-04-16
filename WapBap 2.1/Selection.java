import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Selection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Selection extends MyWorld
{
    private String[] Spielbilder = {"tictactau.png", "emptyGame.png","emptyGame.png","emptyGame.png","emptyGame.png","emptyGame.png",
        "emptyGame.png","emptyGame.png"} ;
    private String[] Spiele = {"tictactau", "emptyGame","emptyGame","emptyGame","emptyGame","emptyGame",
        "emptyGame","emptyGame"} ;
    
    /**
     * Constructor for objects of class Selection.
     * 
     */
    public Selection()
    {
        super();
        prepare();
    }
    
    private void prepare()
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
}
