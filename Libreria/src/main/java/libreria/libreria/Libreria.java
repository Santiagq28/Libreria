
package libreria.libreria;

import java.util.Scanner;

public class Libreria {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        Book hp1 = new Book("harry potter y la piedra filosofal",1,1,"Ficcion","","");
        Book hp2 = new Book("harry potter y la cámara secreta", 1, 2, "Ficcion","","");
        Book hp3 = new Book("harry potter y el prisionero de askaban", 1, 3, "Ficcion","","");
        Book hp4 = new Book("harry potter y el cáliz de fuego", 1, 4, "Ficcion","","");
        Book hp5 = new Book("harry potter y la orden del fénix", 1, 5, "Ficcion","","");
        Book hp6 = new Book("harry potter y el misterio del princípe", 1, 6, "Ficcion","","");
        Book hp7 = new Book("harry potter y las reliquias de la muerte", 1, 7, "Ficcion","","");
        Book hp8 = new Book("harry potter y el legado maldito", 1, 8, "Ficcion","","");
        
        Book[] library = new Book[8];
        library[0]=hp1;
        library[1]=hp2;
        library[2]=hp3;
        library[3]=hp4;
        library[4]=hp5;
        library[5]=hp6;
        library[6]=hp7;
        library[7]=hp8;
        
        System.out.println("Título 3: "+library[2].getTitle());
        
        System.out.println("Bienvenido a la Biblioteca de la UFPSO");
        System.out.println("¿Qué acción desea realizar?");
        System.out.println("(1)Buscar_libro  (2)Pedir_libro  (3)Entregar_libro  (4)Nuevo_Libro");
        int option = scn.nextInt();
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
                                System.out.println("Libro encontrado, el título es "+library[i].getTitle());
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
                break;
            case 4:
                System.out.println("Para registrar un nuevo libro, ingrese el nombre del libro:");
                break;
            default:System.out.println("ERROR: Escogió una opción inexistente.");
        }
    }
        
    public static void search(){
        
    }
}
