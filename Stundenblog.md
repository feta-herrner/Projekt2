# Projekt2: Stundenblog

### Übersicht

  
  <details>
  <summary>Dezember</summary>
  
##### [10.12.19](#10.12)
##### [11.12.19](#11.12)
##### [12.12.19](#12.12)
##### [17.12.19](#17.12)
##### [18.12.19](#18.12)
##### [19.12.19](#19.12)

  </details>
  
  <details>
  <summary>Januar</summary>
  
##### [14.01.20](#14.01)  
##### [15.01.20](#15.01)  
##### [21.01.20](#21.01)
##### [23.01.20](#23.01)
##### [28.01.20](#28.01)
  
</details>

<details>
  <summary>Februar</summary>
    
##### [05.02.20](#05.02)  
##### [06.02.20](#06.02)
##### [12.02.20](#12.02)
##### [13.02.20](#13.02)
##### [14.02.20](#14.02)
##### [19.02.20](#19.02)
##### [20.02.20](#20.02)
##### [21.02.20](#21.02)
##### [26.02.20](#26.02)
##### [27.02.20](#27.02) 
 
</details>

  <details>
  <summary>März</summary>
  
##### [11.03.20](#11.03)
##### [13.03.20](#13.03)
##### [19.03.20](#19.03)
  
</details>
  
#### 10. Dezember<a name="10.12"></a>
Die Abgabe des Fischi Projekts ist schon einen Monat her. Schweren Herzens haben wir nun beschlossen, die Zeiten mit Fischi, so schön sie auch waren, hinter uns zu lassen und uns auf ein neues Abenteuer in Greenfoot zu begeben. Unser "Spaghetti-Code" in Fischi hat uns teilweise zu schaffen gemacht, weshalb wir beschlossen haben, zu versuchen, dieses mal von Grund auf strukturierter vorzugehen.
Zuallererst musste natürlich erstmal eine Idee für ein neues Projekt her. Ein Spiel haben wir ja schon mit einigem Erfolg programmiert, weshalb sich augenscheinlich nun zwei Wege für uns darboten:
Unser angeeignetes Wissen über diese Art Spiel nutzen, um ein ähnliches/ fortgschritteneres Spiel zu erschaffen oder ein anderes Projekt in Greenfoot umsetzen.

Da wir uns in Greenfoot gut eingelebt haben, wollten wir diese Plattform aber zunächst eher ungern wieder verlassen.
Diese schwere Entscheidung haben wir uns zusammen mit ein paar gänzlich anderen Ideen (wie zum Beipsiel auch wieder Arduino, auch wenn wir vor diesem nach unserer ersten Erfahrung noch Respekt haben...) und auch "Snap!" mit nach Hause genommen. 
Außerdem haben wir uns heute im Laufe der Stunde ein wenig im Unterrichtsraum umgesehen. Wir holten uns Meinungen unserer Mitschüler bezüglich ihrer Erfahrungen. Die Projekte wurden uns bereits einige Wochen vorher vorgestellt.


#### 11. Dezember <a name="11.12"></a>
Heute haben wir mit unserem neuen Greenfoot Projekt begonnen. Da wir im letzten Alauf zum Ende hin etwas unter Zeitdruck geraten sind, haben wir uns vorgenommen, die gleichen Fehler dieses Mal nicht zu machen und von Anfang an mit etwas mehr Biss an unser Projekt ranzugehen.
Zuallererst haben wir für unser neues Spiel dessen Welt "MyWorld" im Konstruktor auf eine neue Größe skaliert. Wir haben für Breite und Höhe die Parameter `1000 für x und 750 für y` gewählt, die sich im letzten Projekt schon als annehmbar/sinvoll bewiesen haben. 
Unsere Idee für ein neues Spiel war, eine Art "Weltraum-Shooter" zu bauen, in dem der Spieler gegen gefährlicher werdende Raumschiffe ankämpfen muss. 
Wir haben begonnen, indem wir die "Mutterklasse" Flugobjekte für alle Raumschiffe erstellt haben. Im letzten Projekt mit Greenfoot haben wir am eigenen Leibe erfahren, wie nützlich es sein kann, Befehle, die Akteure sich teilen, in einer gemeinsamen Mutterklasse zu definieren, um sich Arbeit und Sorgen zu ersparen.
Wir haben dann die `CheckKeys()` Methode für diese Mutterklasse eingeführt, welche es alles Akteuren dieser Klasse ermöglicht, sich mit den Pfeiltasten zu bewegen, wenn sie abgerufen wird. Außerdem haben wir die Java utility und Array Listen importiert, um uns das Programmieren zu vereinfachen.
Danach haben wir für unser Raumschiff noch ein Bild aus dem Internet ausgewählt, in Photoshop die Ränder von diesem entfernt und es als Bild für unser Raumschiff gesetzt, welches wir zu Ehren unseres alten Freundes "Fischi von Klå" Schifi getauft haben.
Das Ausschneiden ist ziemlich anstrengende Kleinstarbeit, die unser Photoshop-Experte Felix Zuhause pflichtbewusst beendet hat ;).

<img src="https://user-images.githubusercontent.com/54102146/68995786-c7960800-0891-11ea-8c69-c4c5350d9af4.png" width="48">


#### 12. Dezember <a name="12.12"></a>
Heute haben wir zu Beginn der Stunde erstmal ein paar Minütchen rumgesucht, wie man in Github Bilder skaliert. Das hatten wir schon beim letzten Projekt versucht, waren dann aber gescheitert und haben uns das Problem aus Zeitgründen für später aufgehoben. Die Lösung war dann relativ einfach und bestand bei uns darin, HTML-Code zu verwenden, in welchem man die Weite ganz einfach nach dem Bild mit dem "width" Anhang auswählen kann.
Unser Schifi war bisher etwas groß (siehe unten), weshalb wir es mit einer Zeile Code, die wir schon aus dem letzten Projekt kannten in seinem Konstruktor auf die richtige Größe skalieren lassen.

<img width="370" alt="Bildschirmfoto 2019-11-16 um 17 11 38" src="https://user-images.githubusercontent.com/54102146/68995972-32e0d980-0894-11ea-88eb-9a9f9a3fc2c9.png"> <img width="370" alt="Bildschirmfoto 2019-11-16 um 17 15 41" src="https://user-images.githubusercontent.com/54102146/68996017-c61a0f00-0894-11ea-8a8c-baa379d7cd78.png">

Als nächstes wollten wir für unser Schifi eine "schießen" Methode programmieren. Damit überhaupt etwas geschossen werden kann, haben wir eine "SchnellfeuerKugel"-Klasse erstellt. Als Bild haben wir einen schlichten roten Kreis genommen, den wir, wie auch das Raumschiff, in seinem Konstruktor skalieren lassen. 
Diese Kugel soll nun vom Schifi-Raumschiff geschossen werden. Wir haben das so umgesetzt, dass immer, wenn die Leertaste gedrückt wird, in der "Act" Methode des Schifis eine neue Kugel mit der Position des Schifis erstellt wird. Diese Kugel bewegt sich wiederum in ihrer "Act" Methode in Schussrichtung.

![DASHIER](https://user-images.githubusercontent.com/54102146/68996456-979f3280-089a-11ea-9df7-7f7b6340b68a.png)

Wie hier zu sehen, erscheinen die Kugeln jetzt sehr schnell nacheinander, was wir mit einer If Schleife angepasst haben, die einen kleinen cooldown hinzufügt. Das Prinzip solcher "If" Schleifen war uns noch gut aus unserem [ersten Projekt](https://github.com/feta-herrner/Fischi-von-Kla) geläufig.

<img width="500" alt="Bildschirmfoto 2019-11-16 um 18 03 00" src="https://user-images.githubusercontent.com/54102146/68996515-78ed6b80-089b-11ea-9277-0a1a29d91897.png">

Durch Änderung der "shootingCooldown" Variable können wir auch die Schussgeschwindigkeit anpassen.
Wie im Bild oben zu sehen, bestand außerdem das Problem, dass die Projektile an der oberen Grenze der Welt "hängen" bleiben. Diesem Fehler wollen wir in der nächsten Informatikstunde nachgehen.


#### 17. Dezember <a name="17.12"></a>
Am heutigen Tage ist der Informatikunterricht leider ausgefallen :(


#### 18. Dezember <a name="18.12"></a>
Aufgrund dessen, dass Max ein ähnliches Projekt im vergangenen Halbjahr gemacht hat, haben wir nun beschlossen, wie beim letzten Mal, unser Projekt zu verwerfen und ein neues zu beginnen. Natürlich werden wir fortlaufend mit Greenfoot arbeiten. 


#### 19. Dezember <a name="19.12"></a>
Da Felix heute leider krank war, habe ich alleine angefangen, nach neuen Projektideen zu suchen. Ein Vorschlag aus der letzten Stunde war, ein Schiife-versenken-Spiel mit Greenfoot zu entwerfen. Da dieses Spiel sehr populär ist, habe ich zuerst im Internet nach bereits vorliegenden Codes gesucht. In den Weihnachtsferien werden wir dann spezifischere Schritte vornehmen.

https://www.java-forum.org/thema/grundgeruest-fuer-schiffe-versenken.13498/

https://unterrichten.zum.de/wiki/Java/Schiffeversenken

#### 14. Januar <a name="14.01"></a>
Leider konnten wir beide heute nicht am Informatikunterricht teilnehmen, weil wir aufgrund der Schulrunde von "Jugend debattiert" verhindert waren.

#### 15. Januar <a name="15.01"></a>
Überraschenderweise haben wir unsere Projektidee noch nicht über den Haufen geworfen!
Allerdings haben wir sie etwas erweitert: Je nach dem, wie es die Zeit ermöglicht, möchten wir mehrere Minispiele für 2 Personen erstellen. Diese hat man im Überblick auf einer Seite und kann dann eines auswählen, das man spielen möchte. Nach Abschluss kommt man dann wieder auf die Übersicht. 
Aus dem Gespräch mit Herrn Buhl hat sich die Struktur der Spiele ergeben; wir werden uns nun mehr auf die Objektklassen konzentrieren und nicht auf die einzelnen Actors. Dazu ziehen wir das Buch "Einführung in Java mit Greenfoot" zu Hilfe.


#### 21. Januar <a name="21.01"></a>
Am heutigen Tage war die gesamte Klasse 12g im DESY in Hamburg. Da Teilchenbeschleunigung zwar ein sehr spannender Bereich der Physik ist, der Ausflug allerdings nicht optimal bezüglich der neuen Kenntnisgewinnung gestaltet war, mussten wir den Infounterricht schmerzlich vermissen.



#### 23. Januar <a name="23.01"></a>
Um ein Grundgerüst für unser erstes Spiel "4 gewinnt" zu errichten, haben wir MyWorld so programmiert, dass zu Beginn 6x6 leere Felder erscheinen. Diese haben wir selbst mit Gimp erstellt. 

![Spielfeld4](https://user-images.githubusercontent.com/54102146/72970640-5cecd580-3dc8-11ea-9152-ad435fcb31c0.PNG)

####  28. Januar <a name="28.01"></a>
Natürlich brauchen wir auch Spieler, die wir in einer Actorklasse definiert haben. Als Bild setzten wir ein mal einen blauen Kreis ein, den wir bei Gimp ausgeschnitten haben, und für den anderen ein grünes Kreuz.
Dies hat uns leider mehr Zeit als erwartet gekostet, doch am Ende haben wir 2 sehr schöne Ergebnisse erhalten.

<img src="https://user-images.githubusercontent.com/54102146/77445539-838db380-6ded-11ea-8908-23b7557d7fc1.png" width="48"><img src="https://user-images.githubusercontent.com/54102146/77445554-87213a80-6ded-11ea-8654-1622b2f5ba9f.png" width="68">



####  05. Februar <a name="05.02"></a>
Damit die beiden immer abwechselnd am Zuge sind, setzten wir einen Counter ein, der die Spielzüge zählt. Die geraden Zahlen stehen für den blauen Kreis und die ungeraden für das grüne Kreuz.
Erst hatten wir ein paar Probleme. Der Counter wurde nicht erhöht, was dazu führte, dass immer nur der blaue Kreis seinen Zug setzen durfte. Die Problematik lag darin, dass wir in der World die Felder alle einzeln definiert haben, weshalb der Counter sich nur auf je ein Feld bezog und darum nicht funktioniert hat. 
Herr Buhl konnte uns glücklicherweise weiterhelfen. Nach langem Suchen konnte er uns erklären, dass wir die Variable, welche die Spielzüge zählt als "static" definieren müssen, damit nicht jedes Feld seine eigene "Spielzüge" variable erhöht, wenn ein Kreis oder Kreuz hineingesetzt wird...
Im Endeffekt also viel Stress um wenig Inhalt, aber so ist das bei der Fehlersuche ja oft beim Programmieren.

<img src="https://user-images.githubusercontent.com/54102146/77447936-88a03200-6df0-11ea-9b51-e9597c5161ce.png" width="80">


####  06. Februar <a name="06.02"></a>
Am heutigen Tage haben wir etwas an der Optik gepfeilt. Den Hintergund haben wir vorher in der TicTacToe-Klasse definiert, also erschien er, wenn das Spiel ausgewählt wurde. Da das Erscheinen bzw. Bauen der Felder bei uns in der World war, mussten wir dies ändern. 
Kurz: jetzt wird der neue Hintergrund hervorgerufen sobald TicTacToe in der Spielesammlung angeklickt wird. Gleichzeitig verschwindet das kleine TictacToe-Feld. Damit wir aber eine Liste von allen existierenden "Spielauswahlfeldern" esrstellen konnten, mussten wir in der Welt noch eine Java Bibliothek importieren. Das herauszufinden hat zwar etwas gedauert, sich dafür dann aber umso besser angefühlt, als alles funktioneirt hat.



####  12. Februar <a name="12.02"></a>
Damit man das ausgewählte Spiel frühzeitig abbrechen kann, haben wir nun ein weißes "x" eingefügt. Im Code ist es als Stop, als eigener Actor, definiert, der durch das Anklicken auf einen Befehl, "reset", in der World zugreift.  Dadurch werden alle Objekte aus der Welt entfernt und automatisch der "prepare" Befehl ausgeführt, der den Hintergund und die Spielesammlung wiederherstellt. Ziemlich tricky oder? ;)

<img width="400" alt="Bildschirmfoto 2020-03-24 um 19 59 33" src="https://user-images.githubusercontent.com/54102146/77466138-205e4a00-6e0a-11ea-9665-795756e6ff2d.png">
<img width="400" alt="Bildschirmfoto 2020-03-24 um 20 00 03" src="https://user-images.githubusercontent.com/54102146/77466143-20f6e080-6e0a-11ea-9d63-3aa2504dab2c.png">

####  13. Februar <a name="13.02"></a>
In der heutigen Stunde haben wir ein Limit eingebaut. Dies verhindert, dass man mehrere Spielerobjekte in ein Spielfeld setzen kann, es also keine Dopplung gibt. Wird ein Objekt in das Feldgesetzt erhöht sich der Limitcounter von 0 auf 1. Der gesamte Setzbefehl des Objekts kann auf dem betreffenden Feld nur ausgeführt werden, wenn der Counter 0 ist. 


Screenshot

####  14. Februar <a name="14.02"></a>
Da wir noch nicht zufrieden damit waren, dass man  das Spiel nur beenden, aber nicht anhalten konnte, haben wir eine FunktIon zum Pausieren eingeführt. Dafür haben wir, wie beim Beenden des Spiels, ein Pausezeichen in Gimp erstellt. 
Beim Anklicken mit der Maus wird ein Actor auf dem Bildschirm platziert. Dieser nimmt den Bildschirm ein und erzeugt das Gefühl, das Spiel wäre angehalten, obwohl es im Prinzip im Hintergrund weiterläuft. Durch erneutes Anklicken verschwindet der Actor wieder und das Spiel läuft wie gewohnt weiter.

Screenshot Pausebildschirm
Screenshot Code

####  19. Februar <a name="19.02"></a>
Betrachtet man unseren alten Code, fällt schnell auf: Die Art und Weise, wie die Felder alle einzeln definiert sind und dadurch auch einzeln platziert werden, ist absoluter BULLSH♡T. 
Entschuldigen Sie die Ausdrucksweise, aber ich denke das würden Sie auch so bezeichnen :). 
Glücklicherweise hatte Herr Buhl eine Lösung für dieses Problem: "Arrays"
Während Felix bereits eine gewisse Vorstellung davon hatte, was dies für unseren Code bedeuten könnte, dachte Lotta darüber nach, was das denn ist. "Array klingt ein bisschen wie 'X-ray!"
Ja, gut... es wurde zumindest viel gelacht!


####  20. Februar <a name="20.02"></a>
Einige,um nicht zu lügen; viel Recherche im WorldWideWeb später konnte Lotta festhalten: Arrays sind Objekte in Java. Es ist eine Aneindanderreihung von Elementen eines festen Datentyps. Lotta stellt es sich wie eine Variable als Schachtel vor. Diese Schachtel hat durchnummeriert Unterteilungen, in denen die Werte der einzelnen Elemente gespeichert sind. Man beginnt bei 0.


####  21. Februar <a name="21.02"></a>
Nach dieser vielleicht etwas merkwürdigen Metapher, hier die Anwendung in unserem Code:

Screenshot Code

Dadurch könnten wir die gesamte Erstellung  des Spielfeldes in 4 Zeilen schreiben!
Ergebnis: Lotta ist beeindruckt von Informatik.

####  26. Februar <a name="26.02"></a>
Jetzt, wo wir den riesigen Erfolg funktionierender Arrays feiern konnten, nahmen wir uns die Zeit, den Fortschritt auf der Projektseite festzuhalten, auch wenn dies die heutige und möglicherweise auch die nächste Informatikstunde in Anspruch nehmen würde.


####  27. Februar <a name="27.02"></a>
Stichwort Zeitmanagement: Felix und Lotta sind BEEINDRUCKT, dass sie dieses mal nicht unter Zeitdruck geraten, es ist noch etwa ein Monat übrig bis die Dokumentation des Spiels abgegeben werden muss! 
Nun fragt man sich natürlich: [Woran hat es gelegen?](https://youtu.be/eHKZlXlqcS4) 
Unserer Meinung nach war die Ursache: Frustration nicht zulassen! 
Denn ja, auch in diesem Halbjahr sind wir einige Male bezüglich des Codes auf die Schnauze gefallen, hatten Blockaden, usw. Trotzdem sind wir stolz auf das, was wir bisher geschafft haben!

####  11. März <a name="11.03"></a>
Was uns vom heutigen Tage am meisten im Gedächtnis geblieben ist: Herrn Buhls verstörter Gesichtsausdruck als Peter nur in Bikini und Hawaiirock und Florian als sexy Schulmädchen verkleidet in seinen Raum kamen. Ach, wie schön die Mottowoche doch ist!
Ein weiteres Highlight dieser Stunde: Das lebende Werbeschild für "Super trocken".

Selfie von Felix und Herrn Buhl

Selbstverständlich haben wir gewissenhaft weiter gearbeitet und den Code kontrolliert, verschönert und die Screenshots im Stundenblog erweitert.

####  13. März <a name="13.03"></a>
Mottowoche Tag 5: Schlafanzug
Leider konnte Lotta sich nicht selbst ein Bild davon machen, da sie eine Klausur nachschreiben musste.
Felix arbeitete natürlich weiter an unserem "traumhaften" Code (Achtung schlechter Witz bezüglich des Mottos)
Nun die entscheidende Frage: Wenn normale Leute Schäfchen zählen, zählen Informatiker dann Loops?

Was wir nicht wussten: Diese Stunde ist die letzte, bevor die verfrühten Ferien anfangen. 
An der Stelle möchten wir Herrn Buhl und seiner Familie beste Gesundheit wünschen und, dass sie die "Corona-Ferien" zur Erholung nutzen.

####  19. März <a name="19.03"></a>
Eigentlich hätten wir heute Unterricht, weshalb wir uns dazu entschieden haben, einen Videoanruf abzuhalten, um die Dokumente noch ein mal durchzugehen. Es sind nur noch wenige Tage bis zur Abgabe, weshalb die letzten Feinschliffe durchgeführt werden. Die Projektseite ist so gut wie fertig, ebenfalls der Stundenblog, in den noch einzelne Sceenshots eingefügt werden müssen.
