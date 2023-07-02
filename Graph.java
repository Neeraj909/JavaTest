package java8features;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList=new HashMap<>();
    public boolean adVertex(String vertex){
        if(adjList.get(vertex)==null){
            adjList.put(vertex,new ArrayList<String>());
            return true;
        }
       return false;

    }
    public void printGraph(){
        System.out.println(adjList);
    }
    public boolean adEdge(String vertex1,String vertex2){
        if(adjList.get(vertex1)!=null && adjList.get(vertex2)!=null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;

    }
    public boolean removeEdge(String vertex1,String vertex2){
        if(adjList.get(vertex1)!=null && adjList.get(vertex2)!=null){
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return  false;

    }
    public boolean removeVertex(String vertex){
        if(adjList.get(vertex)==null)
            return false;
        else{
            for(String otherVertex:adjList.get(vertex)){
                adjList.get(otherVertex).remove(vertex);
            }
            adjList.remove(vertex);
            return true;
        }
    }

    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.adVertex("A");
        graph.adVertex("B");
        graph.adVertex("C");
        graph.printGraph();
        graph.adEdge("A","B");
        graph.adEdge("A","C");
        graph.printGraph();
        graph.adEdge("B","C");
        graph.printGraph();
        graph.removeEdge("A","B");
        graph.printGraph();
        graph.removeVertex("B");
        graph.printGraph();


    }
}
