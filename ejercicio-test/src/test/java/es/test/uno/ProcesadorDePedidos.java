package es.test.uno;

import org.junit.jupiter.api.*;

class ProcesadorDePedidosTest {
    
    ProcesadorDePedidos procesadorDePedidos;
    Pedido pedido1;
    Pedido pedido2;


    @BeforeEach
    void beforeEach() {
      Pedido  pedido1 = new Pedido(1, 10, "juan");
      Pedido  pedido2 = new Pedido(2, 20, "nico");

        procesadorDePedidos = new ProcesadorDePedidos();
        procesadorDePedidos.agregarPedido(pedido1);
        procesadorDePedidos.agregarPedido(pedido2);
    }

    @Test
    void agregarPedidoTest() {
    Assertions.assertEquals(2, procesadorDePedidos.obtenerPedidos().size());
    }

    @Test
    void agregarPedidoIllegalArgumentExceptionTest() {
        Pedido  pedido3 = null;
        try {
            procesadorDePedidos.agregarPedido(pedido3);
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException)) {
                Assertions.fail("Error invalido");
            }
            Assertions.assertTrue(e.getMessage().contains("Pedido"));
        }
    }
}
