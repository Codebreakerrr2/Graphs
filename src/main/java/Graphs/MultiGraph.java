package Graphs;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MultiGraph implements Graph{
    protected final List<Knote> knoten=new ArrayList<>();
    protected final List<Kante> kanten=new ArrayList<>();


    /**
     * Die Methode fügt im Graph einen Knoten hinzu.
     * @param knotenname NotNull.
     * @throws Exception falls knote im Graph vorhanden.
     * @return true falls knote hinzugefügt wurde sonst false.
     * */

    @Override
    public boolean knotenHinzufuegen(String knotenname) {

        Preconditions.checkNotNull(knotenname);
        Knote knote= new Knote(knotenname);
        Preconditions.checkArgument(!knoten.contains(knote),"Knote schon vorhanden!");
        return knoten.add(knote);
    }
/**
 * Die Methode fügt im Graph eine Kante hinzu.
 * @param inzidentKnotenName1 NotNull.
 * @param inzidentKnotenName2 NotNull.
 * @param name NotNull.
 * @param isUngerichtet bestimmt um was für eine Kante es sich handelt
 * @return true, falls Kanten hinzugefügt werden konnte sonst false.
 * */
    @Override
    public boolean kanteHinzufuegen(String name, String inzidentKnotenName1, String inzidentKnotenName2,boolean isUngerichtet) {
        Preconditions.checkNotNull(inzidentKnotenName1);
        Preconditions.checkNotNull(inzidentKnotenName2);
        Preconditions.checkNotNull(name);
        Knote inzidentKnote1= new Knote(inzidentKnotenName1);
        Knote inzidentKnote2= new Knote(inzidentKnotenName2);
        if(!knoten.contains(inzidentKnote1)) knoten.add(inzidentKnote1);
        if(!knoten.contains(inzidentKnote2)) knoten.add(inzidentKnote2);


        Kante kante = new Kante(name,knoten.get(),inzidentKnote2,isUngerichtet);

        return kanten.add(kante);
    }
/**
 * Überladene Methode um Kante ohne Namen auch hinzufügen zu können.
 * */
    @Override
    public boolean kanteHinzufuegen(String inzidentKnotenName1, String inzidentKnotenName2, boolean isUngerichtet) {
        return kanteHinzufuegen("",inzidentKnotenName2,inzidentKnotenName2,isUngerichtet);
    }


    @Override
    public int getAnzahlKnoten() {
        return knoten.size();
    }

    @Override
    public int getAnzahlKanten() {
        return kanten.size();
    }
/**
 * Die Methode bekommt einen Knoten und liefert die Anzahl der eingehenden Kanten.
 * Es wird die Methode getEingehendeKanten als Hilfsmethode benutzt.
 *@param knote
 * */
    @Override
    public int getInnenGrad(Knote knote) {
        return getEingehendeKanten(knote).size();
    }
    /**
     * Die Methode bekommt einen Knoten und liefert die Anzahl der ausgehenden Kanten.
     * Es wird die Methode getAusgehendeKanten als Hilfsmethode benutzt.
     *@param knote
     * */
    @Override
    public int getAussenGrad(Knote knote) {

        return getAusgehendeKanten(knote).size();
    }
    /**
     * Die Methode bekommt einen Knoten und liefert den Knotengrad also Aussengrad + Innengrad.
     * Es wird die Methode getAussenGrad und getInnenGrad als Hilfsmethode benutzt.
     *@param knote
     * */
    @Override
    public int getKnotenGrad(Knote knote) {

        return getAusgehendeKanten(knote).size()+getEingehendeKanten(knote).size();
    }


    @Override
    public List<Kante> getAusgehendeKanten(Knote knote) {
        return null;
    }

    @Override
    public List<Kante> getEingehendeKanten(Knote knote) {
        return null;
    }

    /**
     * Die Methode liefert die Liste der inzidenten Knoten einer Kante, also das eine Ende und das andere Ende
     * der Kante.
     * @param kante
     * */
    @Override
    public List<Knote> getInzidentKnoten(Kante kante) {
        return List.of(kante.endKnote,kante.startKnote);
    }

    @Override
    public boolean enthaeltKnoten(String name) {
        return knoten.contains(new Knote(name));
    }

    @Override
    public List<Kante>  getInzidentKanten(Knote knote) {
        return null;
    }
/**
 *Die Methode bekommt einen Namen und liefert eine Optional-Box mit dem Knoten, der den Namen hat
 * @Param name
 * @return Optional<Knote> falls der Knote im Graph ist wird er In Optional gepackt sonst wird leere Optional<Knote>
 * geliefert
 * */
    @Override
    public Optional<Knote> getKnoten(String name) {

       for(Knote knotee: knoten){
           if(knotee.name.equals(name)) return Optional.of(knotee);
       }
        return Optional.empty();
    }


    @Override
    public boolean enthaeltKante(String name) {
        return false;
    }

    @Override
    public boolean enthaeltKante(String inzidentKantenName1, String inzidentKantenName2) {
        return false;
    }

    @Override
    public Optional<Kante> getKante(String name) {
        return null;
    }

    @Override
    public Optional<Kante> getKante(String inzidentKantenName1, String inzidentKantenName2) {
        return null;
    }
}
