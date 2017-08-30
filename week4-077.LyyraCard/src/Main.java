public class Main {

    public static void main(String[] args) {
        LyyraCard Pekka = new LyyraCard(20);
        
        LyyraCard Brian = new LyyraCard(30);

        Pekka.payGourmet();
        Brian.payEconomical();
        System.out.println("Pekka " + Pekka.toString());
        System.out.println("Brian " + Brian.toString());
        Pekka.loadMoney(20);
        Brian.payGourmet();
        System.out.println("Pekka " + Pekka.toString());
        System.out.println("Brian " + Brian.toString());
        Pekka.payEconomical();
        Pekka.payEconomical();
        Brian.loadMoney(50);
        System.out.println("Pekka " + Pekka.toString());
        System.out.println("Brian " + Brian.toString());        
        
    } 
}
