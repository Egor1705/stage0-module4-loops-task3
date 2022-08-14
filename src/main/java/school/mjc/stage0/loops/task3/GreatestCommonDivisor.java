package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int divisor = Math.min(first,second);
        if(first==0 || second==0){
            divisor=Math.max(first,second);
        }

        for(int i = divisor; i>=1;i--){
            if(first%i==0 && second%i==0){

                divisor=i;
                break;
            }
        }
        System.out.println(divisor);

    }
}
