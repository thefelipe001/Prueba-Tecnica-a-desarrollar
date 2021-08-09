package Modelo;


public class ClienteDire {
    int id;
    String Direccion;
    int client_id;


    public ClienteDire() {
    }

    public ClienteDire(int id, String Direccion, int client_id) {
        this.id = id;
        this.Direccion = Direccion;
        this.client_id = client_id;
   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirrecion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
     public int getClient() {
        return client_id;
    }
        public void setClient_Id(int client_id) {
        this.client_id = client_id;
    }

  
    
}
