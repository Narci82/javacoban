/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacban.thaotactaptin.logic;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author 7480
 */
public class TreeDemoModel implements TreeModel{
    
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;

    public TreeDemoModel() {
        //Khoi tao cay
        rootNode = buildTree("Car & Motor");
        tree = new DefaultTreeModel(rootNode);
    }
    
    private DefaultMutableTreeNode buildTree(String rootName){
        DefaultMutableTreeNode  root = new DefaultMutableTreeNode(rootName);
        //Xay dung cac nut con cho mot diem goc root
        DefaultMutableTreeNode car = new DefaultMutableTreeNode("Car");
        DefaultMutableTreeNode motor = new DefaultMutableTreeNode ("Motor");
        //Dua vao nut root
        root.add(car);
        root.add(motor);
        //Tao cac nut con cho car
        DefaultMutableTreeNode honda = new DefaultMutableTreeNode ("Honda");
        DefaultMutableTreeNode suzuki = new DefaultMutableTreeNode ("Suzuki");
        DefaultMutableTreeNode mazda = new DefaultMutableTreeNode ("Mazda");
        car.add(honda);
        car.add(suzuki);
        car.add(mazda);
        //Tao cac nut con cho Motor
        DefaultMutableTreeNode yamaha = new DefaultMutableTreeNode ("Yamaha");
        DefaultMutableTreeNode toyota = new DefaultMutableTreeNode ("Toyota");
        motor.add(yamaha);
        motor.add(toyota);
        
        //Tra ve root cua cay
        
        return root;
    }

    public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(DefaultMutableTreeNode rootNode) {
        this.rootNode = rootNode;
    }

    
    @Override
    public Object getRoot() {
        return this.rootNode;
    }

    
    @Override
    public Object getChild(Object parent, int index) {
        return tree.getChild(parent, index);
    }

    @Override
    public int getChildCount(Object parent) {
        return tree.getChildCount(parent);
    }

    @Override
    public boolean isLeaf(Object node) {
        return tree.isLeaf(node);
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        tree.valueForPathChanged(path, newValue);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        tree.removeTreeModelListener(l);
    }
    
}
