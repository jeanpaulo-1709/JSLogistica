package controle;
 
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
 
@ManagedBean
@ViewScoped
public class CounterView implements Serializable {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int number = 1;
 
    public int getNumber() {
        return number;
    }
 
    public void increment() {
        number++;
    }
}