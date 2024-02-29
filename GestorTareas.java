import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<String> tareasPendientes;
    
    public GestorTareas() {
        tareasPendientes = new ArrayList<String>();
    }
    
    /**
     * Metodo 'agregarTarea' que agrega una tarea al final de la lista.
     * Requiere un parametro de tipo String con el contenido de la tarea.
     */
    public void agregarTarea(String nuevaTarea) {
        tareasPendientes.add(nuevaTarea);
    }
    
    /**
     * Método 'devolverTareas' que devuelve un String con todas las tareas, una
     * en cada línea. Si no hay tareas, esa línea contiene la cadena
     * vacía. No requiere parametros.
     */
    public String devolverTareas() {
        String listaTareasPendientes = "";
        if (tareasPendientes.size() > 0) {
            for (String tarea : tareasPendientes) {
                listaTareasPendientes = listaTareasPendientes + tarea + "\n";
            }
        }
        return listaTareasPendientes;
    }
    
    /**
     * Metodo 'getNumeroTareas' que devuelve el numero de tareas pendientes
     * existentes. No requiere parámetros.
     */
    public int getNumeroTareas() {
        return tareasPendientes.size();
    }
    
    /**
     * Metodo 'getNumeroTareas2' que devuelve el numero de tareas pendientes
     * actuales y no requiere parámetros. No se puede usar el metodo size de la
     * clase ArrayList.
     */
    public int getNumeroTareas2() {
        int contador = 0;
        for (String tarea : tareasPendientes) {
            contador++;
        }
        return contador;
    }
    
    /**
     * Metodo 'imprimirTareaMasAntigua' que imprime la primera tarea que se agrego
     * al gestor de tareas; si no hay tareas imprime una línea en blanco. No
     * requiere parametros.
     */
    public String getTareaMasAntigua() {
        String tarea = "";
        if (tareasPendientes.size() > 0) {
            tarea = tareasPendientes.get(0);
        }
        return tarea;
    }
    
    /**
     * Metodo 'getListadoTareas' que devuelve un String con todas las tareas pendientes, 
     * una en cada línea, precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama"). Si no hay tareas devuelve la cadena vacía.
     * No requiere parametros.
     */
    public String getListadoTareas() {
        int posicion = 0;
        String tareaNumerada = "";
        for (String tarea : tareasPendientes) {
            posicion++;
            tareaNumerada = tareaNumerada + (posicion + ". " + tarea) + "\n";
        }
        return tareaNumerada;
    }
    
    /**
     * Metodo 'imprimirListadoTareas' que imprime por pantalla todas las tareas pendientes, 
     * una en cada línea, precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama"). Si no hay tareas imprime una línea en blanco. 
     * El método no devuelve nada. No requiere parametros.
     */
    public void imprimirListadoTareas() {
        int posicion = 0;
        for (String tarea : tareasPendientes) {
            posicion++;
            System.out.println(posicion + ". " + tarea);
        }
    }
    
    /**
     * Metodo 'getTareasEnUnaSolaLinea' que devuelve todas las tareas pendientes en una sola 
     * linea separadas por comas, y por un espacio y con dos corchetes al inicio y al final
     * del tipo "[tarea1, tarea2, tarea3]". Si no hay tareas devuelve la cadena "[]". 
     */
    public String getTareasEnUnaSolaLinea() {
        int contador = 0;
        String tareasUnaLinea = "[";
        while (contador < tareasPendientes.size()) {
            if (contador == (tareasPendientes.size() -1)) {
                tareasUnaLinea = tareasUnaLinea + tareasPendientes.get(contador) + "]";
            }
            else {
                tareasUnaLinea = tareasUnaLinea + tareasPendientes.get(contador) + ", ";
            }
            
            contador++;
        }

        if (tareasPendientes.size() == 0) {
            tareasUnaLinea = tareasUnaLinea + "]";
        }
        return tareasUnaLinea;
    }
    
    /**
     * Metodo 'imprimirTareasEnUnaSolaLinea' que imprime todas las tareas pendientes en una sola 
     * linea separadas por comas, y por un espacio y con dos corcehete al inicio y al final
     * del tipo "[tarea1, tarea2, tarea3]. Si no hay tareas imprime una línea con dos corchetes 
     * del tipo "[]". No requiere parametros.
     */
    public void imprimirTareasEnUnaSolaLinea() {
        System.out.println(getTareasEnUnaSolaLinea());
    }
    
    /**
     * Metodo 'existeTareaConElTexto' que devuelve true si hay al menos una tarea que contenga 
     * el texto indicado como parametro, false en caso contrario. Hay que hacerlo con bucle for-each.
     * Requiere de parametro de tipo String con el texto a buscar.
     */
    public boolean existeTareaConElTexto(String tareaBusca) {
        boolean existe = false;
        for (String tarea : tareasPendientes) {
            if (tarea.contains(tareaBusca)) {
                existe = true;
            }
        }
        return existe;
    }
    
    /**
     * Metodo getTareasImportantes:
     * Devuelve un String con todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama (importante)\\n3. Estudiar (Importante)\\n") 
     * siempre que la tarea contenga la palabra "importante" 
     * (que puede aparecer en mayúsculas o en minúsculas). 
     * Si no hay tareas de ese tipo devuelve la cadena vacía
     */
    public String getTareasImportantes() {
        int posicion = 0;
        String tareaNumerada = "";
        for (String tarea : tareasPendientes) {
            posicion++;
            if (tarea.toLowerCase().contains("importante")) {
                tareaNumerada = tareaNumerada + (posicion + ". " + tarea) + "\n";
            }
        }
        return tareaNumerada;
    }
    
    /**
     * Metodo imprimirTareasImportantes:
     * Imprime por pantalla todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama (importante)\\n3. Estudiar (Importante)\\n") 
     * siempre que la tarea contenga la palabra "importante"  
     * (que puede aparecer en mayúsculas o en minúsculas). 
     * Si no hay tareas de ese tipo imprime una línea en blanco.
     **/
    public void imprimirTareasImportantes() {
        System.out.println(getTareasImportantes());
    }
    
    /**
     * Metodo getTareasImpares:
     * Devuelve un String con todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama\\n3.Estudiar\\n") siempre que la tarea ocupe una posición
     * impar. Si no hay tareas de ese tipo devuelve la cadena vacía.
     */
    public String getTareasImpares() {
        int posicion = 0;
        String tareaNumerada = "";
        for (String tarea : tareasPendientes) {
            posicion++;
            if (posicion % 2 != 0) {
                tareaNumerada = tareaNumerada + (posicion + ". " + tarea) + "\n";
            }
        }
        return tareaNumerada;
    }
    
    /**
     * Metodo imprimirTareasImpares:
     * Imprime por pantalla todas las tareas pendientes, una en cada línea,
     * precedidas de su posicion (empezando en 1), un punto y un espacio 
     * (por ejemplo: "1. Hacer la cama") siempre que la tarea ocupe una posición
     * impar. Si no hay tareas de ese tipo imprime una línea en blanco.
     */
    public void imprimirTareasImpares() {
        System.out.println(getTareasImpares());
    }
}