public class fractional_knapsake {


    public static void main(String[] args){
        int[] profit = {60,100,120};
        int[] weight = {10,20,30};
        double maxprofit = 0;
        int[] r = new int[profit.length];
        int w = 50;
        int remaining = w;
        for(int i=0;i<profit.length;i++){
            r[i] = profit[i]/weight[i];
            System.out.println(r[i]);
        }
        int temp = 0;
        for(int i=0;i<r.length;i++){
            for(int j=1;j<r.length-i;j++){
                if(r[j-1]<r[j]){
                    temp = r[j-1]; 
                    r[j-1] = r[j];
                    r[j] = temp;
                    temp = profit[j-1];
                    profit[j-1] = profit[j];
                    profit[j] = temp;
                    temp = weight[j-1];
                    weight[j-1] = weight[j];
                    weight[j] = temp;
                }
            }
        }
        for(int i=0;i<profit.length;i++){
            System.out.println(profit[i]+" "+weight[i]+" "+r[i]);
        }
        for(int i=0;i<profit.length;i++){
            if(remaining>=weight[i]){
                maxprofit += profit[i]; 
                remaining = remaining - weight[i];
                System.out.println(maxprofit);
                System.out.println(remaining);
            }
            else{
                maxprofit += (double)remaining*profit[i]/weight[i];
                System.out.println(maxprofit);
                break;
            }
        }
        System.out.println(maxprofit);
    }
}

