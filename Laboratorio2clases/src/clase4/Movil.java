package clase4;

/**
 * Created by gatoe on 16/8/2019.
 */
public class Movil {
private int tamanio_pantalla;
private int capacidad;
private float precio;
private int camara;
private String tipo;
private int stock;

 public Movil(String tipo,float precio){
     tamanio_pantalla = 5;
     capacidad = 16;
     camara = 13;
     stock = 0;
     this.tipo = tipo;
     this.precio = precio;
 }

    public int getTamanio_pantalla() {
        return tamanio_pantalla;
    }

    public void setTamanio_pantalla(int tamanio_pantalla) {
        this.tamanio_pantalla = tamanio_pantalla;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCamara() {
        return camara;
    }

    public void setCamara(int camara) {
        this.camara = camara;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getinfo(){
     return "tipo: "+tipo+", tamanio de pantalla "+tamanio_pantalla+", capacidad: "+capacidad+
             ", camara: "+camara+", precio:"+precio+", cantidad en stock "+stock;
 }

    public String verStock(){
      return "la cantidad de moviles "+this.tipo+" en stock es de "+stock;
    }

    public void vender(){
        stock = stock-1;
    }


}
