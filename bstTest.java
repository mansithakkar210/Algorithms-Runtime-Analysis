public class bstTest
{

  public static void main(String[] args)
  {
   BST a = new BST();
   int c = a.insert(3);
   System.out.println("count after inserting root= "+c);
   int d =a.insert(17);
   System.out.println("count after inserting 1 element= "+d);
   int e = a.insert(-2);
   System.out.println("count after inserting 2 element= "+e);
   int f = a.insert(0);
   System.out.println("count after inserting 3 element= "+f);
   a.insert(8);
   System.out.println("BST a");
   a.trav();
   BST b = new BST(a);
   System.out.println( "copy of a");
   b.trav();
   b.insert(13);
   System.out.println( "a after inserting into b");
   a.trav();
   System.out.println("b:");
   b.trav();
   BST AA = new BST();
   AA.insert(5);
   AA.insert(-2);
   AA.insert(0);
   AA.insert(3);
   BST BB = new BST();
   BB.insert(113);
   BB.insert(94);
   BB.insert(120);
   BB.insert(100);
   BST CC = BST.CombineBST(AA, BB, 50);
   System.out.println("AA: ");
   AA.trav();
   System.out.println("BB: ");
   BB.trav();
   System.out.println("CC: ");
   CC.trav();


  }
}
