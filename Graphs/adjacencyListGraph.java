package Graphs;

import java.util.ArrayList;

public class adjacencyListGraph {
    //function to add edge in the list
    static void addEdge(ArrayList<ArrayList<Integer>> aj,int u,int v){
        aj.get(u).add(v);
        aj.get(v).add(u);
    }
    //function to print the graph
    static void print(ArrayList<ArrayList<Integer>> aj){
        for(int i=0;i<aj.size();i++){
            for(int j=0;j<aj.get(i).size();j++){
                System.out.print(aj.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }

   public static void main(String[] args) {
    //number of vertices
       int v=4;
       ArrayList<ArrayList<Integer> >aj=new ArrayList<>();
       //filling the arraylist with the list of arraylist
       for(int i=0;i<v;i++){
            aj.add(new ArrayList<Integer>());
       }
       addEdge(aj, 0, 1);
       addEdge(aj, 0, 2);
       addEdge(aj, 1, 2);
       addEdge(aj, 1, 3);
       print(aj);

   }
    
}
