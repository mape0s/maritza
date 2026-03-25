public class Main {
    public static void main(String[] args) {

        NotificacaoFactory factory;

        String tipo = "email";
        if (tipo.equals("email")) {
            factory = new EmailFactory();
        } else {
            factory = new SMSFactory();
        }

        Notificacao n = factory.criarNotificacao();
        n.enviar();
    }
}

abstract class Notificacao {
    abstract void enviar();
}

// Produtos 
class Email extends Notificacao {
    void enviar() {
        System.out.println("Enviando email");
    }
}

class SMS extends Notificacao {
    void enviar() {
        System.out.println("Enviando SMS");
    }
}

// Factory Method
abstract class NotificacaoFactory {
    abstract Notificacao criarNotificacao();
}

class EmailFactory extends NotificacaoFactory {
    Notificacao criarNotificacao() {
        return new Email();
    }
}

class SMSFactory extends NotificacaoFactory {
    Notificacao criarNotificacao() {
        return new SMS();
    }
} 