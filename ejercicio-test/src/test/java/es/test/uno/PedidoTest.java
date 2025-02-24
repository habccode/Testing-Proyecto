package es.test.uno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PedidoTest {
    
    Pedido pedido;


    @BeforeEach
    void beforeEach() {
        pedido = new Pedido(1, 1, "juan");
    }

    @Test
    void pedidoEqualsTest() {
        Pedido pedido2 = new Pedido(1, 10, "juan");
        Assertions.assertEquals(pedido, pedido2);
    }

    @Test
    void pedidoEqualsObjectTest() {
        Assertions.assertEquals(pedido, pedido);
    }

    @Test
    void pedidoEqualsDiferentObjectTest() {
        Assertions.assertFalse(pedido.equals("pedido"));
    }


    @Test
    void pedidoConstructorIllegalArgumentExceptionTest() {
        try {
            Pedido pedido2 = new Pedido(0, 0, "juan");
            Assertions.fail("Se ha producido un error no controlado");
        } catch (Exception e) {
            if ( !(e instanceof IllegalArgumentException)) {
                Assertions.fail("Se ha producido un error no controlado");
            }
            Assertions.assertTrue(e.getMessage().contains("Detalles"));
        }
        
    }

    @Test
    void pedidoConstructorIllegalArgumentException2Test() {
        try {
            Pedido pedido2 = new Pedido(-2, 10, "juan");
            Assertions.fail("Se ha producido un error no controlado");
        } catch (Exception e) {
            if ( !(e instanceof IllegalArgumentException)) {
                Assertions.fail("Se ha producido un error no controlado");
            }
            Assertions.assertTrue(e.getMessage().contains("Detalles"));
        }
        
    }
    @Test
    void pedidoConstructorIllegalArgumentException3Test() {
        try {
            Pedido pedido2 = new Pedido(1, 2, null);
            Assertions.fail("Se ha producido un error no controlado");
        } catch (Exception e) {
            if ( !(e instanceof IllegalArgumentException)) {
                Assertions.fail("Se ha producido un error no controlado");
            }
            Assertions.assertTrue(e.getMessage().contains("Detalles"));
        }
    }

   @Test
    void pedidoConstructorIllegalArgumentException4Test() {
        try {
            Pedido pedido2 = new Pedido(1, 2, "");
            Assertions.fail("Se ha producido un error no controlado");
        } catch (Exception e) {
            if ( !(e instanceof IllegalArgumentException)) {
                Assertions.fail("Se ha producido un error no controlado");
            }
            Assertions.assertTrue(e.getMessage().contains("Detalles"));
        }
        
    }
}
