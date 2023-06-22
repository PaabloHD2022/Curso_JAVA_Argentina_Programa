/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Simulador {
    
    private Random random = new Random();
    private Scanner leer = new Scanner(System.in);
    
    // métodos para generar lista de alunos
    public String[] generarAlumnos(Alumnos alumno){
        System.out.println("---------------- IMPRIMIMOS LISTA DE NOMBRES ---------------");
        String[] listaAlumnos = new String[50];
        String[] nombres = {"Jorge", "Pedro", "Maria", "Julia", "Mario", "Santiago", "Karen", "Trulio", "Isidoro", "Cleotilde"};
        String[] apellidos ={"Suarez", "Ramirez", "Mattos", "Brunetti", "Sanmbazetti", "Gomez", "Roberspiere", "Cantinflas", "DeMedici", "Taylor"};
        for (int i = 0; i < 50; i++) {
            
            int x = random.nextInt(nombres.length) *1;
            int j = random.nextInt(apellidos.length) *1;
            listaAlumnos[i]= (nombres[x] + " " + apellidos[j]);
            System.out.print(listaAlumnos[i] + " | ");
        }      
        
        return listaAlumnos;
    }
    
    // método para generar lista de DNI // Se puede hacer con un HashSet
    public int[] generarDNIs(Alumnos alumno){
        System.out.println("---------------- CREAMOS VECTOR DE DNIs ---------------");
        int[] numerosDNI = new int[50];
        
        for (int i = 0; i < numerosDNI.length; i++) {
            int dni = random.nextInt(45000000) + (30000000);
            numerosDNI[i] = dni;
            System.out.print(numerosDNI[i] + " | ");
        }
        
        return numerosDNI;
    }
    
    // método para generar una lista de alumnos
    
    public  HashMap<Integer,String> crearAlumnos(Alumnos alumno){
        System.out.println("---------------- CREAMOS LA LISTA DE ALUMNOS ---------------");
        HashMap<Integer,String> nombresDNIs = new HashMap();
       
        int[] dnis = generarDNIs(alumno);// llenamos el vector con la lista de DNI
        String[] listaNombres = generarAlumnos(alumno);// llenamos el vector con la lista de String
        System.out.println(" ");
        System.out.println("Elija la cantidad de alumnos que quiere crear: ");
        int cantidad = leer.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            Alumnos alumnoNuevo = new Alumnos();
            int indiceDNI = random.nextInt(dnis.length) * 1;
            int x = random.nextInt(50) *1;
            int dniRandom = dnis[indiceDNI];
            String nombreAleatorio = listaNombres[x];
            alumnoNuevo.setNombreCompleto(nombreAleatorio);
            alumnoNuevo.setDni(dniRandom);
            if (nombresDNIs.containsKey(dniRandom)) {
                i--;
            } else {
              nombresDNIs.put(alumnoNuevo.getDni(), alumnoNuevo.getNombreCompleto()); 
            }
         }  
        
        return nombresDNIs;
    }
    
    // Mostramos
    public void mostrarListaAlumnos(Alumnos alumno){
        HashMap<Integer,String> nombresDNIs = new HashMap(crearAlumnos(alumno));
        
        System.out.println("---------------- IMPRIMIMOS LISTA DE ALUMNOS ---------------");
        for (Map.Entry<Integer, String> entry : nombresDNIs.entrySet()) {
            
            System.out.println(entry.getKey() + " " + entry.getValue());
           // System.out.println(alumno.getCantidadVotos());
        }
    }
    
    // método simulador de votación
    
    public HashMap<Integer, Voto> votacion(Alumnos alumno, Voto voto){
        HashMap<Integer,String> listadoGeneral = new HashMap(crearAlumnos(alumno));
        HashMap<Integer, Voto> votosDados = new HashMap<>();
        HashMap<Integer, Voto> votosRecibidos = new HashMap<>();
        
        for (Map.Entry<Integer, String> entry : listadoGeneral.entrySet()) {
            ArrayList<Alumnos> alumLista = new ArrayList();
            Alumnos alum = new Alumnos();
            Voto votoNuevo = new Voto();
            Integer key = entry.getKey();
            int indice = random.nextInt(listadoGeneral.size());
            List<Integer> listaClaves = new ArrayList<>(listadoGeneral.keySet());
            List<String> listaNombre = new ArrayList(listadoGeneral.values());
            int dniRandom = listaClaves.get(indice);
            String nombreCompleto = listaNombre.get(indice);
            alum.setDni(dniRandom);
            alum.setNombreCompleto(nombreCompleto);
           
        }
        
        
    }
//    public HashMap<Integer,Voto> votacion(Alumnos alumno, Voto voto){
//        
//        HashMap<Integer,String> listadoGeneral = new HashMap(crearAlumnos(alumno));
//        HashMap<Integer,Voto> alumnosQueYaVotaron = new HashMap();
//        ArrayList<Voto> alumVotados = new ArrayList();
//        
//        int cantidad = 0;
//        
//        for (Map.Entry<Integer, String> entry : listadoGeneral.entrySet()) {
//            ArrayList<Alumnos> alumLista = new ArrayList();
//            Alumnos alum = new Alumnos();
//            Voto votoNuevo = new Voto();
//            Integer key = entry.getKey();
//            int indice = random.nextInt(listadoGeneral.size());
//            List<Integer> listaClaves = new ArrayList<>(listadoGeneral.keySet());
//            List<String> listaNombre = new ArrayList(listadoGeneral.values());
//            int dniRandom = listaClaves.get(indice);
//            String nombreCompleto = listaNombre.get(indice);
//            alum.setDni(dniRandom);
//            alum.setNombreCompleto(nombreCompleto);
//            alum.setDni(0);
//            do {    // entra a votar 3 veces
//                if (key==alum.getDni()) {
//                    cantidad--;
//                } else {
//                    cantidad++;
//                    alum.setCantidadVotos(cantidad);
//                     generamos los votos que vota el alumno
//                    Alumnos alum2 = new Alumnos();
//                    int indice2 = random.nextInt(listadoGeneral.size());
//                    List<Integer> listaDnis = new ArrayList<>(listadoGeneral.keySet());
//                    List<String> listaNombre2 = new ArrayList(listadoGeneral.values());
//                    int dniRandom2 = listaDnis.get(indice);
//                    String nombreCompleto2 = listaNombre.get(indice);
//                    alum2.setDni(dniRandom2);
//                    alum2.setNombreCompleto(nombreCompleto2);
//                    
//                    if (alum.getDni()==alum2.getDni()) {
//                        cantidad--;
//                    } else {
//                        
//                        alumLista.add(alum2);
//                        
//                    }
//                    votoNuevo.setAlumnosVotados(alumLista);
//                   }
//            } while (cantidad<=3);
//            
//            votoNuevo.setAlumno(alum);
//            alumVotados.add(votoNuevo);
//            alumnosQueYaVotaron.put(key, votoNuevo);
//        }
//        return alumnosQueYaVotaron;
//    }
    
    // metodo para mostrar el hashmap
     public void mostrarVotados(Voto voto, Alumnos alumno){
         
         HashMap<Integer,Voto> mostrarVotaciones = new HashMap(votacion(voto, alumno));
         
         for (Map.Entry<Integer, Voto> entry : mostrarVotaciones.entrySet()) {
             Integer key = entry.getKey();
             Voto value = entry.getValue();
             System.out.println(key + " " + value);
        }
    }
}
