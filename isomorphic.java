class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> hashmap = new HashMap<>();
        char c = 'a';
        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            if(hashmap.containsKey(s.charAt(i))){
                c = hashmap.get(s.charAt(i));

                if(c!= t.charAt(i)){
                    return false;
                }
            }

            else if(!hashmap.containsValue(t.charAt(i))){
                hashmap.put(s.charAt(i),t.charAt(i));
            }

            else 
                 return false;
        }

        return true;
        
    }
}