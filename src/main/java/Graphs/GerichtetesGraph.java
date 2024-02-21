package Graphs;

import com.google.common.base.Preconditions;

import java.util.List;
/**
 * Die Klasse stellt ein gerichtetes Graph zusammen mit seinen Komponenten Graphs.Knoten und Graphs.Kanten dar.
 * */

public class GerichtetesGraph extends MultiGraph {


    /**
     * Die Methode nimmt eine Kante und liefert den Start-Knoten der Kante.
     * @param kante
     * @throws Exception falls Kante nicht im Graph vorhanden ist oder Kante null ist.
     * @return  Start-Knoten der Kante.
     * */


    public Knote getAnfangsKnotenVon(Kante kante) {
        Preconditions.checkNotNull(kante);
        Preconditions.checkArgument(kanten.contains(kante),"Kante ist nicht im Graphs.Graphen!");
        return kante.startKnote;
    }

    /**
     * Die Methode nimmt eine Kante und liefert den End-Knoten der Kante.
     * @param kante
     * @throws Exception falls Kante nicht im Graph vorhanden ist oder Kante null ist.
     * @return  End-Knoten der Kante.
     * */
    public Knote getEndKnotenVon(Kante kante) {
        Preconditions.checkNotNull(kante);
        Preconditions.checkArgument(kanten.contains(kante),"Kante ist nicht im Graphs.Graphen!");
        return kante.endKnote;
    }

    /**
     * Die Methode fügt im Graph eine Kante hinzu.
     *
     * */



    @Override
    public int getAnzahlKnoten() {
        return knoten.size();
    }

    @Override
    public int getAnzahlKanten() {
        return kanten.size();
    }

    @Override
    public int getInnenGrad(Knote knote) {
        return 0;
    }

    @Override
    public int getAußenGrad(Knote knote) {
        return 0;
    }

    @Override
    public int getKnotenGrad(Knote knote) {
        return 0;
    }


    public List<Knote> getNachfolgerKnoten(Knote knote) {
        return null;
    }


    public List<Knote> getVorGängerKnoten(Knote knote) {
        return null;
    }

    @Override
    public List<Kante> getAusgehendeKanten(Knote knote) {
        return null;
    }

    @Override
    public List<Kante> getEingehendeKanten(Knote knote) {
        return null;
    }
}
