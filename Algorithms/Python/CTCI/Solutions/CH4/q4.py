from DataStructures.GenerateDataStructures import geneate_bst
import math
def checkBalance(tree):
    if __checkBalance(tree.getRoot(),0) > -1:
        return True
    return False


def __checkBalance(node, level):
    if(node.get_left() != None and node.get_right() != None):
        l = __checkBalance(node.get_left(), level + 1)
        r = __checkBalance(node.get_right(), level + 1)
        if(l == -1 or r == -1):
            return -1
        result = math.fabs(l-r)
        if result == 0:
            return r
        if result == 1:
            if l < r:
                return l
            else:
                return r
        if result > 1:
            return -1
    if(node.get_left() != None):
        l = __checkBalance(node.get_left(), level + 1)
        return l
    if (node.get_right() != None):
        r = __checkBalance(node.get_right(), level + 1)
        return r

    if(node.get_left() == None and node.get_right() == None):
        return level

bst = geneate_bst()

print(checkBalance(bst))