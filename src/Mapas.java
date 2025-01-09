import java.util.ArrayList;
import java.util.List;

public class Mapas<K, V> {
    private List<Pora<K, V>> sarasasPoru;

    public Mapas() {
        sarasasPoru = new ArrayList<>();
    }

    public void ideti(K raktas, V reiksme) {
        Pora<K, V> pora = new Pora<>(raktas, reiksme);
        sarasasPoru.add(pora);
    }

    public V gauti(K raktas) {
        for (Pora<K, V> pora : sarasasPoru) {
            if (pora.getRaktas().equals(raktas)) {
                return pora.getReiksme();
            }
        }
        return null;
    }
}

