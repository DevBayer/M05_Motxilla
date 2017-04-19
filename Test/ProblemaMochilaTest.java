import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

/**
 * Created by 23878410v on 19/04/17.
 */
public class ProblemaMochilaTest {
    @Test
    public void TestAlmacenSize() throws Exception {
        ProblemaMochila mochila;
        mochila = new ProblemaMochila(20);

        Vector<String> myAlmacen = new Vector<>();
        myAlmacen.add("myObj0");
        myAlmacen.add("myObj1");
        myAlmacen.add("myObj2");
        myAlmacen.add("myObj3");
        myAlmacen.add("myObj4");
        myAlmacen.add("myObj5");
        myAlmacen.add("myObj6");
        myAlmacen.add("myObj7");
        myAlmacen.add("myObj8");
        myAlmacen.add("myObj9");
        myAlmacen.add("myObj10");
        myAlmacen.add("myObj11");
        myAlmacen.add("myObj12");

        int tamany_almacen = mochila.almacen.size();
        int tamany_myAlmacen = myAlmacen.size();

        assertEquals("Error en la generació de dades!", tamany_almacen, tamany_myAlmacen, 0);
    }

    @Test
    public void TestAlmacenNotNull() throws Exception {
        ProblemaMochila mochila;
        mochila = new ProblemaMochila(20);

        assertNotNull(mochila.almacen);
    }

    @Test
    public void TestMochilaNull() throws Exception {
        ProblemaMochila mochila;
        mochila = new ProblemaMochila(20);

        assertEquals(mochila.mochila, new Vector<ProblemaMochila.Elemento>());
    }

    @Test
    public void TestMochilaNotNull() throws Exception {
        ProblemaMochila mochila;
        mochila = new ProblemaMochila(20);
        mochila.resolverProblema();

        assertNotNull(mochila.mochila);
    }


    @Test
    public void TestResolverProblemaZero() throws Exception {
        ProblemaMochila mochila;
        mochila = new ProblemaMochila(0);
        mochila.resolverProblema();

        assertEquals("Error al solucionar problema", mochila.mochila.size(), 0, 0);
    }

    @Test
    public void TestResolverProblemaUno() throws Exception {
        ProblemaMochila mochila;
        mochila = new ProblemaMochila(20);
        mochila.resolverProblema();

        assertEquals("Error al solucionar problema", mochila.mochila.size(), 4, 0);
    }

}
