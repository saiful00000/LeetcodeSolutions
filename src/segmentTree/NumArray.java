package segmentTree;

public class NumArray {
    int st[];
    int[] aa;

    public NumArray(int[] arr) {
        int n = arr.length;
        int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
        int max_size = 2 * (int) Math.pow(2,x) - 1;
        st = new int[max_size];
        aa = arr;
        constructSTUtil(arr,0,n-1,0);
    }

    //method for construct segment tree
    public int constructSTUtil(int[] arr, int ss, int se, int si) {
        if (ss == se) {
            st[si] = arr[ss];
            return arr[ss];
        }
        int mid = getMid(ss,se);
        st[si] = constructSTUtil(arr, ss, mid, si*2+1)
                + constructSTUtil(arr,mid+1, se, si*2+2);
        return st[si];
    }

    public void update(int i, int val) {
        int diff = val - aa[i];
        aa[i] = val;
        updateValueUtil(0,aa.length-1,i,diff,0);
    }
    public void updateValueUtil(int ss, int se, int i, int diff, int si) {
        if (i < ss || i > se)
            return;
        st[si] = st[si] + diff;
        if (se != ss) {
            int mid = getMid(ss,se);
            updateValueUtil(ss,mid,i,diff,2*si+1);
            updateValueUtil(mid+1,se,i,diff,2*si+2);
        }
    }

    public int sumRange(int qs, int qe) {
        int n = aa.length;
        return getSumUtil(0, n-1, qs, qe, 0);
    }

    // method for calculating sum in given range
    public int getSumUtil(int ss, int se, int qs, int qe, int si) {
        if (qs <= ss && qe >= se)
            return st[si];
        if (se < qs || ss > qe)
            return 0;
        int mid = getMid(ss,se);
        return getSumUtil(ss, mid, qs, qe, 2*si+1)
                + getSumUtil(mid+1, se, qs, qe, 2*si+2);
    }

    // an utility method
    public int getMid(int s, int e) {
        return s + (e - s) / 2;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5};
        NumArray numArray = new NumArray(a);
        System.out.println(numArray.sumRange(0,2));
        numArray.update(1,2);
        System.out.println(numArray.sumRange(0,2));
    }
}



























