package Graphs;

import java.util.List;

public interface Graph {
    public Knoten anfangsKnotenVon(Kante kante);
    public Knoten endKnotenVon(Kante kante);

    public boolean knotenHinzufügen(Knoten knoten);
    public boolean kantenHinzufügen(Kante kanten);
    public int getAnzahlKnoten();
    public int getAnzahlKanten();
    public int getInnenGrad(Knoten knoten);
    public int getAußenGrad(Knoten knoten);
    public int getKnotenGrad(Knoten knoten);
    public List<Knoten> getNachfolgerKnoten(Knoten knoten);
    public List<Knoten> getVorGängerKnoten(Knoten knoten);

}
