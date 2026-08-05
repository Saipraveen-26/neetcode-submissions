class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int reqd1=0;
        int reqd2=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                      reqd1=i;
                      reqd2=j;
                      break;
                }
            }
            
        }
            ArrayList<Integer> num = new ArrayList<>();
                num.add(reqd1);
                num.add(reqd2);
                Collections.sort(num);
                int[] arr = new int[num.size()];

for (int i = 0; i < num.size(); i++) {
    arr[i] = num.get(i);
}
return arr;
    }
}
