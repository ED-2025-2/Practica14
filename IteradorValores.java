/**
 * Iterador que recorre solo los valores de un árbol binario de búsqueda
 * @param <K> Tipo de las claves (no visible externamente)
 * @param <V> Tipo de los valores
 */
public class IteradorValores<K extends Comparable<K>, V> implements Iterador<V> {
    private Iterador<ParClaveValor<K, V>> iterador;
    
    public IteradorValores(Mapa<K, V>.NodoArbol raiz) {
        this.iterador = new IteradorClaveValor<>(raiz);
    }
    
    /**
     * Verifica si hay más elementos por recorrer.
     * @return 'true' si quedan elementos por recorrer, 'false' en caso contrario
     */
    @Override
    public boolean hasNext() {
        // AQUI VA SU CODIGO
    }
    
    /**
     * Devuelve el siguiente elemento en el recorrido.
     * @return El siguiente elemento en el recorrido.
     */
    @Override
    public V next() {
        // AQUI VA SU CODIGO
    }
}