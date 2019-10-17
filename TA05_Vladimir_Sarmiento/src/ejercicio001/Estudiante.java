
package ejercicio001;

public class Estudiante {
    private int codigo;
    private String especialidad;
    private int n1,n2,n3,n4;

    public Estudiante(int codigo, String especialidad, int n1, int n2, int n3, int n4) {
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    public void mostrarDatos(){
        System.out.println("el codigo es: "+codigo);
        System.out.println("la especialidad es: "+especialidad);
    }
    
    public void Promedio(){
        int Promedio;
        int menor =n1;
        if(n2<menor){
            menor = n2;
           
        }
        if(n3<menor){
            menor = n3;
        }
        if(n4<menor){
            menor = n4;
        }
        Promedio = (n1+n2+n3+n4-menor)/3;
        System.out.println("El promedio:" + Promedio);
    }
    
        
    
  
 
    
    
}
