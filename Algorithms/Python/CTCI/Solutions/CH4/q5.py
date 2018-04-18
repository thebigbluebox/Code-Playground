from DataStructures.BinaryTree import *
from DataStructures.GenerateDataStructures import geneate_bst

def checkIsBst(Tree):
    return __checkIsBst(Tree.getRoot(), Tree.getRoot().get_value(),Tree.getRoot().get_value())

def __checkIsBst(node,min,max):
    value = node.get_value()
    if value < min or value > max:
        return False
    checkLeft = True;
    checkRight = True;
    if node.get_left() is not None:
        checkLeft = __checkIsBst(node.get_left(),node.get_left().get_value(),value)
    if node.get_right() is not None:
        checkRight = __checkIsBst(node.get_right(),value,node.get_right().get_value())
    if checkLeft is False or checkRight is False:
        return False
    else:
        return True

bst = geneate_bst()
# bst.getRoot().get_left().set_value(99)

print(checkIsBst(bst))