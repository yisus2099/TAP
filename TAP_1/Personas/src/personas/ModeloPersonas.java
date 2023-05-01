
package personas;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
class ModeloPersonas extends AbstractTableModel{
private List<Persona> data;
private String[] nombresColumnas = {"CURP",  "NOMBRE", "APELLIDO", 
    "CELULAR", "EDAD", "SOLTERO(A)"};

DatosPersonas datos = new DatosPersonas();

public ModeloPersonas(){
    data = datos.getPersonas();
}
    @Override
    public int getRowCount() {
        return data.size();
        //return data.length;
    }

    @Override
    public int getColumnCount() {
        return nombresColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Persona p = data.get(rowIndex);
        switch(columnIndex){
            case 0: return p.getCurp();
            case 1: return p.getNombre();
            case 2: return p.getApellido();
            case 3: return p.getCelular();
            case 4: return p.getEdad();
            case 5: return p.isSoltero();
        }
        return null;  
        }
    @Override
    public String getColumnName(int column){
        return nombresColumnas[column];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        return getValueAt(0, columnIndex).getClass();
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return true;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        Persona p = data.get(rowIndex);
        
        switch(columnIndex){
            case 0: p.setCurp( (String) aValue );
            case 1: p.setNombre( (String) aValue );
            case 2: p.setApellido( (String) aValue );
            case 3: p.setCelular( (String) aValue );
            case 4: p.setEdad( (Integer) aValue );
            case 5: p.setSoltero( (Boolean) aValue );
        }
        
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    }
    

