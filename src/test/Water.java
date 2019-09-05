package test;

public class Water {
    public static void main(String[] args) {
        int[] a = {6,4,7,4,3,2,9,7,6,3,6,4};
        container(a);

    }

    private static int container(int[] height){
        int l = 0,r = height.length-1;
        int max = 0,h = 0;

        while(l < r){
            h = Math.min(height[l],height[r]);
            max = Math.max(max,(r-l) * h);

            while(height[l] <= h && l < r){
                ++l;
            }
            while(height[r] <=h && l < r){
                --r;
            }
        }

        System.out.println(l);
        System.out.println(r);
        System.out.println(max);
        return max;
    }
}
