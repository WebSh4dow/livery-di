import modelo.Cliente;
import notificacao.NotificacaoEmail;
import notificacao.Notificador;
import service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente jose = new Cliente("José","jose123@gmail.com","3432424324");
        Cliente juliano = new Cliente("Juliano","juliano123@gmail.com","3432424324");

        Notificador notificador = new NotificacaoEmail();
        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);

        ativacaoClienteService.ativar(jose);
        ativacaoClienteService.ativar(juliano);

    }
}