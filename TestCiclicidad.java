
public class TestCiclicidad {

	public <Clave, InfoVertice, Coste> boolean testCiclos (Grafo<Clave, InfoVertice, Coste> grafo) {
		if(!grafo.esVacio()) {
			boolean ciclos = false;
			Lista <Par<Clave,Clave>> aristas=grafo.listaAristas();
			int contador=1;
			while(contador<=aristas.longitud() && ciclos==false) {
				//System.out.println(aristas.consultar(contador).getAtributo() + " "+aristas.consultar(contador).getValor());
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
		TestCiclicidad tc=new TestCiclicidad();
		
		gPrueba.insertarVertice("A", "A");
		gPrueba.insertarVertice("B", "B");
		gPrueba.insertarVertice("C", "C");
		
		gPrueba.insertarArista("A", "B", 1);
		gPrueba.insertarArista("A", "C", 1);
		gPrueba.insertarArista("B", "B", 1);//B a A
		gPrueba.insertarArista("C", "B", 1);
		
		System.out.println(gPrueba);

		

		
		//Grafo2
		Grafo <String, String, Integer> g2 = new Grafo<String, String, Integer>();
		
		g2.insertarVertice("A", "A");
		g2.insertarVertice("B", "B");
		g2.insertarVertice("C", "C");
		
		g2.insertarArista("A", "B", 1);
		g2.insertarArista("A", "C", 1);
		g2.insertarArista("B", "A", 1);//B a A
		g2.insertarArista("C", "B", 1);
		
		System.out.println(g2);

		
		System.out.println(tc.testCiclos(gPrueba));
		System.out.println(tc.testCiclos(g2));
		
		System.out.println("*** FIN ***");

	}

}
