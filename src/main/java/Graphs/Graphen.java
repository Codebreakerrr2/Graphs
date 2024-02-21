package Graphs;

import com.google.common.base.Preconditions;

import java.util.List;
/**
 * Die Klasse stellt ein Graphs.Graph zusammen mit seinen Komponenten Graphs.Knoten und Graphs.Kanten dar.
 * */

public class Graphen implements Graph {
    private List<Knoten> knoten;
    private List<Kante> kanten;
    /**
     * Die Methode nimmt eine Kante und liefert den Start-Graphs.Knoten der Kante.
     * @param kante
     * @throws Exception falls Kante nicht im Graphs.Graph vorhanden ist oder Kante null ist.
     * @return  Start-Graphs.Knoten der Kante.
     * */

    @Override
    public Knoten anfangsKnotenVon(Kante kante) {
        Preconditions.checkNotNull(kante);
        Preconditions.checkArgument(kanten.contains(kante),"Kante ist nicht im Graphs.Graphen!");
        return kante.startKnoten;
    }

    /**
     * Die Methode nimmt eine Kante und liefert den End-Graphs.Knoten der Kante.
     * @param kante
     * @throws Exception falls Kante nicht im Graphs.Graph vorhanden ist oder Kante null ist.
     * @return  End-Graphs.Knoten der Kante.
     * */
    @Override
    public Knoten endKnotenVon(Kante kante) {
        Preconditions.checkNotNull(kante);
        Preconditions.checkArgument(kanten.contains(kante),"Kante ist nicht im Graphs.Graphen!");
        return kante.endKnoten;
    }
    /**
     * Die Methode fügt im Graph einen Knoten hinzu.
     * @param knote
     * @throws Exception falls knote im Graphs.Graph vorhanden ist oder knote null ist.
     * @return true falls knote hinzugefügt wurde sonst false.
     * */

    @Override
    public boolean knotenHinzufügen(Knoten knote) {
        Preconditions.checkNotNull(knote);
        Preconditions.checkArgument(!knoten.contains(knote),"Knote schon vorhanden!");
        return knoten.add(knote);
    }
    /**
     * Die Methode fügt im Graph eine Kante hinzu.
     *
     * */

    @Override
    public boolean kantenHinzufügen(Kante kante) {
        return false;
    }

    @Override
    public int getAnzahlKnoten() {
        return knoten.size();
    }

    @Override
    public int getAnzahlKanten() {
        return kanten.size();
    }

    @Override
    public int getInnenGrad(Knoten knoten) {
        return 0;
    }

    @Override
    public int getAußenGrad(Knoten knoten) {
        return 0;
    }

    @Override
    public int getKnotenGrad(Knoten knoten) {
        return 0;
    }

    @Override
    public List<Knoten> getNachfolgerKnoten(Knoten knoten) {
        return null;
    }

    @Override
    public List<Knoten> getVorGängerKnoten(Knoten knoten) {
        return null;
    }
}
