
/**
 * 
 * @author1 Apellido1 Apellido2, Nombre
 * @expediente1 12345678
 * @author2 Apellido3 Apellido4, Nombre
 * @expediente2 87654321
 * @date 2024-05-10
 *
 */


public class Lista <T> {

	private T[] contenedor;
	private int longitud;

	public Lista() {
		contenedor = (T[]) new Object[4];
		longitud = 0; //cuantos elementos hay dentro
	}

	// te copia la lista que le pasas, hace una copia
	public Lista(Lista<T> lista) {
		contenedor = (T[]) new Object[lista.contenedor.length];
		for (int i = 0; i < lista.longitud; i++)
			contenedor[i] = lista.contenedor[i];
		longitud = lista.longitud;
	}

	//get longitud, es orden constante
	public int longitud() {
		return longitud;
	}

	//equivale a los corchetes en el array
	public boolean esVacia() {
		return longitud == 0;
	}

	public T consultar(int pos) {
		return contenedor[pos - 1];
	}

	public int buscar(T elem) {
		int i = 0;
		while (i < longitud && !contenedor[i].equals(elem))
			i++;
		if (i == longitud)
			return 0;
		else
			return i + 1;
	}

	//inserta en la posicion que queramos y ademas si nos quedamos sin espacios
	// nos duplica el array con el doble de posiciones y lo traslada
	public void insertar(int pos, T elem) {
		if (longitud == contenedor.length) {
			T[] contAux = (T[]) new Object[contenedor.length * 2];
			for (int i = 0; i < contenedor.length; i++)
				contAux[i] = contenedor[i];
			contenedor = contAux;
		}
		int posArray = pos - 1;
		for (int i = longitud; i > posArray; i--)
			contenedor[i] = contenedor[i - 1];
		contenedor[posArray] = elem;
		longitud++;
	}

	public void borrar(int pos) {
		for (int i = pos - 1; i < longitud-1; i++)
			contenedor[i] = contenedor[i + 1];
		longitud--;
	}

	public void modificar(int pos, T elem) {
		contenedor[pos - 1] = elem;
	}
	
	public String toString(){
		if (longitud() == 0)
			return "";
		
		String texto = consultar(1).toString();
		for (int i = 2; i <= longitud(); i++)
			texto += " | " + consultar(i).toString();
		return texto;
	}

	public static void main(String args[]) {

		Lista<Character> lChar = new Lista<Character>();
		for (int i = 0; i < 4; i++)
			lChar.insertar(i + 1, (char) ('a' + i));

		for (int i = 0; i < 4; i++)
			System.out.println(lChar.consultar(i + 1));
		System.out.println("=========================================");

		
		lChar.borrar(2);
		
		for (int i = 0; i < 4; i++)
			lChar.insertar(1, (char) ('a' + i));

		for (int i = 0; i < lChar.longitud(); i++)
			System.out.println(lChar.consultar(i + 1));
		System.out.println("=========================================");
		
		lChar.borrar(3);
		lChar.borrar(1);
		lChar.borrar(lChar.longitud());
		for (int i = 0; i < lChar.longitud(); i++)
			System.out.println(lChar.consultar(i + 1));
		System.out.println("=========================================");
		
	}


}