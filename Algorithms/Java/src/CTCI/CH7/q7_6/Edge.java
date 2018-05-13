package CTCI.CH7.q7_6;

import java.util.Objects;

public class Edge {
    private int hashCode;

    public Edge(int hashCode){
        this.hashCode = hashCode;
    }

    public int getHashCode() {
        return hashCode;
    }

    @Override
    public boolean equals(Object o){
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        Edge edge = (Edge) o;
        // field comparison
        return Objects.equals(hashCode, edge.hashCode);
    }
}