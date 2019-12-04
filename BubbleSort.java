import java.util.*;    // for java built in apps
public class BubbleSort {

        public Integer [] num = {84, 69, 76, 86, 94, 91 };
        public  void Sort(  )
        {
          int j;
          boolean flag = true;   // set flag to true to begin first pass
          int temp;   //holding variable
             while ( flag )
             {
                flag= false;    //set flag to false awaiting a possible swap
                for( j=0;  j < num.length -1;  j++ )
                    {
                       if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                          {
                            temp = num[ j ];      //swap elements
                            num[ j ] = num[ j+1 ];
                            num[ j+1 ] = temp;
                            flag = true;    //shows a swap occurred
                          } // end if
                    } // end for
              } // while
        }  // sort method

        public void Print(){
            for(int j=0;  j < num.length;  j++ ){
             System.out.println( num [j] );
               }  // for
           } // Print
} // class