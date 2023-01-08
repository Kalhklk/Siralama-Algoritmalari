 class Yigit{
    private int maxSIZE=100;
    private int[] st;
    private int top;

    public Yigit() {
        st=new int[maxSIZE];
        top=-1;
    }
    public void push(int j){
        st[++top]=j;
    }
    public int pop(){
        return st[top--];
    }
    public int peek(){
        return st[top];
        
    }
    public boolean isEmpty(){
        return top==-1;
    }
    
    
 }
class Vertex{
    public char label;
    public boolean wasVisited;

    public Vertex(char lab) {
        label=lab;
        wasVisited=false;
        
    }
    
}
public class GraphMain {
  
	public String dijiktra = "";
    int[][] komsuluk; //Komşuluk matrisi
    int N; // Düğüm sayısı
    public Vertex dugumListesi[];
    public int dugumSayisi;
    public int ziyaret[];
    Yigit y;
    public GraphMain(int N) {
        int i,j;
        this.N=N;
        komsuluk=new int[N][N];
        dugumListesi=new Vertex[N];
        ziyaret=new int[N];
        y=new Yigit();
        for (int k = 0; k < N; k++) {
            for (int l = 0; l < N; l++) {
                komsuluk[k][l]=0;
            }
        }
    }
    void addEdge(int bas,int bitis,int agirlik){
        komsuluk[bas][bitis]=agirlik;
        komsuluk[bitis][bas]=agirlik;
    }
    public void addVertex(char etiket){
       dugumListesi[dugumSayisi++]=new Vertex(etiket);
       
    }
    void dfsGez(int Edge){
        int v=Edge;
        System.out.println(v);
        ziyaret[v]=1;
        while (komsuBul(v)!=-1 || !y.isEmpty()) {            
            if (komsuBul(v)!=-1) {
                y.push(v);
                v=komsuBul(v);
                ziyaret[v]=1;
                System.out.println(v);
            }else{
                v=y.pop();
            }
        }
        
        
    }
    public void displayVertex(int v){
        System.out.println(dugumListesi[v].label);
    }
    int komsuBul(int dugum) {
        for (int i = N-1; i >=0; i--) {
            if (komsuluk[dugum][i]!=0 && ziyaret[i]==0) {
                return i;
            }
        }
        return -1;
   }
      static final int V = 9;
  int minDistance(int[] dist, boolean[] sptSet) {
    int min = Integer.MAX_VALUE, min_index = -1;

    for (int v = 0; v < V; v++)
      if (!sptSet[v] && dist[v] <= min) {
        min = dist[v];
        min_index = v;
      }

    return min_index;
  }

  void dijkstra(int[][] graph, int src) {
    int[] dist = new int[V];

    boolean[] sptSet = new boolean[V];

    for (int i = 0; i < V; i++) {
      dist[i] = Integer.MAX_VALUE;
      sptSet[i] = false;
    }

    dist[src] = 0;

    for (int count = 0; count < V - 1; count++) {
      int u = minDistance(dist, sptSet);

      sptSet[u] = true;

      for (int v = 0; v < V; v++)

        if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE
            && dist[u] + graph[u][v] < dist[v])
          dist[v] = dist[u] + graph[u][v];
    }

    printSolution(dist);
  }

  void printSolution(int[] dist) {
	   String satir = "";

    System.out.println("Vertex   Distance from Source");
    for (int i = 0; i < V; i++) {
      System.out.println(i + " " + dist[i]);
  		satir = i + " " + dist[i];
    }
    	dijiktra += satir + "\n";
  }
}