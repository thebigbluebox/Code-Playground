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
    public boolean equals(Object edge){
        // self check
        if (this == edge)
            return true;
        // null check
        if (edge == null)
            return false;
        // type check and cast
        if (getClass() != edge.getClass())
            return false;
        Edge edge_one = (Edge) edge;
        // field comparison
        return Objects.equals(hashCode, edge_one.getHashCode());
    }
}