/**
 * @author: Ing. Noé Vásquez Godínez
 * @email: noe-vg@outlook.com
 * @about: Clase para implementar Dijkstra's algorithm
 */
class AlgoritmoDJ{
    /**
     * @about:
     * En este metodo se iniciara sel setup del algoritmo
     */
    public void init(){
        this.start();
    }
    /**@about: 
     * En este metodo se incia el algoritmo
     */
    private void start(){
        System.out.println("[OK] starting . . .");
        import java.util.*;
class DJ{
	public  int distan[] = new int[10];
	public  int valor[][] = new int[10][10]; 
	public void calc(int n,int s){
	  int bandera[] = new int[n+1];
	  int i,minP=1,k,c,minimum;
	  for(i=1;i<=n;i++)
	  {  
		bandera[i]=0; 
		this.distan[i]=this.valor[s][i]; 
	  }
	  c=2;
	  while(c<=n)
	  {
		minimum=99;
		for(k=1;k<=n;k++){ 
			if(this.distan[k]<minimum && bandera[k]!=1){
			minimum=this.distan[i];
			minP=k;
		   }
		} 
		  bandera[minP]=1;
		  c++;
			for(k=1;k<=n;k++){
				if(this.distan[minP]+this.valor[minP][k] <  this.distan[k] && bandera[k]!=1 )
					this.distan[k]=this.distan[minP]+this.valor[minpos][k];
			}   
		}
	}
	
 public static void main(String args[]){
	int nodos,origen,i,j;
	Scanner in = new Scanner(System.in);
	System.out.print("Cuantos nodos?: ");
	nodos = in.nextInt();
	Dijkstra d = new Dijkstra();
	System.out.println("Inserta las distancias dejando espacios entre si: ");
        for(i=1;i<=nodos;i++){
          for(j=1;j<=nodos;j++){
            d.valor[i][j]=in.nextInt();
            if(d.valor[i][j]==0)
              d.valor[i][j]=999;
			}
		}
  System.out.println("Cual es el nodo de origen?: ");
  origen=in.nextInt();
  d.calc(nodos,origen);
        for(i=1;i<=nodos;i++)
          if(i!=origen)
  System.out.println("\t\nEste es el origen:"+origen+"\t\n El destino es:"+i+"\t\n Camino minimo :"+d.distan[i]+"\t");
	} 
}
        
    
    } 
    public static void main(String[] args) {
        AlgoritmoDJ algoritmoDJ = new AlgoritmoDJ();
        algoritmoDJ.init();
    }
}