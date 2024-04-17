public class Teszt {

    public static void main(String[] args) {
        RegularisSzamla regularisSzamla1 = new RegularisSzamla("Kiss Béla");
        regularisSzamla1.betesz(10000);
        regularisSzamla1.kivesz(5000);
        System.out.println(regularisSzamla1);

        RegularisSzamla regularisSzamla2 = new RegularisSzamla("Nagy Anna");
        regularisSzamla2.betesz(20000);
        System.out.println(regularisSzamla2);

        System.out.println("regularisSzamla1 egyenleg: " + regularisSzamla1.getEgyenleg());
        System.out.println("regularisSzamla2 egyenleg: " + regularisSzamla2.getEgyenleg());


        FolyoSzamla folyoSzamla1 = new FolyoSzamla("Nagy Tamás");
        folyoSzamla1.betesz(30000);
        folyoSzamla1.kivesz(10000);
        folyoSzamla1.betesz(5000);
        folyoSzamla1.kivesz(7000);
        folyoSzamla1.levonKoltseg();
        System.out.println(folyoSzamla1);

        FolyoSzamla folyoSzamla2 = new FolyoSzamla("Kiss Péter");
        folyoSzamla2.betesz(40000);
        folyoSzamla2.kivesz(20000);
        folyoSzamla2.kivesz(5000);
        folyoSzamla2.levonKoltseg();
        System.out.println(folyoSzamla2);

        System.out.println("folyoSzamla1 egyenleg: " + folyoSzamla1.getEgyenleg());
        System.out.println("folyoSzamla2 egyenleg: " + folyoSzamla2.getEgyenleg());

        TakarekSzamla takarekSzamla1 = new TakarekSzamla("Nagy Béla", 5);
        takarekSzamla1.betesz(10000);
        takarekSzamla1.hozzaadKamat();
        System.out.println(takarekSzamla1);

        TakarekSzamla takarekSzamla2 = new TakarekSzamla("Kiss Anna", 3);
        takarekSzamla2.betesz(20000);
        takarekSzamla2.hozzaadKamat();
        System.out.println(takarekSzamla2);

        System.out.println("takarekSzamla1 egyenleg: " + takarekSzamla1.getEgyenleg());
        System.out.println("takarekSzamla2 egyenleg: " + takarekSzamla2.getEgyenleg());

        System.out.println("regularisSzamla1 equals regularisSzamla2: " + regularisSzamla1.equals(regularisSzamla2));
        System.out.println("folyoSzamla1 equals folyoSzamla2: " + folyoSzamla1.equals(folyoSzamla2));
        System.out.println("takarekSzamla1 equals takarekSzamla2: " + takarekSzamla1.equals(takarekSzamla2));

        System.out.println("folyoSzamla1 equals folyoSzamla1: " + folyoSzamla1.equals(folyoSzamla1));
        System.out.println("takarekSzamla1 equals takarekSzamla1: " + takarekSzamla1.equals(takarekSzamla1));

    }}