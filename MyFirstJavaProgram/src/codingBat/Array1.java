package codingBat;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {


        int[] number = {6, 5, 5, 6};
        System.out.println(firstLast6(number));

        System.out.println(Arrays.toString(makePi()));
        int a[] = {1, 2, 3};
        int b[] = {1, 3, 2};
        int nums[] = {7, 3, 2, 8, 6, 9};
        int nums2[] = {1, 3};
        System.out.println(commonEnd(a, b));
        System.out.println(Arrays.toString(maxEnd3(nums)));
        System.out.println(Arrays.toString(makeLast(nums2)));
        System.out.println(start1(a, b));
        System.out.println(Arrays.toString(makeMiddle(nums)));

    }

    public static boolean firstLast6(int[] nums) {

        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        if (nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }

    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public static boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;

    }

    public int sum3(int[] nums) {
        int sum = nums[0] + nums[1] + nums[2];
        return sum;

    }

    public int[] rotateLeft3(int[] nums) {
        int rotateNum[] = {nums[1], nums[2], nums[0]};
        return rotateNum;

    }

    public int[] reverse3(int[] nums) {
        int reverse[] = {nums[2], nums[1], nums[0]};
        return reverse;

    }

    public static int[] maxEnd3(int[] nums) {
        if (nums[0] >= nums[nums.length - 1]) {
            return new int[]{nums[0], nums[0], nums[0]};
        }
        if (nums[nums.length - 1] > nums[0]) {
            return new int[]{nums[2], nums[2], nums[2]};
        }
        return nums;

    }

    public int sum2(int[] nums) {
        int result = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length > 1) {
            return nums[0] + nums[1];
        }
        return result;

    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};

    }

    public int[] makeEnds(int[] nums) {
        if (nums.length >= 1) {
            return new int[]{nums[0], nums[nums.length - 1]};
        }
        return nums;

    }

    public boolean has23(int[] nums) {
        if (nums[0] == 2 || nums[1] == 2) {
            return true;
        }
        if (nums[0] == 3 || nums[1] == 3) {
            return true;
        }
        return false;


    }

    public boolean no23(int[] nums) {
        if (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3) {
            return false;

        }
        return true;

    }

    public static int[] makeLast(int[] nums) {
        int result[] = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;

    }

    public boolean double23(int[] nums) {
        if (nums.length > 1 && nums[0] == 2 && nums[1] == 2) {
            return true;
        }
        if (nums.length > 1 && nums[0] == 3 && nums[1] == 3) {
            return true;

        }
        return false;

    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            return new int[]{nums[0], 0, nums[2]};
        }
        if (nums[1] == 2 && nums[2] == 3) {
            return new int[]{nums[0], nums[1], 0};
        }
        return nums;

    }

    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};

    }

    public int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return new int[]{nums[0], nums[1]};
        }
        return nums;

    }

    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return new int[]{};
        }
        if (b.length == 0) {

            return new int[]{a[0]};
        }
        if (a.length == 0) {

            return new int[]{b[0]};
        }
        return new int[]{a[0], b[0]};


    }

    public static int start1(int[] a, int[] b) {
        int result = 0;
        if (a.length > 0 && a[0] == 1) {
            result++;
        }
        if (b.length > 0 && b[0] == 1) {
            result++;
        }
        return result;

    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0;
        int sumB = 0;
        sumA = a[0] + a[1];
        sumB = b[0] + b[1];
        if (sumA > sumB || sumA == sumB) {
            return a;
        }
        return b;
    }

    public static int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};

    }

    public int[] swapEnds(int[] nums) {
        int res = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = res;
        return nums;
    }

    public int[] midThree(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};

    }

    public boolean unlucky1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums.length < 2) {
                return false;
            }
            if (nums[i] == 1 && nums[i + 1] == 3) {
                return true;
            }
        }
        return false;

    }

    public int[] make2(int[] a, int[] b) {
        if (a.length == 0) {
            return new int[]{b[0], b[1]};
        }
        if (a.length == 1) {
            return new int[]{a[0], b[0]};
        }
        return new int[]{a[0], a[1]};

    }
}

