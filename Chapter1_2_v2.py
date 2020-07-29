import numpy as np

def isOrdered(str1, str2):
    ascii_list = np.zeros(128)
    if(len(str1) != len(str2)):
        return False
    else:
        for char in str1:
            ascii_list[ord(char)] = ascii_list[ord(char)] + 1
        for char in str2:
            ascii_list[ord(char)] = ascii_list[ord(char)] - 1
            if ascii_list[ord(char)] < 0:
                return False
        return True
   
if isOrdered('apple', 'apple'):
    print("一致")
else:
    print("違うよ")



