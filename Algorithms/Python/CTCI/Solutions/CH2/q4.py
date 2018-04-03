from DataStructures.LinkedList import *
def partitionLinkedList(linkedlist, partition):
    node = linkedlist.head
    head = linkedlist.head
    tail = linkedlist.head

    while node is not None:
        next = node.next
        if node.data > partition:
            node.next = head
            head = node
        else:
            tail.next = node
            tail = node
        node = next
    tail.next = None

    return head


myList = UnorderedList()
myList.add(1)
myList.add(5)
myList.add(2)
myList.add(3)
myList.add(9)
myList.add(5)
myList.add(10)
myList.add(11)
myList.add(4)
myList.add(5)
myList.add(6)
myList.add(5)
myList.add(7)
myList.add(8)


print(myList.head.getNext().getData())

thisNode = myList.head
while thisNode is not None:
    print(thisNode.getData())
    thisNode = thisNode.getNext()
print("halt")
myList = partitionLinkedList(myList, 5)

while myList is not None:
    print(myList.getData())
    myList = myList.getNext()
