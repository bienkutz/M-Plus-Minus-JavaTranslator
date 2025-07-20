package cup.example;

public class TreeNodePrinter {

    private TreeNode node;

    public TreeNodePrinter(TreeNode node) {
        this.node = node;
    }

    public void print() {
        printLevel(node, 0);
    }

    private void printLevel(TreeNode currentNode, int level) {
        if (currentNode == null)
            return;

        // Indentation for current level
        for (int i = 0; i < level; i++)
            System.out.print(" ");
        
        // Print current node information
        System.out.println(currentNode.getNodeInfo());

        // Recursively print children
        TreeNode[] children = currentNode.getChildren();
        for (int i = 0; i < children.length; i++) {
            printLevel(children[i], level + 1);
        }
    }
}
