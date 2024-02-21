package Graphs;

public  class Kante {
    protected String name;
    protected Knote startKnote;
    protected Knote endKnote;
    protected final boolean IstUngerichtet;

    public Kante(String name, Knote startKnote, Knote endKnote, boolean IstUngerichtet) {
        this.IstUngerichtet=IstUngerichtet;
        this.name = name;
        this.startKnote = startKnote;
        this.endKnote = endKnote;
    }

}
