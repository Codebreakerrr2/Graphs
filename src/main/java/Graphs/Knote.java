package Graphs;

import java.util.Objects;

/**
 * Die Klasse stellt Knoten in einem Graph dar.
 * */
public class Knote {

    protected String name;

    public Knote(String name) {
        this.name = name;
    }

    /**
     * Unterscheidet wird das ObjektKnote anhand des Namen.
     * */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knote knote = (Knote) o;
        return name.equals(knote.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
