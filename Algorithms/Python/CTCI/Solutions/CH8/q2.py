import copy


# the sub problem here is that we can reuse the paths that we had previously accessed

def is_there_a_path(array):
    dictMap = {}
    check_route(len(array) - 1, len(array[0]) - 1, array, [], dictMap)


def check_route(x, y, array, path, dictMap):
    copied_path = copy.copy(path)

    if x == 0 & y == 0:
        for coord in path:
            print(str(coord[0]) + ", " + str(coord[1]))
        print("yes we have arrived")
        add_nodes_to_map(path, dictMap)
    if (x - 1) > -1 and array[y][x - 1] != -1:
        copied_path.append((y, x - 1))
        if (y, x - 1) in dictMap:
            copied_path += dictMap[(y, x - 1)]
            print("We reused")
        check_route(x - 1, y, array, copied_path, dictMap)
    if (y - 1) > -1 and array[y - 1][x] != -1:
        copied_path.append((y - 1, x))
        if (y - 1, x) in dictMap:
            copied_path += dictMap[(y - 1, x)]
            print("We reused")
        check_route(x, y - 1, array, copied_path, dictMap)


def add_nodes_to_map(node_list, dictMap):
    for x in range(len(node_list) - 1):
        dictMap[node_list[x]] = node_list[x:]


def generate_map():
    Matrix = [[0 for x in range(4)] for y in range(4)]
    Matrix[0][1] = -1
    Matrix[0][2] = -1
    Matrix[1][2] = -1
    # Matrix[2][2] = -1
    Matrix[3][1] = -1

    return Matrix


# def is_there_a_path_memento(array):


def print_matrix(Matrix):
    for array in Matrix:
        STRING_REP = ""
        for item in array:
            STRING_REP += str(item) + " "
        print(STRING_REP)
        print("\n")


print_matrix(generate_map())
is_there_a_path(generate_map())
