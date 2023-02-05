import java.util.*;
import java.io.*;

class Graph{
	// Graph definition
	private int mat[][]; 
	
	Graph(int v){
		mat = new int[v][v];
		for(int i=0; i<v; i++)
		{
			for(int j=0; j<v; j++)
			{
				mat[i][j] = 0;
			}
		}
	
	}

	public void addEdge(int u, int v){
		mat[u][v] = 1;
	}

	public void print_graph(){
		int v = mat.length;
		for(int i=0; i<v; i++){
			System.out.print(i + " ->");
			for(int j=0; j<v; j++)
			{
				if(mat[i][j] == 1)
					System.out.print(" "+ j);
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