class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i =0;i<nums.length;i++){
      int currentnumber=nums[i];
      int requirement = target-currentnumber;
      if(map.containsKey(requirement)){
        return new int[]{map.get(requirement), i};
         
      }
      map.put(currentnumber,i);
      }

        return new  int[]{};
    }
}
