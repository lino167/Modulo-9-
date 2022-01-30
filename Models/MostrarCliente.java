import java.util.function.Consumer;

public class MostrarCliente implements Consumer {

    @Override
    public void accept(Object obj){
        System.out.println(obj);
    }
    
}
