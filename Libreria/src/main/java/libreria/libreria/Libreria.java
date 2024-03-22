
package libreria.libreria;

import java.util.Scanner;

public class Libreria {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
        Book hp1 = new Book("harry",1,1,"Ficcion","","");
        Book hp2 = new Book("potter", 1, 2, "Ficcion","","");
        Book hp3 = new Book("askaban", 1, 3, "Ficcion","","");
        Book hp4 = new Book("fuego", 1, 4, "Ficcion","","");
        Book hp5 = new Book("fenix", 1, 5, "Ficcion","","");
        Book hp6 = new Book("principe", 1, 6, "Ficcion","","");
        Book hp7 = new Book("reliquias", 1, 7, "Ficcion","","");
        Book hp8 = new Book("legado", 1, 8, "Ficcion","","");
        Book hp9 = new Book("lugares",1, 9, "Romance", "","");
        Book hp10 = new Book("gaviota",1,10,"Motivacion","","");
        Book hp11 = new Book("ratas",1,11,"Historia","","");
        Book hp12 = new Book("agosto",1,12,"Novela","","");
        Book hp13 = new Book();
        Book hp14 = new Book();
        Book hp15 = new Book();
        Book hp16 = new Book();
        Book hp17 = new Book();
        Book hp18 = new Book();
        Book hp19 = new Book();
        Book hp20 = new Book();
       
        Book[] library = new Book[20];
        library[0]=hp1;
        library[1]=hp2;
        library[2]=hp3;
        library[3]=hp4;
        library[4]=hp5;
        library[5]=hp6;
        library[6]=hp7;
        library[7]=hp8;
        library[8]=hp9;
        library[9]=hp10;
        library[10]=hp11;
        library[11]=hp12;
        library[12]=hp13;
        library[13]=hp14;
        library[14]=hp15;
        library[15]=hp16;
        library[16]=hp17;
        library[17]=hp18;
        library[18]=hp19;
        library[19]=hp20;
       
       String nuevo = "";
       int cant;
       String genero = "";
       
       
       
        System.out.println("Bienvenido a la Biblioteca de la UFPSO");
        int option = 0;
        while(option!=5){
        System.out.println("¿Qué acción desea realizar?");
        System.out.println("(1)Buscar_libro  (2)Pedir_libro  (3)Entregar_libro  (4)Nuevo_Libro (5)Cerrar_Sistema");
        option = scn.nextInt();
        switch(option){
            case 1:
                System.out.println("Buscar por: (1)Nombre  (2)Id  (3)Género");
                int opt2 = scn.nextInt();
               
                if(opt2 ==1){
                    System.out.println("Ingrese el nombre: ");
                    String name = scn.next();
                    for(int i=0;i<library.length;i++){
                        if(name.equals(library[i].getTitle())){
                                System.out.println("Libro encontrado, el Id es "+library[i].getId());
                                if(library[i].isAvailable()){
                                    System.out.println("El libro está Disponible.");
                                }else{
                                    System.out.println("El libro NO está Disponible.");
                                }
                                break;
                            }else{
                                System.out.println("Buscando...");
                            }
                    }
                }
                else if(opt2 == 2){
                        System.out.println("Ingrese el Id:");
                        int name = scn.nextInt();
                       
                        for(int i=0;i<library.length;i++){
                           
                            if((name) == (library[i].getId())){
                                System.out.println("Libro encontrado, el título es '"+library[i].getTitle()+"'");
                                if(library[i].isAvailable()){
                                    System.out.println("El libro está Disponible.");
                                }else{
                                    System.out.println("El libro NO está Disponible.");
                                }
                                break;
                            }else{
                                System.out.println("Buscando...");
                            }
                               
                            }
                }
                else if(opt2 == 3){
                    System.out.println("Ingrese el género:");
                        String name = scn.next();
                        System.out.println("Libros del género de "+name);
                        for(int i=0;i<library.length;i++){
                           
                            if(name.equals(library[i].getGenre())){
                                System.out.println(library[i].getTitle());
                            }
                            }
                }else{
                    System.out.println("ERROR: Opción Inexistente.");
                }
                break;
                       
       
               
            case 2:
                System.out.println("Para pedir un libro Ingrese el Id del libro:");
                int id = scn.nextInt();
                for(int i=0;i<library.length;i++){
                           
                            if((id) == (library[i].getId())){
                                System.out.println("Libro encontrado, el título es "+library[i].getTitle());
                                if(library[i].isAvailable()){
                                    System.out.println("El libro está Disponible.");
                                    System.out.println("¿Desea pedirlo?");
                                    System.out.println("(1)Sí (2)No");
                                    int n = scn.nextInt();
                                    if(n==1){
                                        library[i].setAvailable(false);
                                        System.out.println("Disfruta tu libro, no olvides devolverlo en una semana.");
                                    }else{
                                        System.out.println("De acuerdo, libro no prestado.");
                                    }
                                }else{
                                    System.out.println("El libro NO está Disponible.");
                                }
                                break;
                            }else{
                                System.out.println("Buscando...");
                            }
                               
                }
               
               
                break;
            case 3:
                System.out.println("Para entregar un libro Ingrese el Id del libro:");
                int id2 = scn.nextInt();
                for(int i=0;i<library.length;i++){
                    if(id2==library[i].getId()){
                        System.out.println("Libro encontrado, el título es '"+library[i].getTitle()+"'");
                        System.out.println("¿Desea entregar el libro? (1)Sí (2)No");
                        id2=scn.nextInt();
                        if(id2==1){
                            System.out.println("De acuerdo, libro entregado.");
                            library[i].setAvailable(true);
                        }else{
                            System.out.println("Ojo te pasas de la fecha de entrega, sigue disfrutando tu libro.");
                        }
                        break;
                    }
                }
                break;
            case 4:
                System.out.println("Para registrar un nuevo libro, ingrese el nombre del libro:");
                nuevo = scn.next();
                System.out.println("Ingrese la cantidad del libro");
                cant =scn.nextInt();
                System.out.println("Ingrese el género del libro:");
                genero = scn.next();
                
                for(int i =0; i<library.length;i++){
                    if(library[i].getId()==0){
                        //library[i].setTitle() = scn.next();
                        library[i].setId(i);
                        library[i].setTitle(nuevo);
                        library[i].setGenre(genero);
                        library[i].setQuantity(cant);
                        System.out.println("Libro agregado.");
                        break;
                    }else{
                        System.out.println("Buscando espacio...");
                    }
                }
                break;
                
                
            case 5:
                System.out.println("Gracias por visitar nuestra Biblioteca, vuelve pronto.");
                break;
            default:System.out.println("ERROR: Escogió una opción inexistente.");
        }
        System.out.println("");
    }
         
    }
       
       
    public static void search(){
       
    }
}
