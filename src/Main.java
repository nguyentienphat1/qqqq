import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bankinh;
        int duongkinh;
        float chuvi,dientich;
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập giá trị bán kính");
        bankinh= scanner.nextByte();
        System.out.println("nhập giá trị dường kính");
        duongkinh= scanner.nextByte();
        chuvi= duongkinh*3.14f;
        System.out.println("kết quả của chu vi là:"+chuvi);
        dientich=(bankinh*bankinh)*3.14f;
        System.out.println("kết quả của diện tích là:"+dientich);
    }
}