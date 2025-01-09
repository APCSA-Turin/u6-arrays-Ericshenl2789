public class Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)
    
    /*  Creates a Payroll object
     
       PRECONDITIONS: items != null, items.length >= 3
    */
    public Payroll(int[] items) {
      itemsSold = items;
      wages = new double[items.length];
    }
   
    /*  Returns the bonus threshold as described in part (a).
     */
    public double computeBonusThreshold() {
        int max = 0;
        int min = 10000;
        int total = 0;
        for(int num : itemsSold){
            total += num;
            if(num > max){
                max = num;
            }
            if(min > num){
                min = num;
            }
        }
        return (double)(total - max - min)/(itemsSold.length - 2);
    }
    
   
    /* Computes employee wages as described in part (b) and stores
       them in wages. The parameter fixedWage represents the fixed
       amount each employee is paid per day. The parameter
       perItemWage represents the amount each employee is paid per
       item sold.
     */
    public void computeWages(double fixedWage, double perItemWage) {
        for(int i = 0; i < itemsSold.length; i++){
                double wage = fixedWage + (itemsSold[i] * perItemWage);
            if(itemsSold[i] > computeBonusThreshold()){
                wage *= 1.1;
            }
            wages[i] = wage;
        }	
        }
        public double[] getWages() {
            return wages;
        }
  }
  