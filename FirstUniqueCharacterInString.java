class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character, Integer> hMap = new HashMap <Character, Integer>();
        for(int i=0; i<s.length();i++) {
            char currentChar = s.charAt(i);
           // hMap.put(currentChar, hMap.getOrDefault(currentChar,-2)+1)
            
            if(hMap.containsKey(currentChar)) {
                hMap.put(currentChar, -1); //not unique char
            }
            else {
                hMap.put(currentChar, i); //unique char
            }
        }
        for(int i=0; i<s.length();i++)
            if(hMap.get(s.charAt(i))!= -1)
                return hMap.get(s.charAt(i));
        
        return -1;
    }
}
