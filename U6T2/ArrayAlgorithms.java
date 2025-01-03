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

    public static void bookEnd(int[] nums, int num) {
        nums[0] = num;
        nums[nums.length - 1] = num;
    }
  
    public static void multiplyBy(int[] numList, int multiplier) {
        for(int num = 0; num < numList.length; num ++){
            numList[num] *= multiplier;
        }
    }    

    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] result = new int[numList.length];
        for(int i = 0; i < numList.length; i++){
            result[i] = numList[i] * multiplier;
        }
        return result;
    }    



    public static void addExclamation(String[] wordList) {
        for(int i = 0; i < wordList.length; i++){
            String word = wordList[i];
            String last = word.substring(word.length() - 1);
            if(!last.equals("!")){
                wordList[i] += "!";
            }
        }
    }
    
    public static boolean[] isFreezing(int[] tempList) {
        boolean[] result = new boolean[tempList.length];
        for(int num  = 0; num < tempList.length; num++){
            if(tempList[num] <= 32){
                result[num] = true;
            }
        }
        return result;
    }
    
    public static void shiftLeft(int[] numList) {
        int first = numList[0];
        for(int i = 0; i < numList.length; i++){
            if(i == numList.length - 1){
                numList[i] = first;
            }else{
                numList[i] = numList[i+1];
            }
        }
    }

    public static void shiftRight(int[] numList) {
        int last = numList[numList.length - 1];
        for(int i = numList.length - 1; i >= 0; i--){
            if(i == 0){
                numList[i] = last;
            }else{
                numList[i] = numList[i-1];
            }
        }
    }

    public static void reverse(int[] numList) {
        int k = numList.length - 1;
        for(int i = 0; i < numList.length/2; i++){
            int temp = numList[i];
            numList[i] = numList[k];
            numList[k] = temp;
            k --;
        }
    }
     
    public static String longestString(String[] array){
        String max = "";
        for(String string:array){
            if(string.length() >= max.length()){
                max = string;
            }
        }
        return max;
    }

    public static boolean containsPositive(int[] array){
        for(int num : array){
            if(num > 0){
                return true;
            }
        }
        return false;
    }

    public static String[] makeLowercase(String[] array){
        String[] result = new String[array.length];
        for(int i = 0; i < array.length; i++){
            result[i] = array[i].toLowerCase();
        }
        return result;
    }

    public static int endsInExclamations(String[] stringList){
        int result = 0;
        for(String str: stringList){
            String finalLetter = str.substring(str.length() - 1);
            if(finalLetter.equals("!")){
                result ++;
            }
        }
        return result;
    }

    public static void makeUppercase(String[] wordList){
        for(int i = 0; i < wordList.length; i ++){
            wordList[i] = wordList[i].toUpperCase();
        }
    }
    public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
        int[] result = new int[intArr1.length];
        for(int i = 0; i < intArr1.length; i++){
            result[i] = intArr1[i];
        }
        for(int i =0; i <intArr2.length; i ++){
            if(intArr2[i] > result[i]){
                result[i] = intArr2[i];
            }
        }
        return result;
    }
    public static int countConsecutiveDoubles(int[] numList) {
        int result = 0;
        for(int i = 0; i < numList.length - 1; i ++){
            if(numList[i] == numList[i+1]){
                result ++;
            } 
        }
        return result;
    }

    public static int longestStreak(int[] nums) {
        int streak = 0;
        int maxStreak = 0;
        int previous = nums[0];
        for(int num : nums){
            if(num == previous){
                streak++;
            } else {
                streak = 1;
            }
            previous = num;
            if(streak > maxStreak){
                maxStreak = streak;
            }
        }
        return maxStreak;
    }
    
    
}
