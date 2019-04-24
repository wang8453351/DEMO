package TreeModel;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author demo
 * @see use construct function and tree model to create three trees
 * just a simple example
 *
 * JTree("DefaultMutableTreeNode")
 * JTree("DefaultTreeModel")
 */
public class SimpleTree extends JFrame{

    public SimpleTree() {

        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,510,375);
        this.setTitle("TreeModel");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("RootNode");
        DefaultMutableTreeNode nodeFirst = new DefaultMutableTreeNode("FirstA_Node");
        root.add(nodeFirst);
        DefaultMutableTreeNode nodeSecond = new DefaultMutableTreeNode("Second_Node",false);
        nodeFirst.add(nodeSecond);
        root.add(new DefaultMutableTreeNode("FirstB_Node"));
        JTree treeRoot = new JTree(root);
        this.getContentPane().add(treeRoot,BorderLayout.WEST);

        DefaultTreeModel treeModelDefault = new DefaultTreeModel(root);
        JTree treeDefault = new JTree(treeModelDefault);
        this.getContentPane().add(treeDefault,BorderLayout.CENTER);

        DefaultTreeModel treeModelPointed = new DefaultTreeModel(root,true);
        JTree treePointed = new JTree(treeModelPointed);
        this.getContentPane().add(treePointed,BorderLayout.EAST);
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        SimpleTree frame = new SimpleTree();
        frame.setVisible(true);
    }

}
