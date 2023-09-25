import jade.core.Runtime;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

//codigo para rodar sem "-gui -name -agents Gabriel:Agente1;Borges:Agente2"

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.instance();
        Profile profile = new ProfileImpl();
        profile.setParameter(Profile.MAIN_HOST, "localhost");
        AgentContainer container = runtime.createMainContainer(profile);

        try {
            AgentController agente1 = container.createNewAgent("Agente1", "Agente1", null);
            AgentController agente2 = container.createNewAgent("Agente2", "Agente2", null);

            agente1.start();
            agente2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
