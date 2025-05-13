//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package monlau.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import monlau.model.Producto;

public class ProductoDAOImpl implements ProductoDAO {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/test?useSSL=false";
    static final String DB_USR = "root";
    static final String DB_PWD = "";

    public ProductoDAOImpl() {
    }

    private void registerDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.err.println("ERROR: failed to load MySQL JDBC Driver");
            ex.printStackTrace();
        }

    }

    public void insert(Producto producto) {
        Connection conn = null;

        try {
            this.registerDriver();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "");
            Statement stmt = conn.createStatement();
            Integer var10001 = producto.getId();
            stmt.executeUpdate("insert into producto values (" + var10001 + ",'" + producto.getNombre() + "'," + producto.getPrecio() + ");");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

        }

    }

    public void update(Producto producto) {
        Connection conn = null;

        try {
            this.registerDriver();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "");
            Statement stmt = conn.createStatement();
            String var10001 = producto.getNombre();
            stmt.executeUpdate("update producto set nombre = '" + var10001 + "', precio = " + producto.getPrecio() + " where id = " + producto.getId() + ";");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

        }

    }

    public void delete(Producto producto) {
        Connection conn = null;

        try {
            this.registerDriver();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("delete from producto where id = " + producto.getId() + ";");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

        }

    }

    public Producto read(Integer id) {
        Connection conn = null;
        Producto prod = null;

        try {
            this.registerDriver();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "");
            PreparedStatement ps = conn.prepareStatement("select * from producto where id = ?");

            try {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                try {
                    if (rs.next()) {
                        prod = new Producto(id, rs.getString("nombre"), rs.getDouble("precio"));
                    }
                } catch (Throwable var21) {
                    if (rs != null) {
                        try {
                            rs.close();
                        } catch (Throwable var20) {
                            var21.addSuppressed(var20);
                        }
                    }

                    throw var21;
                }

                if (rs != null) {
                    rs.close();
                }
            } catch (Throwable var22) {
                if (ps != null) {
                    try {
                        ps.close();
                    } catch (Throwable var19) {
                        var22.addSuppressed(var19);
                    }
                }

                throw var22;
            }

            if (ps != null) {
                ps.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

        }

        return prod;
    }
}
