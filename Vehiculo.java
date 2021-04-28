public class Vehiculo{
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano = 10;
    public static int posAnadir = 0;

    public Vehiculo(){
        vehiculos[posAnadir] = this;
        posAnadir++;
    }

    public Vehiculo(int mo, String ma, double va){
        this(mo, ma, va, "verde");
    }

    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        vehiculos[posAnadir] = this;
        posAnadir++;
    }

    public int getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public double getValorComercial(){
        return valorComercial;
    }

    public String getColor(){
        return color;
    }

    public void setModelo(int mo){
        this.modelo = mo;
    }

    public void setMarca(String ma){
        this.marca = ma;
    }

    public void setValorComercial(double va){
        this.valorComercial = va;
    }

    public void setColor(String co){
        this.color = co;
    }

    public String toString(){
        return modelo+marca+valorComercial+color;
    }

    public String toStringVehiculos(){
        String informacion = "";
        for(int i = 0; i<Vehiculo.posAnadir; i++){
            informacion = vehiculos[i].toString() + informacion;
        }
        return informacion;
    }

    public int cantidadVehiculos(){
        return posAnadir;
    }

}

    

