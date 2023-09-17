import java.util.ArrayList;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j])
                    flag = true;
                if (flag && nums1[i] < nums2[j]) {
                    flag = false;
                    result[i] = nums2[j];
                }
            }
            if (flag)
                result[i] = -1;
        }
        return result;
    }
}
