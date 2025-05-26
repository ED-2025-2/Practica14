/**
 * Interfaz que define las operaciones basicas de un mapa/diccionario
 * @param <K> Tipo de las claves
 * @param <V> Tipo de los valores
 */
public interface MapaInterface<K extends Comparable<K>, V> {
    /**
     * Agrega un par clave-valor al mapa
     * @param clave La clave a agregar
     * @param valor El valor asociado a la clave
     */
    void agregar(K clave, V valor);
    
    /**
     * Obtiene el valor asociado a una clave
     * @param clave La clave a buscar
     * @return El valor asociado o null si no existe
     */
    V obtener(K clave);
    
    /**
     * Elimina un elemento del mapa por su clave
     * @param clave La clave del elemento a eliminar
     * @return true si se elimino, false si no existia
     */
    boolean eliminar(K clave);
    
    /**
     * Verifica si existe una clave en el mapa
     * @param clave La clave a buscar
     * @return true si existe, false si no
     */
    boolean existeClave(K clave);
    
    /**
     * Verifica si existe un valor en el mapa
     * @param valor El valor a buscar
     * @return true si existe, false si no
     */
    boolean existeValor(V valor);
    
    /**
     * @return El numero de elementos en el mapa
     */
    int tamanio();
    
    /**
     * @return true si el mapa está vacio, false si no
     */
    boolean estaVacio();
    
    /**
     * Vacía el mapa
     */
    void vaciar();
    
    /**
     * @return Un iterador sobre los pares clave-valor del mapa
     */
    Iterador<ParClaveValor<K, V>> iterador();
    
    /**
     * @return Un iterador sobre los valores del mapa
     */
    Iterador<V> iteradorValores();
}

/**
 * Clase auxiliar para representar pares clave-valor
 * @param <K> Tipo de la clave
 * @param <V> Tipo del valor
 */
class ParClaveValor<K, V> {
    public final K clave;
    public final V valor;
    
    public ParClaveValor(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }
}