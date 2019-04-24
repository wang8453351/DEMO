package TreeModel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.ExpandVetoException;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class MaintainTreeModel extends JFrame{

    public MaintainTreeModel() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,510,375);
        this.setTitle("ADVANTEST");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("SA");
        DefaultMutableTreeNode FirstLevel = new DefaultMutableTreeNode("RF",true);
        DefaultMutableTreeNode SecondLevel = new DefaultMutableTreeNode("Consume",true);
        DefaultMutableTreeNode ThirdLevel = new DefaultMutableTreeNode("Network",true);
        DefaultMutableTreeNode FourthLevel =new DefaultMutableTreeNode("HighSpeed",true);

        DefaultMutableTreeNode FirstLevel_node1=new DefaultMutableTreeNode("WangPing",true);
        DefaultMutableTreeNode FirstLevel_node2=new DefaultMutableTreeNode("Lee",true);
        FirstLevel.add(FirstLevel_node1); FirstLevel.add(FirstLevel_node2);

        root.add(FirstLevel);
        root.add(SecondLevel);
        root.add(ThirdLevel);
        root.add(FourthLevel);

        final DefaultTreeModel treeModelDefault = new DefaultTreeModel(root,true);
        final JTree treeRoot = new JTree(treeModelDefault);
        this.getContentPane().add(treeRoot,BorderLayout.CENTER);
        TreeSelectionModel treeSelectionmodel = treeRoot.getSelectionModel();
        treeSelectionmodel.setSelectionMode(1);

        JPanel jp = new JPanel();
        JLabel jl = new JLabel("Name: ");
        final JTextField jtf = new JTextField("Demo");
        JButton jb1 = new JButton("ADD");
        JButton jb2 = new JButton("MOD");
        JButton jb3 = new JButton("DEL");
        jp.add(jl);jp.add(jtf);jp.add(jb1);jp.add(jb2);jp.add(jb3);
        this.getContentPane().add(jp,BorderLayout.SOUTH);

        jb1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(jtf.getText());
                TreePath selectionPath = treeRoot.getSelectionPath();
                DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode)selectionPath.getLastPathComponent();
                treeModelDefault.insertNodeInto(node, parentNode, parentNode.getChildCount());

                TreePath path = selectionPath.pathByAddingChild(node);
                if(!treeRoot.isVisible(path)) {
                    treeRoot.makeVisible(path);
                }
            }
        });
        jb2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                TreePath selectionPath = treeRoot.getSelectionPath();
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)selectionPath.getLastPathComponent();
                node.setUserObject(jtf.getText());
                treeModelDefault.nodeChanged(node);
                treeRoot.setSelectionPath(selectionPath);//any effects? or just update nodeModel path

            }
        });

        jb3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                DefaultMutableTreeNode node =(DefaultMutableTreeNode)treeRoot.getLastSelectedPathComponent();
                if(!node.isRoot()) {
                    DefaultMutableTreeNode nextSelectionNode = node.getNextSibling();//brother and sister node
                    if(nextSelectionNode == null) {
                        nextSelectionNode=(DefaultMutableTreeNode)node.getParent();
                        treeModelDefault.removeNodeFromParent(node);
                        treeRoot.setSelectionPath(new TreePath(nextSelectionNode.getPath()));
                    }
                }
            }
        });


        treeRoot.addTreeWillExpandListener(new TreeWillExpandListener() {

            @Override
            public void treeWillExpand(TreeExpansionEvent event) throws ExpandVetoException {
                // TODO Auto-generated method stub
                TreePath path = event.getPath();
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)path.getLastPathComponent();
                System.out.println("Node : "+node+" will be expanded!!!");

            }

            @Override
            public void treeWillCollapse(TreeExpansionEvent event) throws ExpandVetoException {
                // TODO Auto-generated method stub
                TreePath path = event.getPath();
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)path.getLastPathComponent();
                System.out.println("Node : "+node+" will be collapse!!!");
            }
        });

        treeRoot.addTreeExpansionListener(new TreeExpansionListener() {

            @Override
            public void treeExpanded(TreeExpansionEvent event) {
                // TODO Auto-generated method stub
                TreePath path = event.getPath();
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)path.getLastPathComponent();
                System.out.println("Node : "+node+" has been expanded!!!");
                System.out.println();

            }

            @Override
            public void treeCollapsed(TreeExpansionEvent event) {
                // TODO Auto-generated method stub
                TreePath path = event.getPath();
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)path.getLastPathComponent();
                System.out.println("Node : "+node+" has been collased!!!");
            }
        });


    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MaintainTreeModel frame = new MaintainTreeModel();
        frame.setVisible(true);

    }

}
