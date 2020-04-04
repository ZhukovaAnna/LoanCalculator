public class Main {

    public static void main(String[] args) {
    CreditPaymentService service1 = new CreditPaymentService();

    double r = service1.calculateAn(1_000_000,9.99, 12 );
        System.out.println(r);

    r = service1.calculateAn(1_000_000,9.99, 24 );
        System.out.println(r);

    r = service1.calculateAn(1_000_000,9.99, 36 );
        System.out.println(r);


    r= service1.calculateDef(1_000_000,9.99, 12 );
        System.out.println(r);

    r = service1.calculateDef(1_000_000,9.99, 24 );
        System.out.println(r);

    }

}
