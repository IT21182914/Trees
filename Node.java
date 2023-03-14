
public class Node {

  public String name;
  public int empNo;

  public Node leftChild;
  public Node rightChild;

  public Node(String name, int empNo) {

    this.name = name;
    this.empNo = empNo;

  }

  public void displayNode() {

    System.out.println("Employee number: " + empNo + " Name: " + name);

  }

}
