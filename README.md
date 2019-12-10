# Projekt2: Stundenblog

### Übersicht
<details>
  <summary>November</summary>
  
##### [19.11.19](#19.11)
##### [20.11.19](#20.11)
##### [21.11.19](#21.11)
##### [26.11.19](#26.11)
##### [27.11.19](#27.11)
##### [28.11.19](#28.11)
##### [03.12.19](#03.12)
##### [04.12.19](#04.12)
##### [05.12.19](#05.12)


</details>
  
  <details>
  <summary>Dezember</summary>
  
##### [03.12.19](#03.12)
##### [04.12.19](#04.12)
##### [05.12.19](#05.12)


</details>
  
  #### 19. November <a name="19.11"></a>
  Letzten Freitag haben wir unser 1. Greenfoot-Projekt "Fischi von Klå" abgegeben und uns damit von Fischi verabschiedet. Schweren Herzens haben wir nun beschlossen, die Zeiten mit Fischi, so schön sie auch waren hinter uns zu lassen und uns auf ein neues Abenteuer in Greenfoot zu begeben. Unser "Spaghetti-Code" in Fischi hat uns teilweise zu schaffen gemacht, weshalb wir beschlossen haben zu versuchen, dieses mal von Grund auf strukturierter vorzugehen.
  Zuallererst musste natürlich erstmal eine Idee für ein neues Projekt her. Ein Spiel haben wir ja schon mit einigem Erfolg programmiert, weshalb sich augenscheinlich nun zwei Wege für uns darboten:
  - unser angeeignetes Wissen über diese Art Spiel nutzen, um ein ähnliches/ fortgschritteneres Spiel zu erschaffen
  - Ein anderes Projekt in Greenfoot umsetzen
  Da wir uns in Greenfoot gut eingelebt haben, wollten wir diese Plattform aber zunächst eher ungern wieder verlassen.
  Diese schwere Entscheidung haben wir uns zusammen mit ein paar gänzlich anderen Ideen (wie zum Beipsiel auch wieder Arduino, auch wenn wir vor diesem nach unserer ersten Erfahrung noch Respekt haben...) und auch "Snap!" mit nach Hause genommen. 
  Außerdem haben wir uns heute im Laufe der Stunde ein wenig im Unterrichtsraum umgesehen: Wie erwähnt war am Freitag Abgabetermin für die fertigen Informatikprojekte und es war spannend zu sehen, was bei unseren Mitschülern an Projekten entstanden ist. 

#### 20. November <a name="20.11"></a>
Heute haben wir mit unserem neuen Greenfoot Projekt begonnen. Da wir im letzten Alauf zum Ende hin etwas unter Zeitdruck geraten sind, haben wir uns vorgenommen, die gleichen Fehler dieses Mal nicht zu machen und von Anfang an mit etwas mehr Biss an unser Projekt ranzugehen.
Zuallererst haben wir für unser neues Spiel dessen Welt "MyWorld" im Konstruktor auf eine neue Größe skaliert. Wir haben für Breite und Höhe die Parameter `1000 für x und 750 für y` gewählt, die sich im letzten Projekt schon als annehmbar/sinvoll bewiesen haben. 
Unsere Idee für ein neues Spiel war, eine Art "Weltraum-Shooter" zu bauen, in dem der Spieler gegen gefährlicher werdende Raumschiffe ankämpfen muss. 
Wir haben begonnen, indem wir die "Mutterklasse" Flugobjekte für alle Raumschiffe erstellt haben. Im letzten Projekt mit Greenfoot haben wir am eigenen Leibe erfahren, wie nützlich es sein kann, Befehle, die Akteure sich teilen, in einer gemeinsamen Mutterklasse zu definieren, um sich Arbeit und Sorgen zu ersparen.
Wir haben dann die `CheckKeys()` Methode für diese Mutterkalsse eingeführt, welche es alles Akteuren dieser Klasse ermöglicht, sich mit den Pfeiltasten zu bewegen, wenn sie abgerufen wird. Außerdem haben wir die Java utility und Array Listen importiert, um uns das Programmieren zu vereinfachen.
Danach haben wir für unser Raumschiff noch ein Bild aus dem Internet ausgewählt, in Photoshop die Ränder von diesem entfernt und es als Bild für unser Raumschiff gesetzt, welches wir zu Ehren unseres alten Freundes "Fischi von Klå" Schifi getauft haben.
Das Ausschneiden ist ziemlich anstrengende Kleinstarbeit, die unser Photoshop-Experte Felix Zuhause pflichtbewusst beendet hat ;).

<img src="https://user-images.githubusercontent.com/54102146/68995786-c7960800-0891-11ea-8c69-c4c5350d9af4.png" width="48">


#### 21. November <a name="21.11"></a>
Die Stunde am 21. ist ausgefallen: Heute haben wir unser Vorabi in Physik geschrieben...
Den rest des Tages haben wir uns frei genommen ;).

#### 26. November <a name="26.11"></a> 
  Heute war dann das Vorabi in Mathe dran. Das heißt: Das Wochenende gehörte Mathe, genau wie die Informatikstunde heute, die ist nämlich ausgefallen. Wir sind ziemlich geschafft vom Lernen, freuen uns aber trotzdem auf Info morgen :).

#### 27. November <a name="27.11"></a>
Heute haben wir zu Beginn der Stunde erstmal ein paar Minütchen rumgesucht, wie man in Github Bilder skaliert. Das hatten wir schon beim letzten Projekt versucht, waren dann aber gescheitert und haben uns das Problem aus Zeitgründen für später aufgehoben. Die Lösung war dann eine relativ einfache und bestand bei uns darin, HTML-Code zu verwenden, in welchem man die Weite ganz einfach nach dem Bild mit dem "width" Anhang auswählen kann.
Unser Schifi war bisher etwas groß (siehe unten), weshalb wir es mit einer Zeile Code, die wir schon aus dem letzten Projekt kannten in seinem Konstruktor auf die richtige Größe skalieren lassen.

<img width="370" alt="Bildschirmfoto 2019-11-16 um 17 11 38" src="https://user-images.githubusercontent.com/54102146/68995972-32e0d980-0894-11ea-88eb-9a9f9a3fc2c9.png"> <img width="370" alt="Bildschirmfoto 2019-11-16 um 17 15 41" src="https://user-images.githubusercontent.com/54102146/68996017-c61a0f00-0894-11ea-8a8c-baa379d7cd78.png">

Als nächstes wollten wir für unser Schifi eine "schießen" Methode programmieren. Damit überhaupt etwas geschossen werden kann, haben wir eine "SchnellfeuerKugel"-Klasse erstellt. Als bild haben wir schlicht einen roten Kreis genommen, den wir, wie auch das Raumschiff in seinem Konstruktor skalieren lassen. 
Diese Kugel soll nun vom Schifi-Raumschiff geschossen werden. Wir haben das so umgesetzt, dass immer, wenn die Leertase gedrückt wird, in der act Methode des Schifis eine neue Kugel mit der Position des Schifis erstellt wird. Diese Kugel bewegt sich wiederum in ihrer act Methode in Schussrichtung.

![DASHIER](https://user-images.githubusercontent.com/54102146/68996456-979f3280-089a-11ea-9df7-7f7b6340b68a.png)

wie zu sehen, erscheinen die Kugeln jetzt sehr schnell nacheinander, was wir mit einer if Schleife angepasst haben, die einen kleinen cooldown hinzufügt. Das Prinzip solcher if-Schleifen war uns noch gut aus unserem [ersten Projekt](https://github.com/feta-herrner/Fischi-von-Kla) geläufig.

<img width="500" alt="Bildschirmfoto 2019-11-16 um 18 03 00" src="https://user-images.githubusercontent.com/54102146/68996515-78ed6b80-089b-11ea-9277-0a1a29d91897.png">

Durch ändern der "shootingCooldown" Variable können wir auch die Schussgeschwindigkeit anpassen.
Wie im Bild oben zu sehen, bestand außerdem das Problem, dass die Projektile an der oberen Grenze der Welt "hängen" bleiben. Diesem Fehler wollen wir in der nächsten Informatikstunde nachgehen.
#### 28.November <a name="28.11"></a>

#### 10.Dezember <a name="10.12"></a>
erster Arbeitstag!


