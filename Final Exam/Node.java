public class Node {
   
   private int num;
   boolean pushed;
   
   public Node(int n) {
      num = n;
   }
   
   public String toString(){
      return("Number is " + num);
   }
   
   public Node deepCopy() {
      Node clone = new Node(num);
      return clone;
   }
   
   public boolean getPushed() {
      return pushed;
   }
   
   public void setPushed(boolean value) {
      pushed = value;
   }
   
   public void visit() {
      System.out.println(this);
   }


}//end of class Node