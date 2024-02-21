package Graphs;

import java.util.List;
import java.util.Optional;

public interface Graph {

    public List<Kante> getAusgehendeKanten(Knote knote);
    public List<Kante> getEingehendeKanten(Knote knote);

    public boolean knotenHinzufuegen(String knotenname);
    public boolean kanteHinzufuegen( String name,String inzidentKnotenName1, String inzidentKnotenName2, boolean istUngerichtet);
    public boolean kanteHinzufuegen(String inzidentKnotenName1, String inzidentKnotenName2, boolean istUngerichtet);
    public int getAnzahlKnoten();
    public int getAnzahlKanten();
    public int getInnenGrad(Knote knote);
    public int getAussenGrad(Knote knote);
    public int getKnotenGrad(Knote knote);
    public List<Knote> getInzidentKnoten(Kante kante);
    public boolean enthaeltKnoten(String name);
    public List<Kante> getInzidentKanten(Knote knote);
    public Optional<Knote> getKnoten(String name);

    public boolean enthaeltKante(String name);
    public boolean enthaeltKante(String inzidentKantenName1,String inzidentKantenName2);

    public Optional<Kante> getKante(String name);
    public Optional<Kante> getKante(String inzidentKantenName1,String inzidentKantenName2);


}
