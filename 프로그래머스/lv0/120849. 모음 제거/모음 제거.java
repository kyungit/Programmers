class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        if(my_string.contains("a")){
            my_string = my_string.replace("a","");
        }
        if(my_string.contains("e")){
            my_string = my_string.replace("e","");
        }
        if(my_string.contains("i")){
            my_string = my_string.replace("i","");
        }
        if(my_string.contains("o")){
            my_string = my_string.replace("o","");
        }
        if(my_string.contains("u")){
            my_string = my_string.replace("u","");
        }
        answer = my_string;
        return answer;
    }
}