## Informatikprojekt: Wap Bap 2

### Einführung <a name="1"></a>
Dies ist die Projektseite zu "Wap Bap 2", erstellt von Lotta L. und Felix Herrmann im Rahmen des Informatikunterrichts. Bei "Wap Bap" 2 handelt es sich um eine in Greenfoot erstellte Spielesammlung.


<details>
<summary>Greenfoot</summary>
  
  Bei Greenfoot handelt es sich um eine Objektorientierte  Java-basierte Programmierumgebung (OOP) speziell für Schüler/ zu Ausbildungszwecken. Der Vorteil an Greenfoot besteht darin, dass der Code für Anfänger durch farbliche Hervorhebung der Syntax, sowie Unterteilung des Codes in Actor und Klassen eine bessere Übersicht für Programmiereinsteiger geschaffen wird. Zahlreiche kostenlos von den Entwicklern "King's College London" und "Oracle" zur Verfügung gestellte Lektionen sollen außerdem den Einstieg in die Programmiersprache Java vereinfachen. Die Möglichkeiten "höher" zu programmieren, sind dank der Java-Basierung trotzdem gegeben, weshalb Greenfoot als Umgebung auch für etwas fortgeschrittene Informatikschüler-/ studenten reizvoll sein kann.
  
  </details>

### Übersicht:

 ####  1. [Einführung](#1)
 ####  2. [Idee](#idee)
 ####  3. [Code](#code)
 #####  3.1 [MyWorld](#myworld)
 #####  3.2 
 ####  4. [Entwicklung](#entwicklung)
 #### 5. [Ziele](#ziele)


### Idee <a name="idee"></a> 
Die Idee für die Spielesammlung war, die Greenfoot und Java- Kenntnisse, die wir uns in unserem ersten Informatikprojekt 
["Fischi von Kla"](https://github.com/feta-herrner/Fischi-von-Kla/?target=_blank) angeeignet hatten anzuwenden, um ein größeres, komplexeres Projekt in Greenfoot zu gestalten. Während wir mit "Fischi von Kla" relativ erfolgreich, ein einzelnes, für sich stehendes Spiel programmiert hatten, wollten wir mit "Wap Bap 2 den nächsten Schritt gehen, indem wir eine ganze Sammlung an Spielen schreiben. Begonnen haben wir mit "vier gewinnt" oder "vier in einer Reihe" und der generellen Umgebung zur Spielauswahl- und pausierung, um diese nach und nach um weitere Spiele erweitern zu können...

Später kam uns auch die Idee, unser bereits existierendes Spiel "Fischi von Kla" in leicht verbesserter und erweiterter Form in die Spielesammlung als "Einzelspiel" zu integrieren. Ein Spiel aus einer anderen Greenfoot "Umgebung" in unsere Spielesammlung zu übernehmen stellte sich für uns aber mit steigendem Wissensstand als komplizierter heraus, als gedacht. Wir hätten dafür den Code von Fischi komplett überarbeiten müssen, dazu kam, dass Fischi als unser erstes Java/ Greenfoot- Projekt noch sehr unaufgeräumt und einfach "drauf los" programmiert war, weshalb wir mit der Zeit Abstand von der Idee genommen haben, unseren alten Code "1 on 1" mit einzukopieren. Weil wir aber wissen, wie sehr unsere Fans ihren Fischi lieben, spielen wir mit dem Gedanken, Fischi in optimierter Form und vielleicht auch dem einen oder anderen neuen Feature zurückzubringen und in unsere Spielesammlung zu integrieren. 

### Texturen
- arbeit uin gimp, viele texturen komplett alleine erstellt.
### Code


#### MyWorld
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
        //Spielauswahl Spielauswahl = new Spielauswahl();
        //addObject(Spielauswahl,150,250);
        Spielesammlung () ;
    }
```
Den prepare-Befehl, den Greenfoot standardmäßig in allen Welten einbaut, haben wir um die "Spielesammlung" Methode ergänzt, welche mithilfe eines "(for)-loops" mit einem integer und zwei kleinen Berechnungen Objekte setzt, die die jeweiligen Spiele starten, wenn man sie anklickt. Die Objekte gehören zur gleichen Klasse, setzen ihr Bild aber unterschiedlich, je nachdem um welches integer "s" es sich handelt. 
```java
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
```
Im Spiel sieht das dann so aus:

<img src="https://user-images.githubusercontent.com/54102146/79452158-fc94bb00-7fe7-11ea-9a28-eb4b3f1da43a.png" width="350">

Wenn man das entsprechende Spiel dann anklickt, berechnet das Objekt über seine Koordinate, um welches Spiel es sich handelt und startet dieses. (siehe [Spielauswahl](#spielauswahl).)

##### startgame <a name=startgame></a>
bei der "startgame"-method handelt es sich um eine Methode, die je nach "gamenumber", eine integer variable, die vom aufrufenden objekt "mitgeschickt" wird, den [constructor für das ensprechende Spiel](#Spiele) ausführt.
```java
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
```

#### Spielauswahl <a name="spielauswahl"></a>
Die Spielauswahl- Objekte befinden sich beim Starten der Spielesammlung in der [MyWorld](#myWorld). Ihre act-Method ist relativ simpel gehalten. Klickt man ein "Spielauswahl" - Objekt an, berechnet es über seine Koordiante, um welches spiel es sich handelt, um dann die [Welt.startgame](#startgame)-methode mit der entsprechenden Nummer aufzurufen.

<img src="https://user-images.githubusercontent.com/54102146/79453170-96a93300-7fe9-11ea-8b42-ac19a8d2e242.png" width="300">

#### Spiele <a name="spiele"></a>

### Entwicklung
Unser Spielesammlung "Wap Bap" hat in ihrem knappen halben Jahr, die sie nun in der Entwicklungen viele Stadien durchlaufen, von denen wir in diesem alpha-release noch Fragmente auskommentiert im Code gelassen haben, welche bei der Endveröffentlichung entfernt werden werden. So wurde ursprünglich beispielsweise jedes Feld im "vier gewinnt"-Spiel als einzelne Subklasse generiert, was sehr viel Spaghetti-code nach sich zog. Das besondere an diesem Projekt war, dass wir als Entwickler auf der Reise sehr viel von, aber auch um und über unser Spiel, sowie Greenfoot als Programmierumgebung gelernt haben, was dazu geführt hat, dass wir unserem Code immer wieder optimiert, verändert und teilweise komplett "from scratch" neu geschrieben haben. Das führt dazu, dass das Spiel in dieser Alpha nur noch wenig mit dem ersten spielbaren Projekt zu tun hat, was uns aber auch stolz macht, weil es uns zeigt, dass wir an diesem Projekt als "Programmierer" wirklich gewachsen sind und dazu gelernt haben.

Hier ein Beispiel, wie unser "Felderbauen" aussah, bevor wir es optimiert haben:

 <img src="https://user-images.githubusercontent.com/54102146/79448691-29de6a80-7fe2-11ea-8c75-dba4ea3f59d4.png" width="300">
optimiert sah das ganze dann so aus, mit den gleichen Eigenschaften im Spiel selbst.

 <img src="https://user-images.githubusercontent.com/54102146/79449223-21d2fa80-7fe3-11ea-946b-65d36c7c0184.png" width="300">

### Ziele
- weitere Spiele hobbymäßig hinzufügen.
- port auf eine andere "Plattform"/ einen anderen compiler?

####
