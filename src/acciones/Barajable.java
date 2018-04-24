package acciones;

import java.util.ArrayList;
import java.util.Stack;

public interface Barajable<T> {

	/**
	 * Desordena los elementos de la lista.
	 */
	public void barajar();

	/**
	 * vuelca las pilas en una lisa auxiliar
	 */
	public void volcarPilasEnLista();
	
	/**
	 * vualca la lista dummy en las pilas
	 */
	public void volcarListaEnPilas();

}
