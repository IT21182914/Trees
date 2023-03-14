
public class Tree {

  private Node root; // first node of tree

  public Tree() {
    root = null;
  }

  public void insert(String name, int empNo) {
    Node newNode = new Node("Kasun", 21);
    newNode.empNo = empNo;
    newNode.name = name;
    if (root == null) { // no node in root
      root = newNode;

    } else // root occupied
    {
      Node current = root; // start at root
      Node parent;
      while (true) {
        parent = current;

        if (empNo < current.empNo) // go left
        {
          current = current.leftChild;
          if (current == null) {
            parent.leftChild = newNode;
            return;
          }
        } else // go right
        {
          current = current.rightChild;
          if (current == null) {
            parent.rightChild = newNode;
            return;
          }
        }
      }
    }
  }

  private void inOrder(Node localRoot) // left root right
  {
    if (localRoot != null) {
      inOrder(localRoot.leftChild);
      localRoot.displayNode();
      inOrder(localRoot.rightChild);
    }
  }

  private void preOrder(Node localRoot) // root left right
  {
    if (localRoot != null) {
      localRoot.displayNode();
      preOrder(localRoot.leftChild);
      preOrder(localRoot.rightChild);
    }
  }

  private void postOrder(Node localRoot) // left right root
  {
    if (localRoot != null) {
      postOrder(localRoot.leftChild);
      postOrder(localRoot.rightChild);
      localRoot.displayNode();
    }
  }

  public void TraversepostOrder() {

    postOrder(root);

  }

  private Node findRescursive(Node localRoot, int empNo) {

    if (localRoot == null) {

      return null;

    } else if (localRoot.empNo == empNo) {

      System.out.println(localRoot.name);
      return localRoot;

    }

    else if (empNo < localRoot.empNo) {

      return findRescursive(localRoot.leftChild, empNo);

    }

    else {

      return findRescursive(localRoot.rightChild, empNo);

    }

  }

  public Node find(int empNo) {
    Node current = root;
    while (current.empNo != empNo) {
      if (empNo < current.empNo)
        current = current.leftChild;
      else
        current = current.rightChild;
      if (current == null)
        return null;
    }

    System.out.println("Emplyoo name: " + current.name);
    return current;
  }

  public void deleteAll() {

    root = null;

  }

}
