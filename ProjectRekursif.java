/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectrekursif;

/**
 *
 * @author Acer
 */
public class ProjectRekursif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        A. menghitung nilai faktorial
            int hasil = rekursif(5);
            System.out.print(hasil);
            }
            public static Integer rekursif(int n){
            if(n == 0 || n == 1){
            return 1;
            } else{
                return n * rekursif(n-1);
            }
            }   
//            Ubah script di atas, sehingga: jika diberi input 4, maka outputnya 4 x 3 x 2 x 1 = 24
            
//          B. membuat deret fibonancci
//            for (int i = 0; i < 5; i++) {
//            int hasil = fiboRekursif(i);
//            System.out.print(hasil + " ");
//            }
//
//            public static Integer fiboRekursif(int n) {
//            if (n == 0) {
//            return 0;
//            }
//            if (n == 1) {
//            return 1;
//            }
//            return fiboRekursif(n - 1) + fiboRekursif(n - 2);
//            }
//            Ubah script di atas, sehingga: jika diberi input 5, maka outputnya 0, 1, 1, 2, 3 (ada
//            tanda komanya).
}
