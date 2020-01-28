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
  <summary>Januar</summary>
  
##### [14.01.20](#14.01)  
##### [15.01.20](#15.01)  
##### [16.01.20](#16.01)
##### [21.01.20](#21.01)
##### [22.01.20](#22.01)
##### [23.01.20](#23.01)
##### [28.01.20](#28.01)
  

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
Überraschenderweise haben wir unsere Projektidee noxh nicht über den Haufen geworfen!
Allerdings haben wir sie etwas erweitert: Je nach dem, wie es die Zeit ermöglicht, möchten wir mehrere Minispiele für 2 Personen erstellen. Diese hat man im Überblick auf einer Seite und kann dann eines auswählen, das man spielen möchte. Nach Abschluss kommt man dann wieder auf die Übersicht. 
Aus dem Gespräch mit Herrn Buhl hat sich die Struktur der Spiele ergeben; wir werden uns nun mehr auf die Objektklassen konzentrieren und nicht auf die einzelnen Actors. Dazu ziehen wir das Buch "Einführung in Java mit Greenfoot" zu Hilfe.

#### 16. Januar <a name="16.01"></a>



#### 21. Januar <a name="21.01"></a>
Am heutigen Tage war die gesamte Klasse 12g im DESY in Hamburg. Da Teilchenbeschleunigung zwar ein sehr spannender Bereich der Physik ist, der Ausflug allerdings nicht optimal bezüglich der neuen Kenntnisgewinnung gestaltet war, mussten wir den Infounterricht schmerzlich vermissen.

#### 22. Januar <a name="22.01"></a>
Diese Stunde füllten wir mit dem Kapitel xxx aus der Greenfoot-Lektüre. Wir lernten xxx und werden morgen versuchen dieses Wissen umzusetzen.

#### 23. Januar <a name="23.01"></a>
Um ein Grundgerüst für unser erstes Spiel "4 gewinnt" zu errichten, haben wir MyWorld so programmiert, dass zu Beginn 6x6 leere Felder erscheinen. Diese haben wir selbst mit Gimp erstellt. 

![Spielfeld4](https://user-images.githubusercontent.com/54102146/72970640-5cecd580-3dc8-11ea-9152-ad435fcb31c0.PNG)

#### 28. Januar <a name="28.01"></a>

