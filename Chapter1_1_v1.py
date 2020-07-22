str1 = 'apple'
str2 = 'peach'
str3 = 'deoxyribonucleic'
temp = ' '
flag = True
len = 0
for char in str3:
    for char_temp in temp:
        if(char_temp == char):
            flag = False
            break;
        else:
            temp += char   
    if(not flag):
        break;

if(flag):
    print("重複しません")
