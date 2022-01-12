def move_zeros(array):
    for i in array:
        if i == 0:
            array.pop(array.index(i))
            array.append(0)
    return array

print(move_zeros([False,1,0,1,2,0,1,3,"a"]))