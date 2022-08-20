package day09_NestedTernary;


public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        kullanicidan gun ismini alin
        hafta ici veya hafta sonu oldugunu yazdirin
         */

        String input= "pazartesi";
        input=input.toLowerCase();

        switch (input){
            case "pazartesi" :
            case "sali" :
            case "carsambe" :
            case "persembe" :
            case "cuma" :
                System.out.println("Hafta ici");
            case "cumartesi" :
            case "pazar" :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun ismi giriniz");

        }

    }
}
