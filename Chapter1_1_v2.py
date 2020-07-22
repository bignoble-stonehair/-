def isUniqueChars(str):
    str_flag = 0
    if len(str) > 128:
        return False;
    else:
        for i in range(len(str)):
             print(1<<ord(str[i]))
             if(str_flag & (1<<ord(str[i])) == 0):
                 str_flag |= 1<<ord(str[i])
                 
             else:
                 return False;
            
    return True;

if(isUniqueChars("xirsag")):
    print("重複しません")
else:
    print("重複します")

                 

     

         

