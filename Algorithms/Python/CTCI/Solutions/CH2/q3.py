from DataStructures.LinkedList import *
# This is suppose to return kth to last
def deleteMiddleNode(linkedlist):
    end_pointer = linkedlist.head
    # Tracks the end of the linkedlist
    delete_pointer = linkedlist.head
    # Tracks the middle of the list
    middle_pointer = delete_pointer

    middle_pointer = middle_pointer.getNext()
    end_pointer = end_pointer.getNext().getNext()
    while middle_pointer.getNext() is not None:
        delete_pointer = delete_pointer.getNext()
        middle_pointer = middle_pointer.getNext()
        if end_pointer.getNext() is not None and  end_pointer.getNext().getNext() is not None:
            end_pointer = end_pointer.getNext().getNext()
        else:
            delete_pointer.next = middle_pointer.getNext()
            return linkedlist

myList = UnorderedList()
myList.add(1)
myList.add(2)
myList.add(3)
myList.add(4)
myList.add(5)
myList.add(6)
myList.add(7)
myList.add(8)
myList.add(9)
myList.add(10)
myList.add(11)

print(myList.head.getNext().getData())

thisNode = myList.head
while thisNode is not None:
    print(thisNode.getData())
    thisNode = thisNode.getNext()
print("halt")
myList = deleteMiddleNode(myList)
thisNode = myList.head
while thisNode is not None:
    print(thisNode.getData())
    thisNode = thisNode.getNext()
