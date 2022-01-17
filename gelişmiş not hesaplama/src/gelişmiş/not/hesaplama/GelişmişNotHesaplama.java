
package gelişmiş.not.hesaplama;

import java.util.Scanner;

public class GelişmişNotHesaplama {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Vize1 : ");
        int vize1 = scanner.nextInt();
        
        System.out.println("Vize2 : ");
        int vize2 = scanner.nextInt();
        
        System.out.println("final : ");
        int finalnot = scanner.nextInt();
        
        double toplamnot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);
        
        if (toplamnot >= 90){
            
            System.out.println("AA aldınız ve not ortalamanız = "+toplamnot);
        }
       else if (toplamnot >= 85){
        System.out.println("BA aldınız ve not ortalamanız = "+toplamnot);
        
}
        else if (toplamnot >= 80){
        System.out.println("BB aldınız ve not ortalamanız = "+toplamnot);}
               
        else if (toplamnot >= 75){
        System.out.println("CB aldınız ve not ortalamanız = "+toplamnot);}
        
        else if (toplamnot >= 70){
        System.out.println("CC aldınız ve not ortalamanız = "+toplamnot);}
        
        else if (toplamnot >= 65){
        System.out.println("DC aldınız ve not ortalamanız = "+toplamnot);}
        
        else if (toplamnot >= 60){
        System.out.println("DD aldınız ve not ortalamanız = "+toplamnot);}
        
        else if (toplamnot >= 55){
        System.out.println("FD aldınız,kaldınız ve not ortalamanız = "+toplamnot);}
        
        else {
        System.out.println("FF aldınız,kaldınız ve not ortalamanız = "+toplamnot);}
        
    }
}