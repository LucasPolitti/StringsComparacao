public class StringsComparacao {

    public static void main(String[] args) {
        
        String s1=new String("Lucas");
        String s2="lucas";
        String s3="Curso de java";
        String s4="CFB Cursos";
        String s5="CFB Curso de Java";
        String s6="Lucas";

        System.out.println(s2);

        //regionMatches

        if(s4.regionMatches(true,0,s5,0,3)){ //compara o s4 a partir do 0. Com o s5 apenas entre 0 e 3
            System.out.println("s4 igual s5");
        }else{
            System.out.println("s4 diferente s5");
        }

        //compareTo

        //lança 0 quando as strings são iguais, número negaribo quando a primeira string é menor e número positivo quando a primeira string é maior

        int res=s4.compareTo(s6);
        
        if(res == 0){
            System.out.println("SÃO IGUAIS");

        }else if(res<0){
            System.out.println("A PRIMEIRA STRING É MENOR");

        }else if(res>0) {
            System.out.println("A PRIMEIRA STRING É MAIOR");

        }

        //equalsIgnoreCase

        if(s1.equalsIgnoreCase(s2)){ //ignora totalmente caracteres maiúsculos e minúsculos
            System.out.println("s1 igual s2");
        }else{
            System.out.println("s1 diferente s2");
        }

        //equals vs ==

        /*if(s1==s2){
            System.out.println("s1 igual s2");
        }else{
            System.out.println("s1 diferente s2"); //a saída é diferente pois s1 foi instanciado e s2 não, portanto é melhor usar equal ao invés de ==
        }*/
        
        if(s1.equals(s2)){
            System.out.println("s1 igual s2");
        }else{
            System.out.println("s1 diferente s2"); //a saída é igual pois usamos o métodos equals que compara valores de objetos strings
        }


        
    }
}