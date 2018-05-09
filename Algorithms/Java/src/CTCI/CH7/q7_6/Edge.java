package CTCI.CH7.q7_6;

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
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        // field comparison
        return Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName);
    }
}