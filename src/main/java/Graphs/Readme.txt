Hallo! (0.^).
Das hier ist eine Doku und dient zur Dokumentation des Prozesses und Entscheidungen während ich Graph
Library entwickele und implementiere!
_____________________________________________________________
Datum: 21.02.2024 17:00
------------------------------------------------------------------------------------------------------------------------

   Ich habe versucht mich streng an das Buch "Graphentheoretische Konzepte und Algorithmen 3. Auflage"
   geschrieben von Sven Oliver Krumke, Hartmut Noltemeier, zu halten.

   Im Buch wird allerdings nicht über die Implementierungswege gesprochen, sondern nur über die Konzepte
   und mathematische Definition. Ich denke eine 1:1 Übername der mathematischen Definition keine gute Idee ist,
   da die Definitionen objektorientiert, im Sinne von Java, anders beschrieben werden können.


------------------------------------------------------------------------------------------------------------------------

    Ich habe bisher das Interface Graph mit den folgenden Methoden erstellt:

    public List<Kante> getAusgehendeKanten(Knote knote);
    public List<Kante> getEingehendeKanten(Knote knote);
    public boolean knotenHinzufügen(String knotenname);
    public boolean kantenHinzufügen(String inzidentKnotenName1, String inzidentKnotenName2);
    public int getAnzahlKnoten();
    public int getAnzahlKanten();
    public int getInnenGrad(Knote knote);
    public int getAußenGrad(Knote knote);
    public int getKnotenGrad(Knote knote);
    public List<Knote> getInzidentKnoten(Kante kante);
    public boolean enthaeltKnoten(String name);
    public boolean enthaeltKnoten(List<Kante> inzidentKanten);
    public Knote getKnoten(String name);
    public Knote getKnoten(List<Kante> inzidentKanten);
    public boolean enthaeltKante(String name);
    public boolean enthaeltKante(String inzidentKantenName1,String inzidentKantenName2);
    public Kante getKante(String name);
    public Kante getKante(String inzidentKantenName1,String inzidentKantenName2);


------------------------------------------------------------------------------------------------------------------------

   Die Klasse Knote, die lediglich einen Namen hat. Unterscheidet werden die Objekte der Klasse durch ihren Namen.
   Ich muss mir allerdings darüber Gedanken machen, ob es Sinn macht, denn ich möchte auch Knoten haben die einfach
   keinen Namen haben, man sie aber trotzdem durch die inzidenten Kanten eindeutig bestimmen kann, ich glaube aber, dass
   das sehr aufwendig sein wird, weil wir dann das Problem, ähnlich dem isomorphie-Matching, haben werden. wenn ich Lust
   habe, implementiere ich vielleicht auch eine Funktion, die 2 Graphen auf Isomorphie überprüft.
   Jedenfalls entscheide ich mich jetzt dafür, dass Knoten einen eindeutigen Namen haben.
   Deshalb entferne ich die Methode

   "public Knote getKnoten(List<Kante> inzidentKanten)"
   aus dem Interface Graph.


------------------------------------------------------------------------------------------------------------------------

    Die Klasse Kante hat einen Start und einen end-Knoten. Ich habe mir darüber Gedanken gemacht, wie man mit
    ungerichteten Graphen umgehen soll, weil Anfangs und End-Knoten ja gleich sind. Deshalb habe ich ein final
    boolean objekt Variable hinzugefügt, um festzulegen, ob es sich um eine gerichtete oder ungerichtete Kante handelt.
    Das soll später bei vielen weiteren Methoden hilfreich sein.


------------------------------------------------------------------------------------------------------------------------

    Es gibt eine Klasse MultiGraph, die soll ein Graph darstellen die sowohl gerichtete als auch ungerichtete Kanten
    haben kann.
    Das MultiGraph implementiert Graph und hat somit alle notwendigen Funktionen.
    Meine Überlegung war, dass MultiGraph eine universelle oder obere-Klasse ist für alle weitere Graphklassen.
    Z.B erbt die Klasse GerichtetesGraph von MultiGraph, erlaubt jedoch nur das Hinzufügen von gerichteten Kanten.
    GerichtetesGraph hat außerdem seine spezifische Funktion, die ich im Laufe der Zeit entwickeln werde.


------------------------------------------------------------------------------------------------------------------------

