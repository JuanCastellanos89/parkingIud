
package com.iud.datos;

import java.util.ArrayList;

/**
 *
 * @author Berserk
 */
public interface OperacionesSql {
    public boolean insertar (Object obj);
    public boolean eliminar (Object obj);
    public boolean modificar (Object obj);
    public ArrayList<Object[]> consultar();
    
    
}
