class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int n1:nums1){
            s1.add(n1);
        }
        for(int n2:nums2){
            s2.add(n2);
        }
        List<Integer> list1 = new ArrayList<>(s1);
        List<Integer> list2 = new ArrayList<>(s2);

        list1.removeAll(s2);
        list2.removeAll(s1);
        
        list.add(list1);
        list.add(list2);
        
        return list;
        
    }
}