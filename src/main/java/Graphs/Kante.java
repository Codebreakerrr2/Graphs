package Graphs;

/**
 * Die Klasse stellt Graphs.Kanten in einem Graphs.Graph dar.
 * */
public class Kante {
    protected String name;
    protected Knoten startKnoten;
    protected Knoten endKnoten;

    public Kante(String name, Knoten startKnoten, Knoten endKnoten) {
        this.name = name;
        this.startKnoten = startKnoten;
        this.endKnoten = endKnoten;
    }
}
