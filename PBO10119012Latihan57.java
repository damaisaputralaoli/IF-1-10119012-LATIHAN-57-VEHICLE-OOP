
package pbo10119012latihan57;

/**
 *   NAMA  : DAMAI SAPUTRA LAOLI
 *   KELAS : IF-1
 *   NIM   : 10119012
 *  
 * @author damai
 */
public class PBO10119012Latihan57 {

    
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle();
        bicycle1.setBrand("Trek Bike");
        bicycle1.setModel("7.4FX");
        System.out.println("Brand            : " + bicycle1.getBrand());
        System.out.println("Model            : " + bicycle1.getModel());
        bicycle1.setGearCount(23);
        System.out.println("Jumlah Gear      : " + bicycle1.getGearCount());

        System.out.println();

        Skateboard skateboard1 = new Skateboard();
        skateboard1.setBrand("Ally Skate");
        skateboard1.setModel("Rocket");
        System.out.println("Brand            : " + skateboard1.getBrand());
        System.out.println("Model            : " + skateboard1.getModel());
        skateboard1.setBoardLength(54.5);
        System.out.println("Panjangnya board : " + skateboard1.getBoardLeght());
    }
    
}
