public class LiczbyParzyste {

    public static void main(String[] args) {

        int i =0;
        int suma = 0;
        while(i<=100)
        {
            if(i%2 == 0) {
                suma = suma + i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println(suma);
    }
}