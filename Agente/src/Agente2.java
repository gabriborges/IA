import jade.core.Agent;
public class Agente2 extends Agent {
    protected void setup() {
        System.out.println("Oi eu sou um agente, o 2");
        System.out.println("Meu nome é " + getAID().getLocalName());

    }
}