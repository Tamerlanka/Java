package maraphone.day8;

public class Task_1 {
    public static void main(String[] args) {

        long startTime1 = System.nanoTime();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<20001;i++){
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString());
        long endtTime1 = System.nanoTime();


        long startTime2 = System.nanoTime();
        String numbers ="";
        for(int i=0;i<20001;i++){
             numbers = numbers+i+" ";
        }

        System.out.println(numbers);
        long endtTime2 = System.nanoTime();
        System.out.println( "SringBuilder "+(endtTime1-startTime1)/1000000+" mlsec");
        System.out.println("String "+(endtTime2-startTime2)/1000000+" mlsec");
    }
}
