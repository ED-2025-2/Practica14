import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Iterador para recorrer los pares clave-valor de un árbol binario de búsqueda en orden
 * @param <K> Tipo de las claves (debe ser Comparable)
 * @param <V> Tipo de los valores
 */
public class IteradorClaveValor<K extends Comparable<K>, V> implements Iterador<ParClaveValor<K, V>> {
    private Stack<Mapa<K, V>.NodoArbol> pila;
    
    public IteradorClaveValor(Mapa<K, V>.NodoArbol raiz) {
        pila = new Stack<>();
        apilarIzquierdos(raiz);
    }

    private void apilarIzquierdos(Mapa<K, V>.NodoArbol nodo) {
        while (nodo != null) {
            pila.push(nodo);
            nodo = nodo.izquierdo;
        }
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
    public ParClaveValor<K, V> next() {
        // AQUI VA SU CODIGO
    }
}