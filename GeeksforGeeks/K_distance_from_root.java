/* Link - https://www.geeksforgeeks.org/problems/k-distance-from-root/1 */

class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
          ArrayList<Integer> list = new ArrayList<>();
          solution(root, list, k, 0);
          return list;
     }
     void solution(Node root, ArrayList<Integer> list, int k, int n){
         if (root == null) return;
         if (k == n) {
             list.add(root.data);
             return;
         }
         solution(root.left, list, k, n+1);
         solution(root.right, list, k, n+1);
     }
}
