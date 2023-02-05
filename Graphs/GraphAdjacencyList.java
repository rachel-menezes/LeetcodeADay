import java.util.*;
import java.io.*;

class Graph{
	// Graph definition
	private ArrayList<Integer> adj[]; 
	
	Graph(int v){
		adj = new ArrayList[v];
		for(int i=0; i<v; i++){
			adj[i] = new ArrayList();
		}
	
	}

	public void addEdge(int u, int v){
		adj[u].add(v);
	
	}

	public void print_graph(){
		int v = adj.length;
		for(int i=0; i<v; i++){
			System.out.print(i + " ->");
			Iterator<Integer> itr = adj[i].listIterator();
			while (itr.hasNext()) {
				int n = itr.next();
				System.out.print(" "+ n);
			}
			System.out.println();
		}

	
	}

	
	public static void main(String args[]){
		
		Graph g = new Graph(4);
        g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		g.print_graph();
	}
}