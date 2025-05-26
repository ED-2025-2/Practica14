/**
 * Implementación de un mapa usando un árbol binario de búsqueda
 * @param <K> Tipo de las claves (debe ser Comparable)
 * @param <V> Tipo de los valores
 */
public class Mapa<K extends Comparable<K>, V> implements MapaInterface<K, V> {
    
    /** Nodo raíz del árbol. */
    protected NodoArbol raiz;

    /** Cantidad de elementos almacenados en el mapa. */
    private int tamanio;
    

    /**
     * Clase interna que representa un nodo del árbol binario de búsqueda.
     */
    protected class NodoArbol {
        K clave;
        V valor;
        NodoArbol izquierdo;
        NodoArbol derecho;
        
        /**
         * Crea un nuevo nodo con la clave y el valor dados.
         * @param clave Clave del nodo.
         * @param valor Valor asociado a la clave.
         */
        NodoArbol(K clave, V valor) {
            this.clave = clave;
            this.valor = valor;
            this.izquierdo = null;
            this.derecho = null;
        }
    }
    
    /**
     * Crea un mapa vacío.
     */
    public Mapa() {
        raiz = null;
        tamanio = 0;
    }

    /**
     * Agrega una clave y su valor asociado al mapa.
     * Si la clave ya existe, su valor se sobrescribe.
     * @param clave Clave a insertar.
     * @param valor Valor asociado a la clave.
     */
    @Override
    public void agregar(K clave, V valor) {
        raiz = agregarRec(raiz, clave, valor);
    }
    
    /**
     * Método recursivo para insertar una clave y valor en el árbol.
     * @param nodo Nodo actual.
     * @param clave Clave a insertar.
     * @param valor Valor a asociar.
     * @return Nodo actualizado tras la inserción.
     */
    private NodoArbol agregarRec(NodoArbol nodo, K clave, V valor) {
        if (nodo == null) {
            tamanio++;
            return new NodoArbol(clave, valor);
        }

        // AQUI VA SU CODIGO
    }
    
    /**
     * Obtiene el valor asociado a una clave específica.
     * @param clave Clave a buscar.
     * @return Valor asociado, o null si no se encuentra.
     */
    @Override
    public V obtener(K clave) {
        // AQUI VA SU CODIGO
    }
    
    /**
     * Busca un nodo por su clave.
     * @param nodo Nodo actual.
     * @param clave Clave a buscar.
     * @return Nodo correspondiente o null.
     */
    private NodoArbol buscar(NodoArbol nodo, K clave) {
        // AQUI VA SU CODIGO
    }
    
    /**
     * Elimina la clave especificada del mapa.
     * @param clave Clave a eliminar.
     * @return true si se eliminó, false si no se encontró.
     */
    @Override
    public boolean eliminar(K clave) {
        int tamañoAntes = tamanio;
        raiz = eliminarRec(raiz, clave);
        return tamanio != tamañoAntes;
    }
    
    /**
     * Método recursivo para eliminar un nodo por su clave.
     * @param nodo Nodo actual.
     * @param clave Clave a eliminar.
     * @return Nodo actualizado tras la eliminación.
     */
    private NodoArbol eliminarRec(NodoArbol nodo, K clave) {
        if (nodo == null) {
            return null;
        }
        
        // AQUI VA SU CODIGO
    }
    
    /**
     * Encuentra el nodo con el valor mínimo en un subárbol.
     * @param nodo Nodo raíz del subárbol.
     * @return Nodo con el valor mínimo.
     */
    private NodoArbol encontrarMinimo(NodoArbol nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }
        return nodo;
    }
    
    /**
     * Verifica si una clave existe en el mapa.
     * @param clave Clave a verificar.
     * @return true si existe, false si no.
     */
    @Override
    public boolean existeClave(K clave) {
        return buscar(raiz, clave) != null;
    }
    
    /**
     * Verifica si un valor existe en el mapa.
     * @param valor Valor a verificar.
     * @return true si existe, false si no.
     */
    @Override
    public boolean existeValor(V valor) {
        return existeValorRec(raiz, valor);
    }
    
    /**
     * Método recursivo para verificar si un valor existe.
     * @param nodo Nodo actual.
     * @param valor Valor a buscar.
     * @return true si existe, false si no.
     */
    private boolean existeValorRec(NodoArbol nodo, V valor) {
        if (nodo == null) {
            return false;
        }
        
        // AQUI VA SU CODIGO
    }
    
    /**
     * Devuelve la cantidad de elementos en el mapa.
     * @return Número de pares clave-valor almacenados.
     */
    @Override
    public int tamanio() {
        // AQUI VA SU CODIGO
    }
    
    /**
     * Verifica si el mapa está vacío.
     * @return true si no contiene elementos, false en caso contrario.
     */
    @Override
    public boolean estaVacio() {
        // AQUI VA SU CODIGO
    }
    
    /**
     * Elimina todos los elementos del mapa.
     */
    @Override
    public void vaciar() {
        // AQUI VA SU CODIGO
    }
    
    /**
     * Devuelve un iterador sobre los pares clave-valor del mapa.
     * @return Iterador de pares clave-valor.
     */
    @Override
    public Iterador<ParClaveValor<K, V>> iterador() {
        return new IteradorClaveValor<>(raiz);
    }
    
    /**
     * Devuelve un iterador sobre los valores del mapa.
     * @return Iterador de valores.
     */
    @Override
    public Iterador<V> iteradorValores() {
        return new IteradorValores<>(raiz);
    }
    
}