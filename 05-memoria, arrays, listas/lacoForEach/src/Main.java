public class Main {
    public static void main(String[] args) {

        String[] vect = new String[] {"Jean", "Nolan", "Bosco"};
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("----------------");
//        Para cada objeto ´obj´ contido em vect, faça: 
        for(String obj : vect){
            System.out.println(obj);
        }
    }
}