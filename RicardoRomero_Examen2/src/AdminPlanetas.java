
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ricky
 */
public class AdminPlanetas {

    private ArrayList<Planetas> listaPlanetas = new ArrayList();
    private File archivo = null;

    public AdminPlanetas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Planetas> getListaPlanetas() {
        return listaPlanetas;
    }

    public void setListaPlanetas(ArrayList<Planetas> listaPlanetas) {
        this.listaPlanetas = listaPlanetas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setPlanetas(Planetas p) {
        this.listaPlanetas.add(p);
    }
    
    public void cargarArchivo() {
        try {
            listaPlanetas = new ArrayList();
            Planetas temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Planetas) objeto.readObject()) != null) {
                        listaPlanetas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void escribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Planetas t : listaPlanetas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
}
