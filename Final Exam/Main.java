import java.util.Random;
public class Main {
   public static void main(String[] args) {
      Graph newGraph = new Graph(5);
     // Random number = new Random();
      
     // for( int i = 0; i < newGraph.length; i++) {
         
    //  }
      
      Node v0 = new Node(50);
      Node v1 = new Node(60);
      Node v2 = new Node(70);
      Node v3 = new Node(80);
      Node v4 = new Node(90);
      
      newGraph.insertVertex(0, v0);
      newGraph.insertVertex(1, v1);
      newGraph.insertVertex(2, v2);
      newGraph.insertVertex(3, v3);
      newGraph.insertVertex(4, v4);
      
      newGraph.insertEdge(0,1);
      newGraph.insertEdge(0,3);
      newGraph.insertEdge(0,4);
      newGraph.insertEdge(1,0);
      newGraph.insertEdge(1,2);
      newGraph.insertEdge(1,3);
      newGraph.insertEdge(2,1);
      newGraph.insertEdge(3,0);
      newGraph.insertEdge(3,1);
      newGraph.insertEdge(3,4);
      newGraph.insertEdge(4,0);
      newGraph.insertEdge(4,3);
      
      //System.out.println("DFT of the graph starting at Vertex 3 (80)");
      //newGraph.DFT(3);
      System.out.println("BFT of the graph starting at Vertex 3 (80)");
      newGraph.BFT(3);
      
      /*for (int i = 0; i < 5; i++) {
         newGraph.showVertex(i);
         System.out.println("It's vertices are: ");
         newGraph.showEdges(i);
      }*/
      
   }//end of main method
}//End of class Main