package Graphs;

import java.util.Objects;

/**
 * Die Klasse stellt Graphs.Knoten in einem Graphs.Graph dar.
 * */
public class Knoten {

    private String name;

    public Knoten(String name) {
        this.name = name;
    }

    /**
     * Unterscheidet wird Das Objekt Graphs.Knoten anhand des Namen.
     * */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knoten knoten = (Knoten) o;
        return name.equals(knoten.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
