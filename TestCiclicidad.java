
public class TestCiclicidad {

	public static <Clave, InfoVertice, Coste> boolean testCiclos (Grafo<Clave, InfoVertice, Coste> grafo) {
		if(!grafo.esVacio()) {
			boolean ciclos = false;
			Lista <Par<Clave,Clave>> aristas=grafo.listaAristas();
			int contador=1;
			while(contador<=aristas.longitud() && ciclos==false) {
				System.out.println(aristas.consultar(contador).getAtributo() + " "+aristas.consultar(contador).getValor());
				if(aristas.consultar(contador).getAtributo()==aristas.consultar(contador).getValor()) {
					ciclos=true;
				}
				contador ++;
			}
			return ciclos;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grafo <String, String, Integer> gPrueba = new Grafo<String, String, Integer>();
		
		gPrueba.insertarVertice("A", "A");
		gPrueba.insertarVertice("B", "B");
		gPrueba.insertarVertice("C", "C");
		
		gPrueba.insertarArista("A", "B", 1);
		gPrueba.insertarArista("A", "C", 1);
		gPrueba.insertarArista("B", "B", 1);//B a A
		gPrueba.insertarArista("C", "B", 1);
		
		System.out.println(gPrueba);
		System.out.println("Grado salida A: " + gPrueba.gradoSalida("A"));
		System.out.println("Grado salida B: " + gPrueba.gradoSalida("B"));
		System.out.println("Grado salida C: " + gPrueba.gradoSalida("C"));
		System.out.println("Grado entrada A: " + gPrueba.gradoEntrada("A"));
		System.out.println("Grado entrada B: " + gPrueba.gradoEntrada("B"));
		System.out.println("Grado entrada C: " + gPrueba.gradoEntrada("C"));
		
		//gPrueba.eliminarVertice("C");
		//gPrueba.eliminarVertice("B");
		//gPrueba.eliminarVertice("A");
		//gPrueba.eliminarArista("A", "C");		
		
		System.out.println(gPrueba);
		System.out.println("Grado salida A: " + gPrueba.gradoSalida("A"));
		System.out.println("Grado salida B: " + gPrueba.gradoSalida("B"));
		System.out.println("Grado salida C: " + gPrueba.gradoSalida("C"));
		System.out.println("Grado entrada A: " + gPrueba.gradoEntrada("A"));
		System.out.println("Grado entrada B: " + gPrueba.gradoEntrada("B"));
		System.out.println("Grado entrada C: " + gPrueba.gradoEntrada("C"));
		
		System.out.println(testCiclos(gPrueba));
		
		System.out.println("*** FIN ***");

	}

}
