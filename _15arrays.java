public class _15arrays {
    public static void main (String[]args){

        int [] marks = {2,3,5,7,8,9};
        //positions     0 1 2 3 4 5
        marks [3]= 56;//this will update the marks at position 3 to 56. 
        System.out.println(marks[2]);
        System.out.println(marks[3]);
// if an array is given and u want to print all the values in the array:
         //way to iterate an array
           for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
         }
     //for each loop
     for (int value : marks) {
        System.out.println(value);
     }

    //  two dimension array
       int [][] matrix = {{1,2,3},{4,5,6,7}};
       //firstly position is{ 0 } {    1   }
       //secondly position{0,1,2} {0,1,2}
       System.out.println(matrix[0][1]);

       //String Array
       String[] fruits = {"Apple","Banana","Cherry","Pineapple","Grapes","Mango","Pear","Guava"};
       for (String value : fruits) {
            System.out.println(value);
       }
       //try catch
       //skips the error and executes the program after the error being caused
       try {
        System.out.println(fruits[10]);
       } catch (Exception e) {
        System.out.println(e);
        //TODO: handle exception
       }
      
       System.out.println("duck");


    }
}
