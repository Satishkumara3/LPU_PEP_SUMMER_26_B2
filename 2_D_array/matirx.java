import java.util.*;
class matirx {

    public static void method(int[][] matrix){
        Scanner sc=new Scanner(System.in);
        int row=matrix.length;
        int colm=matrix[0].length;

        for(int i=0;i<row;i++){
                for(int j=0;j<colm;j++){
                    matrix[i][j]=sc.nextInt();

                }
        }


    }







    public static void rowsum(int[][] arr){
    
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum=sum+arr[i][j];
                
            }
            System.out.println(sum);
            

        }

        
    }





    public static int  max_sum(int[][] arr){
        int index=-1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum=sum+arr[i][j];

            }
            if(sum>ans) index=i;
        }
        return index;

        
    }







    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[][] matrix=new int[3][4];

        

        // taking input as row wise 
            for(int i=0;i<3;i++){
                for(int j=0;j<4;j++){
                    matrix[i][j]=sc.nextInt();

                }
            }

        // taking input as column wise
            // for(int i=0;i<4;i++){
            //     for(int j=0;j<3;j++){
            //         matrix[i][j]=sc.nextInt();

            //     }
            // }


            
        // print all the element of even column
            
                // for(int i=0;i<3;i++){
                //     for(int j=0;j<4;j++){
                //         if(i%2==0 && j%2==0) System.out.println(matrix[i][j]);
                //     }
                // }



                
        // method(matrix);


        rowsum(matrix);
        System.out.println(max_sum(matrix));


    }
    
}
