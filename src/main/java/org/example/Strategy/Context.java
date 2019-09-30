package main.java.org.example.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void sort(int arr[]){
        strategy.sort(arr);
    }
}