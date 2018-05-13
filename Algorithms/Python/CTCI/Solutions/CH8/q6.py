__tower_one = []
__tower_two = []
__tower_three = []
__tower_of_hanoi = {1: __tower_one, 2: __tower_two, 3: __tower_three}


def set_new_tower_of_hanoi(discs):
    __tower_of_hanoi[1] = range(discs)
    __tower_of_hanoi[1][discs:None:-1]


def move(from_tower, to_tower):
    movedValue = -1
    movedTower = __tower_of_hanoi[from_tower]
    movedValue = movedTower[len(movedTower)]


set_new_tower_of_hanoi(5)
