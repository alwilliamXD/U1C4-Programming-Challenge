public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
    if (x.length() < 2) {
        return false;
    }
    else if ((x.substring(x.length()-2)).equals("ly")) {
            return true; 
    }
    else {
        return false;
    }
}
    public String conCat(String s1, String s2) {
        if (s1.length() == 0) {
            return (s1+s2);
        }
        else if (s2.length() == 0) {
            return (s1+s2);
        }
        else if ((s1.substring(s1.length()-1)).equals((s2.substring(0,1)))) {
            return (s1.substring(0, s1.length()-1) + s2);
        }
        else {
            return (s1 + s2);
        }
}
    public String withoutX(String s1) {
        String ss1 = s1;
        if (ss1.length() > 0 && ss1.substring(0,1).equals("x")) {
            ss1 = ss1.substring(1);
        }
        if (ss1.length() > 0 && ss1.substring(ss1.length()-1).equals("x")) {
            ss1 = ss1.substring(0, ss1.length()-1); 
        }
        return ss1;
}
    public String fizzString(String s1) {
        int x = 0;
        if (s1.length() > 0 && s1.substring(0,1).equals("f")) {
            x++;
        }
        if (s1.length() > 0 && s1.substring(s1.length()-1).equals("b")) {
            x++;
            x++;
        }
        if (x == 1) {
            return "Fizz";
        }
        if (x == 2) {
            return "Buzz";
        }
        if (x == 3) {
            return "FizzBuzz";
        }
        else {
            return s1;
        }
    }

    public String fizzString2(int x) {
        if (x%5 == 0 && x%3 == 0) {
            return "FizzBuzz!";
        }
        if (x%3 == 0) {
            return "Fizz!";
        }
        if (x%5 == 0) {
            return "Buzz!";
        }
        return x+"!";
}
    }