public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=-1 ; 
        while(num!=0){
            System.out.println("Introduzca un numero");
            num=s.nextint();
            if(num!=0){
                if(num%2==0){
                    System.out.println("Es par");
                }else{
                    System.out.println("Es impar");
                }
                if(numero>0){
                    System.out.println("Es positivo");
                }else{
                    System.out.println("El cuadrado es negativo");
                }
                System.out.println("El cuadrado de"+num+ "es" num*num );
            }
        }


    }
}