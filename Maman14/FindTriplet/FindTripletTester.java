public class FindTripletTester
{
    public static void main(String[] args)
    {
        int[] arr0 = {0, 0, 0};
        System.out.println("arr0: " + (Ex14.findTriplet(arr0) == 0));
        System.out.println();
        int[] arr1 = {10, 10, 10};
        System.out.println("arr1: " + (Ex14.findTriplet(arr1) == 1000));
        System.out.println();
        int[] arr2 = {10, 10, -10};
        System.out.println("arr2: " + (Ex14.findTriplet(arr2) == -1000));
        System.out.println();
        int[] arr3 = {10, -10, 10};
        System.out.println("arr3: " + (Ex14.findTriplet(arr3) == -1000));
        System.out.println();
        int[] arr4 = {-10, 10, 10};
        System.out.println("arr4: " + (Ex14.findTriplet(arr4) == -1000));
        System.out.println();
        int[] arr5 = {-10, -10, 10};
        System.out.println("arr5: " + (Ex14.findTriplet(arr5) == 1000));
        System.out.println();
        int[] arr6 = {-10, -10, -10};
        System.out.println("arr6: " + (Ex14.findTriplet(arr6) == -1000));
        System.out.println();
        //Check 4 num arrays
        int[] arr7 = {0, 0, 0, 0};
        System.out.println("arr7: " + (Ex14.findTriplet(arr7) == 0));
        System.out.println();
        int[] arr8 = {0, 0, 0, 10};
        System.out.println("arr8: " + (Ex14.findTriplet(arr8) == 0));
        System.out.println();
        int[] arr9 = {0, 0, 10, 0};
        System.out.println("arr9: " + (Ex14.findTriplet(arr9) == 0));
        System.out.println();
        int[] arr10 = {0, 10, 0, 0};
        System.out.println("arr10: " + (Ex14.findTriplet(arr10) == 0));
        System.out.println();
        int[] arr11 = {10, 0, 0, 0};
        System.out.println("arr11: " + (Ex14.findTriplet(arr11) == 0));
        System.out.println();
        int[] arr12 = {10, 0, 10, 0};
        System.out.println("arr12: " + (Ex14.findTriplet(arr12) == 0));
        System.out.println();
        int[] arr13 = {0, 10, 0, 10};
        System.out.println("arr13: " + (Ex14.findTriplet(arr13) == 0));
        System.out.println();
        //more 3 num arrays
        int[] arr14 = {0, 10, 0};
        System.out.println("arr14: " + (Ex14.findTriplet(arr14) == 0));
        System.out.println();
        int[] arr15 = {10, 0, 0};
        System.out.println("arr15: " + (Ex14.findTriplet(arr15) == 0));
        System.out.println();
        int[] arr16 = {0, 0, 10};
        System.out.println("arr16: " + (Ex14.findTriplet(arr16) == 0));
        System.out.println();
        int[] arr17 = {0, 10, 10};
        System.out.println("arr17: " + (Ex14.findTriplet(arr17) == 0));
        System.out.println();
        //more 4 num arrays
        int[] arr18 = {10, -5, -8, -2};
        System.out.println("arr18: " + (Ex14.findTriplet(arr18) == 400));
        System.out.println();
        int[] arr19 = {-10, 5, -8, -2};
        System.out.println("arr19: " + (Ex14.findTriplet(arr19) == 400));
        System.out.println();
        int[] arr20 = {10, -5, 8, -2};
        System.out.println("arr20: " + (Ex14.findTriplet(arr20) == 100));
        System.out.println();
        int[] arr21 = {10, 5, -8, -2};
        System.out.println("arr21: " + (Ex14.findTriplet(arr21) == 160));   
        System.out.println();
        int[] arr22 = {10, -5, 8, -2};
        System.out.println("arr22: " + (Ex14.findTriplet(arr22) == 100));
        System.out.println();
        int[] arr23 = {10, 5, 8, -2};
        System.out.println("arr23: " + (Ex14.findTriplet(arr23) == 400));
        System.out.println();
        int[] arr24 = {10, 5, -8, 2};
        System.out.println("arr24: " + (Ex14.findTriplet(arr24) == 100));
        System.out.println();
        //check all negative arrays
        int[] arr25 = {-10, -5, -8, -2};
        System.out.println("arr25: " + (Ex14.findTriplet(arr25) == -80));
        System.out.println();
        int[] arr26 = {-10, -5, 0, -2};
        System.out.println("arr26: " + (Ex14.findTriplet(arr26) == 0));
        System.out.println();
        int[] arr27 = {-100, -20, -1, -2};
        System.out.println("arr27: " + (Ex14.findTriplet(arr27) == -40));
        System.out.println();
        int[] arr28 = {-3, -3, -3, -3};
        System.out.println("arr28: " + (Ex14.findTriplet(arr28) == -27));
        System.out.println();
        //check 4 or more arrays with all negative
        int[] arr29 = {-10, 2, 9, -2};
        System.out.println("arr29: " + (Ex14.findTriplet(arr29) == 180));
        System.out.println();
        int[] arr30 = {-10, -5, 0, -2, 90};
        System.out.println("arr30: " + (Ex14.findTriplet(arr30) == 4500));
        System.out.println();
        int[] arr31 = {-100, -20, -1, -2, -9, -10};
        System.out.println("arr31: " + (Ex14.findTriplet(arr31) == -18));
        System.out.println();
        int[] arr32 = {3, 3, 3, 3, 3, 3};
        System.out.println("arr32: " + (Ex14.findTriplet(arr32) == 27));
        System.out.println();
        int[] arr33 = {-10, 2, 9, -2};
        System.out.println("arr33: " + (Ex14.findTriplet(arr33) == 180));
        System.out.println();
        int[] arr34 = {-10, -5, 0, -2, 90};
        System.out.println("arr34: " + (Ex14.findTriplet(arr34) == 4500));
        System.out.println();
        int[] arr35 = {-100, -20, -1, -2, -9, -10};
        System.out.println("arr35: " + (Ex14.findTriplet(arr35) == -18));
        System.out.println();
        int[] arr36 = {3, 3, 3, 3, 3, 3};
        System.out.println("arr36: " + (Ex14.findTriplet(arr36) == 27));
        System.out.println();
        int[] arr37 = {0, 0, 0, 0, 0, 0};
        System.out.println("arr37: " + (Ex14.findTriplet(arr37) == 0));
        System.out.println();
        int[] arr38 = {0, 6, 0, 7, 0, -9};
        System.out.println("arr38: " + (Ex14.findTriplet(arr38) == 0));
        System.out.println();
        int[] arr39 = {0, 0, 3, 0, -9, -10};
        System.out.println("arr39: " + (Ex14.findTriplet(arr39) == 270));
        System.out.println();
        int[] arr40 = {0, 0, 5, 0, 0, 0};
        System.out.println("arr40: " + (Ex14.findTriplet(arr40) == 0));
        System.out.println();
        int[] arr41 = {0, 30, 0, 10, 0, 20};
        System.out.println("arr41: " + (Ex14.findTriplet(arr41) == 6000));
        System.out.println();
        int[] arr42 = {5, 3, 1, 0, 2, 4};
        System.out.println("arr42: " + (Ex14.findTriplet(arr42) == 60));
        System.out.println();
    }
}