package practices.multidimensionalarray;

public class PowePointOuestions {
    public static void main(String[] args) {

        //Tum elemanlarin carpimini ekrana yazdirin
        int arr[][] = { {1,2,3}, {4,5,6}};

        int multiply = 1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                //System.out.println(arr[i][j]);
                int num = arr[i][j];
                multiply = multiply * num;
            }
        }
        System.out.println(multiply);


        int multiply1 = 1;
        for(int w[] : arr){
            for(int k : w){
                multiply1 = multiply1 * k;
            }
        }
        System.out.println(multiply1);


        //Ic arraylerdeki son elemanlarin carpimini ekrana yazdirin
        int arr2[][] = { {1,2,3}, {4,5}, {6}};
        int result = 1;
        for(int w[] : arr2){
           result *= w[w.length-1];
        }
        System.out.println(result);


        //Multi dimensional araylerin ic array'lerinde ayni indexe sahip elemanlarin toplamini ekrana yazdiran programi yazin.
        int arr3[][] = { {1,2}, {3,4,5}, {6}};
        int arr4[][] = { {7,8,9}, {10,11}, {12}};

        int bound = 0;
        for(int i=0; i<arr3.length; i++) {
            if(arr3[i].length<=arr4[i].length) {
                bound = arr3[i].length;
            }else{
                bound = arr4[i].length;
            }

            for (int j = 0; j < bound; j++) {
                System.out.println(arr3[i][j] + arr4[i][j]);

            }
        }


        // Multi dimensional array'in ic array'lerindeki tum elemanlarin toplamini birer birer bulan ve herbir sonucu
        //yeni bir arrayin elemani yapan ve yeni array'i ekrana yazdiran bir program yaziniz.

        int arr5[][] = { {1,2,3}, {4,5}, {6,7}};
        int newArr[] = {};
        int sum = 0;
        for(int i=0; i<arr5.length; i++){
            for(int j=0; j<arr5[i].length; j++){
               sum = sum + arr5[i][j];
            }

        }












    }
}
