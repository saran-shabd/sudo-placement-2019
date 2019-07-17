package misc;

public class Pair<T, V> {
    public T first;
    public V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Pair))
            return false;

        @SuppressWarnings("unchecked")
        Pair<T, V> that = (Pair<T, V>) other;

        return this.first.equals(that.first) && this.second.equals(that.second);
    }

    @Override
    public int hashCode() {
        return this.first.hashCode() + this.second.hashCode();
    }

    @Override
    public String toString() {
        return this.first.toString() + ":" + this.second.toString();
    }
}
