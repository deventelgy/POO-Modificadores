public class Empleado {
    //Atributos

    /**
     * Nombre del empleado
     */
    private String nombre;

    /**
     * Apellido del empleado
     */
    private String apellido;

    /**
     * Edad del empleado
     */
    public int edad;

    /**
     * Salario del empleado
     */
    private double salario;

    //Metodos

    /**
     * Suma un plus al salario del empleado si el empleado tiene mas de 40 años
     * @param sueldoPlus
     * @return true: se suma el plus al sueld
     *         false: no se suma el plus al sueldo
     */

    //METODO PLUS de la clase EMPLEADO
    public boolean plus (double sueldoPlus){

        boolean aumento=false;

        if (edad>40 && compruebaNombre()){
            salario+=sueldoPlus;
            aumento=true;
        }

        return aumento;
    }

    /**
     * Comprueba que el nombre no este vacio
     * @return true: el nombre es una cadena vacia
     *         false: el nombre no es una cadena vacia
     */
    private boolean compruebaNombre(){
        if(nombre.equals("")){
            return false;
        }

        return true;
    }

    //Constructores

    /**
     * Constructor por defecto
     */

    public Empleado(){
        this("", "", 27, 0);
    }

    /**
     * Constructor con 4 parametros
     * @param nombre nombre del empleado
     * @param apellido nombre del empleado
     * @param edad edad del empleado
     * @param salario salario del empleado
     */
    public Empleado(String nombre, String apellido, int edad, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
    }
}
