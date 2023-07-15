class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);
        String star = "*";
        sb.replace(0,sb.length()-4,star.repeat(phone_number.length()-4));
        return sb.toString();
    }
}