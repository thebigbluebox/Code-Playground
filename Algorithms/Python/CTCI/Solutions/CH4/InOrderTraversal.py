from DataStructures.Tree import *

myTree = Tree()
myTreeNode = TreeNode(10)

myTreeNode.addChildren(TreeNode(11))
myTreeNode.addChildren(TreeNode(12))
newTreeNode = TreeNode(4)
newTreeNode.addChildren(TreeNode(4))
myTreeNode.addChildren(newTreeNode)
myTreeNode.addChildren(TreeNode(13))
print(myTree.getHead().getData)
