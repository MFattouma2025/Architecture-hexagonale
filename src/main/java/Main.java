import adapter.ConsoleAdapter;
import application.DepositService;
import infrastructure.InMemoryAccountRepository;

public class Main {
    public static void main(String[] args) {
        var repo = new InMemoryAccountRepository();
        var service = new DepositService(repo);
        var console = new ConsoleAdapter(service);

        console.run();
    }
}
