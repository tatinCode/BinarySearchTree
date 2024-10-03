
/*
 * 
 * This program implements a Binary Search Tree (BST) that allows the user to 
 * input a string, insert its characters into the tree, and display the tree's 
 * contents in three different traversal orders: pre-order, in-order, and post-order. 
 * Additionally, the user can search for a specific character in the tree.
 * 
 */
import java.util.Scanner; // Import the Scanner class

public class BST {

  // Node class representing each node in the Binary Search Tree (BST)
  public char key; // Character key of the node
  public BST left; // Left child of the node
  public BST right; // Right child of the node

  // Constructor to initialize a node with a character key
  public BST(char c) {
    key = c;
    left = null;
    right = null;
  }

  // Method to find a node with a specific key in the BST
  public static BST find(BST T, char key) {
    if (T == null) // Check if the tree is empty or if it has reached the end
      return null;
    if (T.key == key) // Check if the current node's key matches the search key
      return T;
    else if (key >= T.key) // If the search key is greater, search in the right subtree
      return find(T.right, key);
    else // If the search key is smaller, search in the left subtree
      return find(T.left, key);
  }

  // Method to insert a node with a specific key into the BST
  public static BST insert(BST T, char key) {
    if (T == null) { // Check for the special case where the tree is empty
      T = new BST(key);
      return T;
    }
    if (key == T.key) // Check if it's a duplicate key
      return T; // Return the current node (no insertion needed)
    if (key < T.key) // If the key is smaller, insert into the left subtree
      T.left = insert(T.left, key);
    else // If the key is greater, insert into the right subtree
      T.right = insert(T.right, key);
    return T;
  }

  // Method to perform pre-order traversal of the BST
  public static void preOrder(BST T) {
    if (T == null) // Check if the tree is empty or if it has reached the end
      return;
    System.out.print(T.key); // Print the current node's key
    preOrder(T.left); // Traverse the left subtree
    preOrder(T.right); // Traverse the right subtree
  }

  // Method to perform in-order traversal of the BST
  public static void inOrder(BST T) {
    if (T == null) // Check if the tree is empty or if it has reached the end
      return;
    inOrder(T.left); // Traverse the left subtree
    System.out.print(T.key); // Print the current node's key
    inOrder(T.right); // Traverse the right subtree
  }

  // Method to perform post-order traversal of the BST
  public static void postOrder(BST T) {
    if (T == null) // Check if the tree is empty or if it has reached the end
      return;
    postOrder(T.left); // Traverse the left subtree
    postOrder(T.right); // Traverse the right subtree
    System.out.print(T.key); // Print the current node's key
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Create a Scanner object for input
    BST t = null; // Initialize the BST as empty
    System.out.println("Input: ");
    String stream = input.nextLine(); // Read a line of input
    for (int i = 0; i < stream.length(); i++) // Insert each character into the BST
      t = insert(t, stream.charAt(i));
    System.out.print("Preorder: ");
    preOrder(t); // Perform pre-order traversal and print the result
    System.out.println();
    System.out.print("Inorder: ");
    inOrder(t); // Perform in-order traversal and print the result
    System.out.println();
    System.out.print("Postorder: ");
    postOrder(t); // Perform post-order traversal and print the result
    System.out.println();
    System.out.println("Enter a character to search for: ");
    char c = input.nextLine().charAt(0); // Read a character to search for
    if (find(t, c) == null) // Check if the character is found in the BST
      System.out.println("The character '" + c + "' was not found.");
    else
      System.out.println("The character '" + c + "' was found.");
  }
}
