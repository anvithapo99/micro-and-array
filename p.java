 Micro and Array Update
Micro purchased an array A having N integer values. After playing it for a while, he got
bored of it and decided to update value of its element. In one second he can increase
value of each array element by 1. He wants each array element's value to become greater
than or equal to K. Please help Micro to find out the minimum amount of time it will take,
for him to do so.


import java.util.*;

 

class TestClass {

    public static void main(String args[] ) throws Exception {

 


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int N = Integer.parseInt(line);


      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();

 

        for (int i = 0; i < t; i++) {

           int n= sc.nextInt();

           int k = sc.nextInt();

           int arr[] = new int[n];

           

             for(int j=0; j<n;j++){

              arr[j]=sc.nextInt();

               

             }

             

            int min=arr[0];

            for(int j=0;j<n;j++ ){

                if(min>arr[j]){

                    min=arr[j];

                }

            }

            

          if(min<k) 

         System.out.println(k-min);

         else

         System.out.println(0);   

        }

        

    }

}
sample input             
2
3 4
1 2 5
3 2
2 5 5
sample ouput
3
0
