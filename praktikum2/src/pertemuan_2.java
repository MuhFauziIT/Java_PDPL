public class pertemuan_2 {
    public static int kuadrat(int number) { return number * number;}
    public static void main (String [] args) {
        int a = 1;
        int b = 2;
        float c = (float) Math.sqrt(kuadrat(a) + kuadrat(b));
        
        System.out.println("Hasilnya : " + c + "\n");
}
}