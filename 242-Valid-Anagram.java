class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> hashMap = new HashMap<>();    
    if(s.length() != t.length()){
        return false;
    }
    for(int i=0; i<s.length(); i++){
       char ch = s.charAt(i);
       hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
    }
    for(int i=0; i<t.length(); i++){
        char ch = t.charAt(i);
        hashMap.put(ch, hashMap.getOrDefault(ch, 0) - 1);
    }
    for(int i=0; i<s.length(); i++){
        if(hashMap.get(s.charAt(i)) != 0){
            return false;
        }

    }
    return true;    
    }
}