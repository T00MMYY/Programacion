//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package monlau;

import monlau.dao.ProductoDAO;
import monlau.dao.ProductoDAOImpl;
import monlau.model.Producto;

public class ProductoManager {
    public ProductoManager() {
    }

    public static void main(String[] args) {
        ProductoDAO producto = new ProductoDAOImpl();
        producto.insert(new Producto(200, "Pollo", (double)10.0F));
        producto.insert(new Producto( 5, "Carne", (double)20.0F));
        Producto p = producto.read(200);
        System.out.println(p);
    }
}
