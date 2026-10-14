class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        HashMap<String,List<String>>map=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();//string ko    character array me store kro
            Arrays.sort(ch); // character ko sort kro

            String key = new String(ch);
        
          if (!map.containsKey(key)) {
          map.put(key, new ArrayList<>());
         }

         map.get(key).add(str);




        }

        return new ArrayList<>(map.values());
        
    }
}
