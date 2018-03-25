from DataStructures.LinkedList import *
def removeDuplicated(linkedlist):
    current_node = linkedlist.head
    while current_node.getNext() is not None:
        prev_search_node = current_node
        search_node = current_node.getNext()
        while search_node is not None:
            if search_node.getData() == current_node.getData():
                prev_search_node.next = search_node.getNext()
            prev_search_node = search_node
            search_node = search_node.getNext()
        current_node = current_node.getNext()
    return linkedlist


# remove duplicates from the linkedlist
myList = UnorderedList()

myList.add(4)
myList.add(2)
myList.add(1)
myList.add(2)
myList.add(2)
myList.add(2)
myList.add(2)
myList.add(1)
myList.add(7)
myList.add(3)
myList.add(2)

print(myList.head.getNext().getData())

thisNode = myList.head
while thisNode is not None:
    print(thisNode.getData())
    thisNode = thisNode.getNext()
print("halt")
mylist = removeDuplicated(myList)
thisNode = myList.head
while thisNode is not None:
    print(thisNode.getData())
    thisNode = thisNode.getNext()
