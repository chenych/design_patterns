public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        command.execute();


        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
