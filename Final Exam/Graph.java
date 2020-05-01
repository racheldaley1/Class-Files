import java.util.Stack;
import java.util.*; 
class Graph {

   Node vertex[];
   int edge [][];
   int max, numberOfVertices;
   
   public Graph(int n) {
      vertex = new Node[n];
      edge = new int[n][n];
      max = n;
      numberOfVertices = 0;
   }
   
   public void BFT(int firstVertex) {
      int v;
      LinkedList<Integer> queue = new LinkedList();
      
      for ( int i= 0; i < numberOfVertices; i++) {
         if(vertex[i] != null) {
            vertex[i].setPushed(false);
         }
      }
      queue.add(firstVertex);
      vertex[firstVertex].setPushed(true);
      
      while(queue.size() !=0) {
         v = queue.poll();
         vertex[v].visit();
         
         for (int column = 0; column < numberOfVertices; column++) {
            if(edge[v][column] == 1 && !vertex[column].getPushed()) {
               queue.add(column);
               vertex[column].setPushed(true);
            }//end if
         }//end for
      }// end while
   }// end of BFT method
   
   public void DFT(int firstVertex) {
      int v;
      Stack<Integer> stack = new Stack();
      
      for ( int i= 0; i < numberOfVertices; i++) {
         if(vertex[i] != null) {
            vertex[i].setPushed(false);
         }
      }
      stack.push(firstVertex);
      vertex[firstVertex].setPushed(true);
      
      while(!stack.empty()) {
         v = stack.pop();
         vertex[v].visit();
         
         for (int column = 0; column < numberOfVertices; column++) {
            if(edge[v][column] == 1 && !vertex[column].getPushed()) {
               stack.push(column);
               vertex[column].setPushed(true);
            }//end if
         }//end for
      }// end while
   }// end of DFT method

   
   public boolean insertVertex(int vertexNumber, Node newNode) {
      if(vertexNumber >= max) {
         return false;
      }
      vertex[vertexNumber] = newNode.deepCopy();
      numberOfVertices++;
      return true;
   } // end of insertVertex method
   
   public boolean insertEdge(int fromVertex, int toVertex) {
      if(vertex[fromVertex] == null || vertex[toVertex] == null) {
         return false;
      }
      edge[fromVertex][toVertex] = 1;
      return true;
   }// end of insertEdge method
   
   public void showVertex (int vertexNumber) {
      System.out.println(vertex[vertexNumber]);
   } // end of showVertex method
   
   public void showEdges (int vertexNumber) {
      for(int column = 0; column < numberOfVertices; column++) {
         if(edge[vertexNumber][column] == 1) {
            System.out.println(vertexNumber + "," + column);
         }
      }
   }//end of showEdges method
}// end of class Graph