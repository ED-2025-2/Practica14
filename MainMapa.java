public class MainMapa {
    public static void main(String[] args) {
        // Crear un mapa de Pokemons (número -> nombre)
        MapaInterface<Integer, String> pokedex = new Mapa<>();
        
        // Agregar algunos Pokemons (primera generacion)
        pokedex.agregar(1, "Bulbasaur");
        pokedex.agregar(4, "Charmander");
        pokedex.agregar(7, "Squirtle");
        pokedex.agregar(25, "Pikachu");
        pokedex.agregar(150, "Mewtwo");
        
        // Mostrar tamanio de la Pokedex
        System.out.println("Pokémon registrados: " + pokedex.tamanio());
        
        // Buscar un Pokemon por su numero
        int numeroBuscado = 25;
        System.out.println("\n¿Quién es el Pokémon #" + numeroBuscado + "? " + 
                          pokedex.obtener(numeroBuscado));
        
        // Verificar existencia de un Pokémon
        System.out.println("\n¿Existe el Pokémon #4? " + pokedex.existeClave(4));
        System.out.println("¿Existe el Pokémon #5? " + pokedex.existeClave(5));
        
        // Verificar si un nombre de Pokémon existe
        String nombreBuscado = "Pikachu";
        System.out.println("\n¿Existe algún Pokémon llamado '" + nombreBuscado + "'? " + 
                          pokedex.existeValor(nombreBuscado));
        
        // Recorrer todos los Pokémons registrados (en orden por número)
        System.out.println("\n=== Pokédex Completa antes de las operaciones ===");
        Iterador<ParClaveValor<Integer, String>> it = pokedex.iterador();
        while (it.hasNext()) {
            ParClaveValor<Integer, String> entrada = it.next();
            System.out.println("#" + entrada.clave + ": " + entrada.valor);
        }
        
        // Recorrer solo los nombres de los Pokémons
        System.out.println("\n=== Nombres de Pokémons ===");
        Iterador<String> nombres = pokedex.iteradorValores();
        while (nombres.hasNext()) {
            System.out.println(nombres.next());
        }
        
        // Eliminar un Pokémon
        int numeroAEliminar = 4;
        System.out.println("\nEliminando al Pokémon #" + numeroAEliminar + "...");
        boolean eliminado = pokedex.eliminar(numeroAEliminar);
        System.out.println("¿Se eliminó correctamente? " + eliminado);
        System.out.println("Nuevo total: " + pokedex.tamanio() + " Pokémons");
        
        // Intentar obtener el Pokemon eliminado
        System.out.println("\nIntentando obtener al Pokémon eliminado (#4): " + 
                          pokedex.obtener(4));

        // Recorrer todos los Pokemons despues de eliminar
        System.out.println("\n=== Pokédex despues de eliminar ===");
        Iterador<ParClaveValor<Integer, String>> del = pokedex.iterador();
        while (del.hasNext()) {
            ParClaveValor<Integer, String> entrada = del.next();
            System.out.println("#" + entrada.clave + ": " + entrada.valor);
        }


        // Vaciar la Pokedex
        System.out.println("\nVaciar la Pokédex...");
        pokedex.vaciar();
        System.out.println("¿Está vacía la Pokédex? " + pokedex.estaVacio());
        System.out.println("Pokémon registrados: " + pokedex.tamanio());

        // Recorrer todos los Pokemons despues vaciar
        System.out.println("\n=== Pokédex despues de vaciar ===");
        Iterador<ParClaveValor<Integer, String>> liberados = pokedex.iterador();
        while (liberados.hasNext()) {
            ParClaveValor<Integer, String> entrada = liberados.next();
            System.out.println("#" + entrada.clave + ": " + entrada.valor);
        }
    }
}