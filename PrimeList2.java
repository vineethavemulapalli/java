public class PrimeList2 {

  public static void main(String[] args) 
  {
      int i,j;
     int low=23,high=100;
     for(i=low;i<=high;i++)
     {
        boolean flag = false;
       for (j = 2; j <= i/ 2; j++) {
      // condition for nonprime number
      if (i % j == 0) {
        flag = true;
        break;
      }
    }
    if (!flag){
      System.out.print(i+" ");
    }
     }
}
}
