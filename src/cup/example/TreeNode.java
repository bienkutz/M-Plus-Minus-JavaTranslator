package cup.example;

import java.util.ArrayList;

public class TreeNode {

    private String nodeInfo;
    private ArrayList<TreeNode> children = new ArrayList<>();

    public TreeNode(String nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public String getNodeInfo() {
        return nodeInfo;
    }

    public void addChild(TreeNode child) {
        if (child != null) {
            children.add(child);
        }
    }

    public TreeNode[] getChildren() {
        return children.toArray(new TreeNode[0]);
    }

    @Override
    public String toString() {
        return nodeInfo;
    }
}
