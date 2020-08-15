def is_kaibun(str):
    flag = 0
    for char in str:
        c = ord(char) - ord('a')
        c_bit = 2 ** c
        flag = flag ^ c_bit
    if flag == 0:
        return True
    else:
        flag = flag & (flag - 1)
        if flag == 0:
            return True
        else: 
            return False



        