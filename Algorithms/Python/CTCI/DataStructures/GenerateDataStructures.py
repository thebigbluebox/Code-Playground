from DataStructures.LinkedList import *
from DataStructures.BinaryTree import *
from random import random
def generate_symmetrical_linkedlist(length):
    linkedlist = UnorderedList()
    for index in range (1, length):
        if index > length/2:
            linkedlist.add(length-index)
        else:
            linkedlist.add(index)
    return linkedlist

def generate_random_linkedlist(length):
    linkedlist = UnorderedList()
    for index in range (1,length):
        linkedlist.add(int(random()*10))
    return linkedlist

def geneate_perfect_bst(levels):
    num_of_nodes = 2**levels - 1
    bst = Tree()
    is_even = False
    for index in range (0,num_of_nodes):
        bst.add(int(num_of_nodes/2))
    return bst


# linkedlist = generate_random_linkedlist(11).head
# while linkedlist is not None:
#     print(linkedlist.getData())
#     linkedlist = linkedlist.getNext()

bst = geneate_perfect_bst(3)
bst.printTree()