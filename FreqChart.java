public class FreqChart {

    public String makeChart(){
        int firstInterval;
        int secondInterval;
        int thirdInterval;
        int fourthInterval;
        int fifthInterval;
        int sixthInterval;
        int seventhInterval;
        int eighthInterval;
        int ninthsecondInterval;
        int tenthInterval;

        if (data > 1 && data <= 10){
            firstInterval++;
        }
        if (data > 10 && data <= 20){
            secondInterval++;
        }
        if (data > 20 && data <= 30){
            thirdInterval++;
        }
        if (data > 30 && data <= 40){
            fourthInterval++;
        }
        if (data > 40 && data <= 50){
            fifthInterval++;
        }
        if (data > 50 && data <= 60){
            sixthInterval++;
        }
        if (data > 60 && data <= 70){
            seventhInterval++;
        }
        if (data > 70 && data <= 80){
            eighthInterval++;
        }
        if (data > 80 && data <= 90){
            ninthInterval++;
        }
        if (data > 90 && data <= 100){
            tenthInterval++;
        }

        public String stars(int intervalVal){
            for(int i = 0; i <= intervalVal; i++){
                return '*';
            }
        }

        public String toString() {
            return "1 - 10 |" + stars(firstInterval) +
             "\n 11 - 20 |" + stars(secondInterval) +
             "\n 21 - 30 |" + stars(thirdInterval) +
             "\n 31 - 40 |" + stars(fourthInterval) +
             "\n 41 - 50 |" + stars(fifthInterval) +
             "\n 51 - 60 |" + stars(sixthInterval) +
             "\n 61 - 70 |" + stars(seventhInterval) +
             "\n 71 - 80 |" + stars(eigthInterval) +
             "\n 81 - 90 |" + stars(ninthInterval) +
             "\n 91 - 100 |" + stars(tenthInterval);
        }
    }


// Main method
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("Enter data values one at a time, followed by enter: ");
        int val = 0;
        for (int i = 0; i < data.length; i++){
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart chart = new FrequencyChart(data);

        System.out.println(chart.makeChart());
        }

}
