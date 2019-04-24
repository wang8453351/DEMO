package TreeModel;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author demo
 *  @see
 *  For JTree("DefaultMutableTreeNode") : set allows children true , doesn't work except add child node
 *  For JTree("DefaultTreeModel") : it is normal to use it. Line41
 */

public class TreeSelection extends JFrame {

    public TreeSelection() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,510,375);
        this.setTitle("TreeSelection");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("D: ");
        DefaultMutableTreeNode nodeFirstA = new DefaultMutableTreeNode("Picture",true);
        DefaultMutableTreeNode nodeSecondA = new DefaultMutableTreeNode("Music",true);
        DefaultMutableTreeNode nodeFirstB1 = new DefaultMutableTreeNode("wangping",true);
        DefaultMutableTreeNode nodeFirstB2 = new DefaultMutableTreeNode("zhoukai",true);
        DefaultMutableTreeNode nodeFirstC1 = new DefaultMutableTreeNode("zhoukai1",false);
        DefaultMutableTreeNode nodeFirstC2 = new DefaultMutableTreeNode("zhoukai2",false);
        nodeFirstB2.add(nodeFirstC1);
        nodeFirstB2.add(nodeFirstC2);
        nodeFirstA.add(nodeFirstB1);
        nodeFirstA.add(nodeFirstB2);
        root.add(nodeFirstA);
        root.add(nodeSecondA);

        DefaultTreeModel treeModelDefault = new DefaultTreeModel(root,true);
        final JTree treeRoot = new JTree(treeModelDefault);
        this.getContentPane().add(treeRoot,BorderLayout.WEST);



        TreeSelectionModel treeSelectionModel = treeRoot.getSelectionModel();
        treeSelectionModel.setSelectionMode(2);//CONTIGUOUS_TREE_SELECTION;

        treeRoot.addTreeSelectionListener(new TreeSelectionListener() {

            @Override
            public void valueChanged(TreeSelectionEvent e) {
                // TODO Auto-generated method stub
                if(!treeRoot.isSelectionEmpty()) {
                    TreePath[] selectionPaths = treeRoot.getSelectionPaths();

                    for(int i=0;i<selectionPaths.length;i++) {
                        TreePath treePath = selectionPaths[i];
                        System.out.println(treePath);//[D: , Picture, zhoukai, zhoukai1]
                        Object[] path = treePath.getPath();
                        for(int j=0;j<path.length;j++) {
                            DefaultMutableTreeNode node;
                            node = (DefaultMutableTreeNode)path[j];
                            System.out.println(node.getUserObject());
                            String s = node.getUserObject()+(j==(path.length-1)?"":"-->");
                            System.out.print(s);//not println();
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                }

            }
        });


    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeSelection frame = new TreeSelection();
        frame.setVisible(true);

    }

}
