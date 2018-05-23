from DataStructures.LinkedList import *


def detect_loop(list):
    rabbit = list.head
    turtle = list.head
    if rabbit.getNext() is None:
        return None
    continue_loop = True
    while rabbit.getNext().getNext() is not None and continue_loop:
        if rabbit.getNext() is None or rabbit.getNext().getNext() is None:
            return None
        if rabbit is turtle:
            continue_loop = False
        else:
            rabbit = rabbit.getNext().getNext()
            turtle = turtle.getNext()
    turtle = list.head
    while turtle is not rabbit:
        rabbit = rabbit.getNext()
        turtle = turtle.getNext()
    return rabbit


myList = UnorderedList()
myList.add(1)
myList.add(2)
myList.add(3)
myList.add(4)
myList.add(5)
myList.add(6)

# Add the circular reference at number 3
ref = myList.head
while ref.getNext() is not None:
    ref = ref.getNext()
ref.setNext(myList.head.getNext().getNext())
loop_start = detect_loop(myList)

print(loop_start.getData())
