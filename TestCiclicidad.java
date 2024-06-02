
import java.util.ArrayList;
import Practica4.Grafo;


/**
 * 
 * @author1 Apellido1 Apellido2, Nombre
 * @expediente1 12345678
 * @author2 Apellido3 Apellido4, Nombre
 * @expediente2 87654321
 * @date 2024-05-10
 *
 */



public class TestCiclicidad <Clave, InforVertice, Coste> {
	
	public boolean testCiclos(Grafo<Clave, InforVertice, Coste> grafo) {
		
		for(int i=0 ;i < grafo.numVertices();i++) {
			if(tieneCiclo(grafo,grafo.listaVertices().consultar(i), visitados,actual)){
				return false;
			}
		}
		
		return true;
	}
	
	private boolean tieneCiclo(Grafo<Clave, InfoVertice, Coste> grafo, Clave v, ArrayList<Clave> visitados, ArrayList<Clave> actual) {
		if (actual.contains(v)) {
			return true;
		}
		if (visitados.contains(v)) {
			return false;
		}

		actual.remove(v);
		return false;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
