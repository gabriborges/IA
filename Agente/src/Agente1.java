import jade.core.Agent;
public class Agente1 extends Agent {
    protected void setup() {
        System.out.println("Oi, eu sou um agente, o 1!");
        System.out.println("Meu nome é " + getAID().getLocalName());

    }
}   