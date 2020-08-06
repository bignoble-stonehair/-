class ChangeBlank{
static String changeBlankIntoChar(String str, int length){
    int blank_counter = 0;
    int i = 0;
    char[] str_c = str.toCharArray();
    for (i = 0; i < length; i++){
        if(str_c[i] == ' '){
            blank_counter++;
        }
    }
    int new_length = length + 3 * blank_counter;
    char new_str_c[] = new char[new_length];
    int index = 0;
    for(i=0; i<length; i++){
        if(str_c[i] == ' '){
            new_str_c[index++] = '%';
            new_str_c[index++] = '2';
            new_str_c[index] = '0';
            index++;
        }
        else{
            new_str_c[index] = str_c[i];
            index++;
        }
    }
    String result = new String(new_str_c);
    return result;
}

public static void main(String[] args){
    System.out.println(changeBlankIntoChar("a pp le", 7));
}
}
