package Graphs;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        Kante kante = new Kante(name,inzidentKnote1,inzidentKnote2,isUngerichtet);

        return kanten.add(kante);
    }
/**
 * Überladene Methode um Kante ohne Namen auch hinzufügen zu können.
 * */
    public boolean kanteHinzufuegen(String inzidentKnotenName1, String inzidentKnotenName2, boolean isUngerichtet) {
        return kanteHinzufuegen("",inzidentKnotenName2,inzidentKnotenName2,isUngerichtet);
    }


    @Override
    public int getAnzahlKnoten() {
        return 0;
    }

    @Override
    public int getAnzahlKanten() {
        return 0;
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
    @Override
    public List<Kante> getAusgehendeKanten(Knote knote) {
        return null;
    }

    @Override
    public List<Kante> getEingehendeKanten(Knote knote) {
        return null;
    }

    @Override
    public List<Knote> getInzidentKnoten(Kante kante) {
        return List.of(kante.endKnote,kante.startKnote);
    }

    @Override
    public boolean enthaeltKnoten(String name) {
        return false;
    }

    @Override
    public boolean enthaeltKnoten(List<Kante> inzidentKanten) {
        return false;
    }

    @Override
    public Knote getKnoten(String name) {
        return null;
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
    public Kante getKante(String name) {
        return null;
    }

    @Override
    public Kante getKante(String inzidentKantenName1, String inzidentKantenName2) {
        return null;
    }
}
