public class ArrayAlgorithms {
    private ArrayAlgorithms(){}

    public static double average(int[] numList){
        int total = 0;
        for (int num : numList){
            total += num;
        }
        return total / (double) numList.length;
    }

    public static int minimum(int[] numList){
        int minumum = numList[0];
        for(int num : numList){
            if(num < minumum){
                minumum = num;
            }
        }
        return minumum;
    }

    public static int howManyContain(String[] strList, String target) {
        int count = 0;
        for (String str : strList){
            if(str.contains(target)){
                count ++;
            }
        }
        return count;
    }

    public static String[] stringToArray(String myStr) {
        String[] result = new String[myStr.length()];
        for(int i = 0; i < myStr.length(); i++){
            result[i] = myStr.substring(i, i+1);
        }
        return result;
    }

    public static void introduceAdults(Person[] people) {
        for(Person person : people){
            if(person.getAge() >= 18){
                person.introduce();
            }
        }
    }
    
    public static void reversePrint(String[] wordList) {
        for(int i = wordList.length - 1; i >= 0; i--){
            String word = wordList[i];
            for(int j = word.length()-1; j >=0; j--){
                System.out.print(word.substring(j, j+1));
            }
            System.out.println();
        }
    }

    public static int[] combine(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int j = 0;
        for(int i = 0; i < arr1.length + arr2.length; i++){
            if(i < arr1.length){
                result[i] = arr1[i];
            } else{
                result[i] = arr2[j];
                j++;
            }
        }
        return result;
    }


}
