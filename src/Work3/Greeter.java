package Work3;
// Принцип открытости-закрытости
// Теперь вместо switch каждое сообщение выделено в новый класс. Можно добавить новые приветствия без вмешательства в класс Greeter
// И вместо того, чтобы хранить строку formality, класс Greeter будет хранить объект GreetingStrategy, который будет использоваться для формирования приветствия


public class Greeter {
    private GreetingStrategy strategy;

    public Greeter(GreetingStrategy strategy) {
        this.strategy = strategy;
    }

    public String greet() {
        return strategy.greet();
    }
}
