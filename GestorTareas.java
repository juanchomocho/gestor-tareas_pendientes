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
}