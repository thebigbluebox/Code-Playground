def multiplyRec(a, b):
    return multiply_rec(0, a, b)


def multiply_rec(count, a, b):
    if count == a:
        return 0
    else:
        return b + multiply_rec(count + 1, a, b)


print(multiplyRec(2, 4))
