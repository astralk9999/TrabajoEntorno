/**
* Representa una dirección postal con ciudad, calle y número.
*/
public class Direccion {
	private String ciudad;
   private String calle; 
   private int numero;
   /**
    * Crea una nueva dirección con los valores especificados.
    *
    * @param calle  Nombre de la calle.
    * @param ciudad Nombre de la ciudad.
    * @param numero Número de la dirección.
    */
   public Direccion(String calle, String ciudad, int numero) {
       this.calle = calle;
       this.ciudad = ciudad;
       this.numero = numero;
   }
   /**
    * Obtiene la ciudad de la dirección.
    *
    * @return La ciudad.
    */
   public String getCiudad() {
       return ciudad;
   }
   /**
    * Obtiene la calle de la dirección.
    *
    * @return La calle.
    */
   public String getCalle() {
       return calle;
   }
   /**
    * Obtiene el número de la dirección.
    *
    * @return El número de la dirección.
    */
   public int getNumero() {
       return numero;
   }
   /**
    * Establece la ciudad de la dirección, validando su formato.
    *
    * @param ciudad La nueva ciudad.
    * @throws IllegalArgumentException Si el formato de la ciudad no es válido.
    */
   public void setCiudad(String ciudad) {
       if (ciudad != null && ciudad.matches("^[a-zA-Z\\s]{3,50}$")) {
           this.ciudad = ciudad;
       } else {
           throw new IllegalArgumentException("Ciudad no válida");
       }
   }
   /**
    * Establece la calle de la dirección, validando su formato.
    *
    * @param calle La nueva calle.
    * @throws IllegalArgumentException Si el formato de la calle no es válido.
    */
   public void setCalle(String calle) {
       if (calle != null && calle.matches("^[a-zA-Z\\s]{3,50}$")) {
           this.calle = calle;
       } else {
           throw new IllegalArgumentException("Calle no válida");
       }
   }
   /**
    * Establece el número de la dirección.
    *
    * @param numero El nuevo número de la dirección.
    */
   public void setNumero(int numero) {
       this.numero = numero;
   }
   /**
    * Devuelve una representación en cadena de la dirección.
    *
    * @return Una cadena con la información de la dirección.
    */
   @Override
   public String toString() {
       return "Direccion{" +
               "ciudad='" + ciudad + '\'' +
               ", calle='" + calle + '\'' +
               ", numero=" + numero +
               '}';
}
}



 

