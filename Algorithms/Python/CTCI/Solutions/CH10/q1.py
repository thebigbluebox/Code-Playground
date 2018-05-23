# sorted merge
def in_place_merge_sort(a, b):
    length_a = len(a)
    length_b = len(b)
    index_start = length_b - length_a - 1

    for key in reversed(a):
        if a > b[index_start]:
            b[length_b - 1] = a[key]
            length_b -= 1
        else:
            b[length_b - 1] = b[index_start]
            index_start -= 1
            length_b -= 1
    return b


a = [1, 5, 7, 9, 10, 12]  # 6
b = [2, 4, 5, 6, 8, 15, -1, -1, -1, -1, -1, -1]  # 12     12 - 6 = 6
in_place_merge_sort(a, b)
