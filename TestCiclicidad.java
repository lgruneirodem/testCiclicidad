
public class TestCiclicidad {

	public <Clave, InfoVertice, Coste> boolean testCiclos (Grafo<Clave, InfoVertice, Coste> grafo) {
		if(!grafo.esVacio()) {
			boolean ciclos = false;
			Lista <Par<Clave,Clave>> aristas=grafo.listaAristas();
			int contador=1;
			while(contador<=aristas.longitud() && ciclos==false) {
				if(aristas.consultar(contador).getAtributo()==aristas.consultar(contador).getValor()) {
					ciclos=true;
				}
			}
			return ciclos;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
