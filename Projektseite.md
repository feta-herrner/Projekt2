# Informatikprojekt: Wap Bap 2

## Einführung <a name="1"></a>
Dies ist die Projektseite zu "Wap Bap 2", erstellt von Lotta L. und Felix Herrmann im Rahmen des Informatikunterrichts. Bei "Wap Bap" 2 handelt es sich um eine in Greenfoot erstellte Spielesammlung.


<details>
<summary>Greenfoot</summary>
  
  Bei Greenfoot handelt es sich um eine Objektorientierte  Java-basierte Programmierumgebung (OOP) speziell für Schüler/ zu Ausbildungszwecken. Der Vorteil an Greenfoot besteht darin, dass der Code für Anfänger durch farbliche Hervorhebung der Syntax, sowie Unterteilung des Codes in Actor und Klassen eine bessere Übersicht für Programmiereinsteiger geschaffen wird. Zahlreiche kostenlos von den Entwicklern "King's College London" und "Oracle" zur Verfügung gestellte Lektionen sollen außerdem den Einstieg in die Programmiersprache Java vereinfachen. Die Möglichkeiten "höher" zu programmieren, sind dank der Java-Basierung trotzdem gegeben, weshalb Greenfoot als Umgebung auch für etwas fortgeschrittene Informatikschüler-/ studenten reizvoll sein kann.
  
  </details>

## Übersicht:

 ### 1. [Einführung](#1)
 ###  2. [Idee](#idee)
 #### 3. [Code](#code)
 ####  3.1 [MyWorld](#myworld)
 ####  3.2 
 ###  4. [Entwicklung](#entwicklung)
 ### 5. [Ziele](#ziele)


## Idee <a name="idee"></a> 
Die Idee für die Spielesammlung war, die Greenfoot und Java- Kenntnisse, die wir uns in unserem ersten Informatikprojekt 
["Fischi von Kla"](https://github.com/feta-herrner/Fischi-von-Kla/?target=_blank) angeeignet hatten anzuwenden, um ein größeres, komplexeres Projekt in Greenfoot zu gestalten. Während wir mit "Fischi von Kla" relativ erfolgreich, ein einzelnes, für sich stehendes Spiel programmiert hatten, wollten wir mit "Wap Bap 2 den nächsten Schritt gehen, indem wir eine ganze Sammlung an Spielen schreiben. Begonnen haben wir mit "vier gewinnt" oder "vier in einer Reihe" und der generellen Umgebung zur Spielauswahl- und pausierung, um diese nach und nach um weitere Spiele erweitern zu können...

Später kam uns auch die Idee, unser bereits existierendes Spiel "Fischi von Kla" in leicht verbesserter und erweiterter Form in die Spielesammlung als "Einzelspiel" zu integrieren. Ein Spiel aus einer anderen Greenfoot "Umgebung" in unsere Spielesammlung zu übernehmen stellte sich für uns aber mit steigendem Wissensstand als komplizierter heraus, als gedacht. Wir hätten dafür den Code von Fischi komplett überarbeiten müssen, dazu kam, dass Fischi als unser erstes Java/ Greenfoot- Projekt noch sehr unaufgeräumt und einfach "drauf los" programmiert war, weshalb wir mit der Zeit Abstand von der Idee genommen haben, unseren alten Code "1 on 1" mit einzukopieren. Weil wir aber wissen, wie sehr unsere Fans ihren Fischi lieben, spielen wir mit dem Gedanken, Fischi in optimierter Form und vielleicht auch dem einen oder anderen neuen Feature zurückzubringen und in unsere Spielesammlung zu integrieren. 

## Texturen
- arbeit uin gimp, viele texturen komplett alleine erstellt.
## Code


### MyWorld
Die Welt (in unserem Falle default "myWorld") ist in Greenfoot der Grundbaustein, auf dem das Programm aufbaut. In ihr bewegen sich die Objekte und "acten". Jedes Objekt wird im constructor durch die "prepare" methode dort mit einer Koordinate platziert, um dann in Dauerschleife seine "act" methode asuzuführen. Es kann mehrere Welten geben, MyWorld ist in unserem Projekt die Standardwelt, deren constructor durch das klicken von "run" aufgerufen wird.

```java
public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
```
(constructor)

```java
private void prepare() {
        //Spielauswahl Spielauswahl = new Spielauswahl();
        //addObject(Spielauswahl,150,250);
        Spielesammlung () ;
    }
```
(prepare-command)
```java
private void prepare() { 
        startgame();
    }
```
Den prepare-Befehl, den Greenfoot standardmäßig in allen Welten einbaut, haben wir um die "startgame" Methode ergänzt, welche nun in allen "MyWorlds" grundsätzlich mit dem constructor ausgeführt wird. Die "startgame" befehle sind aber je nach Spiel unterschiedlich, weshalb es uns logisch erschien, diese in die ensprechenden Subklassen auszulagern...
Mehr dazu unter [Subwelten](#subwelten)


#### reset
Die "reset" Methode wird von einer der ["Spielewelten"](#Spielewelten) aufgerufen, wenn ein Spiel beendet wurde. Sie setzt die aktuelle Welt auf die [Spielauswahl-welt("selection")](#selection) zurück.
```java
public void reset () //done
    {
        Greenfoot.setWorld(new Selection());
    }
```

#### pause & resume <a name="pause"></a>
pause und resume sind Befehle, die von Objekten der [pause & resume](#p&r) Klassen aufgerufen werden können. Der pause-Befehl fügt dem laufenden Spiel ein "pause" und ein "resume" Objekt hinzu, welche die anderen Objekte überdecken und dafür sorgen, dass mit diesen erst wieder interagiert werden kann, wenn sie entfernt wurden.
Im Code:
```java
public void pause ()
    {
        pausiert pausiert = new pausiert();
        addObject(pausiert,500,300);
        resume resume = new resume();
        addObject(resume,500,350);
    }
```

Im Spiel:

<img src="https://user-images.githubusercontent.com/54102146/79461698-cd397a80-7ff6-11ea-9875-502d590c1c0d.png" width="200">

der resume befehl entfernt die betreffenden Objekte wieder: <a name="resume"></a>
```java
public void resume ()
    {
        removeObjects(getObjects(pausiert.class));
        removeObjects(getObjects(resume.class));
    }
```

#### Subwelten <a name="subwelten"></a>
Um den MyWorld-Code etwas aufzuräumen (für interessierte ist der "unordentliche" code unter /code(alt) bei github zu finden), haben wir entschlossen, "subwelten" zur MyWorld für die entsprecheden Spiele einzubauen. Diese subwelten erben alle Eigenschaften und Befehle der myWorld, können aber durch eigene, Spielspezifische Methoden ergänzt werden, was sie zum "aufräumen/ trennen" von Befehlen sehr nützlich macht.

##### Selection <a name="selection"></a>
Selection ist die erste und vielleicht wichtigste subwelt, um die wir uns gekümmert haben. Es handelt sich dabei um die "Standardwelt", die aufgerufen wird, wenn man das Spiel öffnet, oder das Spiel zurückgesetzt wird/ beendet wird.
Ihr Constructor ruft ihre "prepare" Methode auf,
```java
public Selection()
    {
        super();
        prepare();
    }
```
welche mithilfe eines "for-loops" die [Spielauswahl](#spielauswahl)-Objekte platziert:
```java
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
```
Dabei berechnet "Math.ceil" die reihe für gegebenes int zwischen 0 und 8, also eins oder zwei,
```java
int reihe = (int)Math.ceil(s/4) ;
```
und 
"%" die spalte, also 1,2,3 oder 4.

##### FourWins
Die nächste wichtige Welt ist die FourWins Welt für unser vier gewinnt Spiel. Ihr constructor ist leer.
Ihre Variabeln sind:
```java
    public int[] Feldstatus;
```

###### startgame
die "startgame" Methode wird bei allen myworlds standardmäßig durch den "geerbten" constructor aufgerufen. Sie entfernt bei FourWins zuerst alle vorhandenen Objekte, um eine "saubere" oberfläche zu schaffen.
dann ruft sie die FourWins Methoden ["startstop"](#startstop) und ["felderbauen"](#felderbauen) ab. 
```java
public void startgame() //done
    {
        setBackground(new GreenfootImage("viergewinntBackground.png"));
        List Spiele = getObjects(null);
        removeObjects(Spiele);
        startstop ();
        felderbauen();
    }
```

###### startstop <a name="startstop></a>
startstop ist eine kurze Methode, die die ["pause"](#p&r) ["stop"](#resum) Methoden/Klassen "aktiviert", indem sie die entsprechenden Klassen platziert.
```java
private void startstop () //done
    {
      stop stop = new stop();
      addObject(stop,30,30);
      pause pause = new pause();
      addObject(pause, 65,30);
    }
```

###### felderbauen <a name="felderbauen"></a>
Die "Felderbauen" Methode "baut" nach dem Prinzip, das wir schon von der [selection](#selection) kennen (Zeile und Spalte) die ["Felder"](#Felder), in denen [Kreis](#Kreis) und [Kreuz](#Kreuz) platziert werden.  
```java
private void felderbauen () //done
    {
        Feldstatus = new int[36];
        for ( int r=0; r<36; r++) {
            int reihe = (int)Math.ceil(r/6);
            int spalte = r%6 ;
            Feldstatus [r] = 0 ;
            Feld Feld = new Feld() ;
            addObject (Feld,350+spalte*50, 150+reihe*50) ;
        }
```
Außerdem wird für jedes Feld der entsprechende Wert im "Feldstatus"-Array auf 0 gesetzt, was später beim Abfragen des Gewinners sehr wichtig wird.

###### checkWin <a name="checkWin"></a>
der "checkwin" Befehl ist nur ein zwischenschritt, um den "checkall" befehl durchführen zu können.
Er verlangt eine feldnummer, die er von irgendeinem anderen actor oder von sich selbst in einer anderen methode "mitgeschickt" bekommt, wenn die checkWin Methode aufgerufen wird. 
Wird die Methode aufgerufen, überprüft checkWin den Wert des Arrays "Feldstatus" für die gegebene "feldnummer". Genau wie die Feldnummer ist auch der Feldstatus ein integer. 
checkWin setzt also eine Variable Typ und gibt dieser den Wert aus dem Array Feldstatus für entsprechende feldnummer:
```java 
int Typ = Feldstatus[feldnummer] ;
```
danach wird mit den Variablen Typ und Feldnummer der Befehl ["checkall"](#checkall) aufgerufen, welcher überprüfen soll, ob ein Spieler gewonnen hat.

```java
public void checkWin (int feldnummer)
    {
        int Typ = Feldstatus[feldnummer] ;
        //showText("Feld"+feldnummer,100,100) ;
        checkall(Typ,feldnummer) ;
    }
```

###### checkall <a name="checkall"></a>
checkall ist das Herzstück des vierGewinnt Spiels und funktioniert wie folgt:
zunächst werden die integer Variablen,
```java
int gleicheLinks = 0;
        int gleicheRechts = 0;
        int gleicheOben = 0;
        int gleicheUnten = 0;
```
sowie die boolean variablen
```java
boolean keinTrefferLinks = false ;
            boolean keinTrefferRechts = false ;
            boolean keinTrefferOben = false ;
            boolean keinTrefferUnten = false ;
```
eingeführt.
Dann soll "checkall" überprüfen, ob ein Spieler gewonnen hat, was durch ein paar einfache Berechnungen passiert:
Wir haben ja beim platzieren der Felder jedem dieser Felder über das Feldstatus-Array eine Art "Feldstatus" Wert zugewiesen, der default bei 0 liegt. In der [Felder Klasse](#Felder) wird dieser Wert, je nachdem ob ein kreis oder ein Kreuz gesetzt wird, auf 1 oder 2 gesetzt und danach die "checkwin"-Methode mit der EIGENEN Feldnummer des entsprechenden Feldes aufgerufen. Dieser wiederum ruft mit dem Feldtatus (Typ) und der feldnummer als 2 integer variablen die checkall methode auf.
```java
private void checkall (int Typ, int feldnummer)
```
In einer for- schleife wird nun für unterschiedliche "n" werte berechnet, ob in den nachbarfeldern genügend GLEICHE objekte (also kreis oder Kreuz) vorhanden sind, damit ein Spieler gewonnen hat. Da die Berechnungen sehr lang sind und sich von den Befehlen kaum unterscheiden, hier (nur) ein Beispiel, wie überprüft wird, ob die Objekte rechts "gleich" sind. 
(die method ist hier auseinandergenommen, um das erklären übersichtlicher zu machen. Im ganzen zu finden ist sie [hier](#ganzemethod), "..." steht für ausgelassene zeilen.)

```java
for(int n=1; n<5; n++)
        {
            if(Math.ceil(feldnummer/6) == Math.ceil((feldnummer+n)/6))
            ...
            else
            {
                        keinTrefferRechts = true ;
            }
```
zuerst wird der for loop mit werten für n von 1 - 5 gestartet. Die erste if schleife prüft, ob die feldnummer, die den Befehl aufgerufen hat in der gleichen Zeile liegt, wie die feldnummer+n, also plus 1,2,3 usw. ist das der fall, wird eine weitere if schleife ausgeführt. wenn nicht, wird die boolean-abfrage "keinetrefferrechts" auf true gesetzt.

Besagte weitere if schleife überprüft, ob der feldstatus, vom feld rechts, also feldnummer+n auch der gleiche ist, wie Typ, also der gleiche feldtatus, den das aufrufende Feld auch hatte, als wir es mit checkwin abgefragt haben. Wenn ja, dann wird gleicheRechts um 1 erhöht und die schleife gestoppt. Wennn nicht, wird "keinetrefferrechts" auf true gesetzt.
```java
if(Feldstatus[feldnummer+n] == Typ)
                    {
                        gleicheRechts ++ ;
                        if(gleicheRechts + gleicheLinks>=3)
                        {
                            whoWins(Typ) ;
                            break ;
                        }
                    }
```
Außerdem wird noch überprüft, ob gleichelinks und gleiche rechts zusammen größer als 3, also mindestens 4 sind. Denn wenn das zutrifft, hat ein Spieler gewonnen. Es wird dann die [whoWins](#whowins) Methode mit (Typ) als integer abgerufen, die feststellt, welcher Spieler gewonnen hat und dementsrechend eine Aktion ausführt. Weil die berechnungen mathematisch alle sehr ähnlich sind, werden sie hier nicht weiter vertieft. Bei Interesse ist der gesamte Code im master unter "Wap bap 2.1" hinterlegt.


kompletter code(für Berechnung treffer rechts): <a name=ganzemethod></a>
```java
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
```

##### whoWins <a name="whowins"></a>
Whowins berechnet mit einer einfachen Abfrage, ob die zahl des gewinners gerade oder ungerade (also 1 oder 2) ist, um zu prüfen ob "Typ" aus Checkwin für kreise oder kreuze stand und führt entsprechend [KreisWin](#Kreiswin) oder [KreuzWin](#KreuzWin) aus.
```java
private void whoWins(int x) //done
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
```


##### KreisWin / Kreuwin 
kreiwin und Kreuzwin funktionieren sehr ähnlich. Werden sie aufgerufen, entfernen sie alle Objekte in der Welt, setzen den Hintergrund auf ein Bild, welches anzeigt, dass die entsprechende Klasse gewonnnen hat, um dann den ["reset"](#reset) Befehl auszuführen.
```java
public void KroizWin ()
    {
       Greenfoot.delay(10) ;
        List Alles = getObjects(null);
       removeObjects(Alles); 
       setBackground("XWINS.png") ;
       Greenfoot.delay(500) ;
       reset () ;
    }
    
    public void KriasWin()
    {
       Greenfoot.delay(10);
       List Alles = getObjects(null);
       removeObjects(Alles); 
       setBackground("OWINS.png") ;
       Greenfoot.delay(500) ;
       reset () ;
    }
```
#### placeholder
placeholder ist eine "lückenfüller" Welt für die Spiele, die noch nicht programmiert wurden. Wird sie von der Spielauswahl aufgerufen, führt sie genau wie die anderen Spielewelten den "startgame" befehl aus, dieser besteht aber daraus, den Spieler darauf zu verweisen, dass das Spiel noch nicht programmiert wurde. Klickt der Spieler mit der Maus, gelangt er ins Startmenü zurück, die reset() methode aus MyWorld wird dann nämlich aufgerufen.
```java
public void startgame()
    {
        setBackground(new GreenfootImage("einfachRot.png"));
        showText("Sorry, dieses Spiel wurde noch nicht programmiert... :(",500,320);
        showText("Klicke, um wieder ins Menü zu gelangen",500,400);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            reset();
        }
    }
```


### Feld <a name=Felder"></a>
  Feld ist die "Spielfeldklasse von viergewinnt. Sie wird von der ["felderbauen"](#felderbauen) Methode in der ["selection"](#selection) Subwelt platziert.
Variabeln:
### Kreuz

### Spielauswahl <a name="spielauswahl"></a>
Die Spielauswahl- Objekte befinden sich beim Starten der Spielesammlung in der [MyWorld](#myWorld). Ihre act-Method ist relativ simpel gehalten. Klickt man ein "Spielauswahl" - Objekt an, berechnet es über seine Koordiante, um welches spiel es sich handelt, um dann die Welt(#subwelten) für das entsprechende Spiel zu setzen.
```java
public void act() 
    {
        
        if(Greenfoot.mouseClicked(this)) 
        {
            int x = (getX() -200) / 200;
            int y = (getY() -250) / 200;
            int nr = (x+4*y);

            MyWorld Welt = null;
            switch(nr)
            {
                case 0:
                    Welt = new FourWins();
                    break;
                case 1:
                    Welt = new Placeholder();
                    break;
                case 2:
                    Welt = new Placeholder();
                    break;
                case 3:
                    Welt = new Placeholder();
                    break;
                case 4:
                    Welt = new Placeholder();
                    break;
                case 5:
                    Welt = new Placeholder();
                    break;
                case 6:
                    Welt = new Placeholder();
                    break;
                case 7:
                    Welt = new Placeholder();
                    break;
                case 8:
                    Welt = new Placeholder();
                    break;
            }
            Greenfoot.setWorld(Welt);
        }
    } 
```
Der constructor der Spielauswahl beschränkt sich darauf, ihr Bild zu skalieren:
```java
public Spielauswahl(GreenfootImage image, String name)
    {
        Name = name;
        image.scale(image.getWidth() -530, image.getHeight() -530) ;
        setImage (image);
    }
```

### pause <a name=p&r></a>
"pause" ist eine relativ simple klasse, die dem Spieler die Möglichkeit geben soll, das laufende Spiel zu pausieren. Ihr constructor ist nur für die skalierung des Bildes zuständig, bei welchem es sich klassisch um eine Art "stop" zeichen handelt. Dieses haben wir selsbt in Gimp erstellt.
```java
public pause () 
        {
            GreenfootImage image = getImage () ;
            image.scale(image.getWidth() -13, image.getHeight() -30) ;
            setImage (image) ;
        }
```
so sieht es dann aus:

<img src="https://user-images.githubusercontent.com/54102146/79462290-9021b800-7ff7-11ea-9ba9-9aa8e9565b90.png" width="200">

Der key zur pause Klasse liegt aber in ihrer act methode, welche in der MyWorld nämlich die ["pause"](#pause) methode ausführt, wenn sie angeklickt wird:
```java
public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            ((MyWorld)getWorld()).pause() ;
        }
```
### resume <a name="resum"></a>
resume verhält sich als klasse sehr ähnlich der "pause" klasse. Wird sie angeklickt, führt sie in der MyWorld die ["resume"](#resume) methode aus.

### stop

## Entwicklung
Unser Spielesammlung "Wap Bap" hat in ihrem knappen halben Jahr, die sie nun in der Entwicklungen viele Stadien durchlaufen, von denen wir in diesem alpha-release noch Fragmente auskommentiert im Code gelassen haben, welche bei der Endveröffentlichung entfernt werden werden. So wurde ursprünglich beispielsweise jedes Feld im "vier gewinnt"-Spiel als einzelne Subklasse generiert, was sehr viel Spaghetti-code nach sich zog. Das besondere an diesem Projekt war, dass wir als Entwickler auf der Reise sehr viel von, aber auch um und über unser Spiel, sowie Greenfoot als Programmierumgebung gelernt haben, was dazu geführt hat, dass wir unserem Code immer wieder optimiert, verändert und teilweise komplett "from scratch" neu geschrieben haben. Das führt dazu, dass das Spiel in dieser Alpha nur noch wenig mit dem ersten spielbaren Projekt zu tun hat, was uns aber auch stolz macht, weil es uns zeigt, dass wir an diesem Projekt als "Programmierer" wirklich gewachsen sind und dazu gelernt haben.

Hier ein Beispiel, wie unser "Felderbauen" aussah, bevor wir es optimiert haben:

 <img src="https://user-images.githubusercontent.com/54102146/79448691-29de6a80-7fe2-11ea-8c75-dba4ea3f59d4.png" width="300">
optimiert sah das ganze dann so aus, mit den gleichen Eigenschaften im Spiel selbst.

 <img src="https://user-images.githubusercontent.com/54102146/79449223-21d2fa80-7fe3-11ea-946b-65d36c7c0184.png" width="300">

## Ziele
- weitere Spiele hobbymäßig hinzufügen.
- port auf eine andere "Plattform"/ einen anderen compiler?

###
