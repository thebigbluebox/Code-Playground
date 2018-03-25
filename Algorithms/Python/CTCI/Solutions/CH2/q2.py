from DataStructures.LinkedList import *
# This is suppose to return kth to last
def get_kth_last(linkedlist, k):
    # This will track the last kth element
    first_pointer = linkedlist.head
    # This will track the end of the list
    second_pointer = linkedlist.head
    for x in range(0, k-1):
        second_pointer = second_pointer.getNext()
        if second_pointer is None:
            return first_pointer

    while second_pointer.getNext() is not None:
        second_pointer = second_pointer.getNext()
        first_pointer = first_pointer.getNext()
    return first_pointer

myList = UnorderedList()
myList.add(4)
myList.add(2)
myList.add(1)
myList.add(99)
myList.add(98)
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
element = get_kth_last(myList,4)
print(element.getData())
