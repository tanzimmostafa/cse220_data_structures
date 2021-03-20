public class Task06 {
public static boolean binarySearch(int[] a,int l,int r,int k) {
    if (l > r)
      return false;
    else {
      int mid = (l + r)/2;
      if (k == a[mid])
        return true;
      else if (k > a[mid])
        return binarySearch(a, mid + 1, r, k);
      else
        return binarySearch(a, l, mid - 1, k);
      
    }
  }
public static void main(String args[]) {
  
  int array[] = {1,2,3,4,5,6,7};
  
  System.out.println(binarySearch(array,0,array.length - 1,6));

}
}