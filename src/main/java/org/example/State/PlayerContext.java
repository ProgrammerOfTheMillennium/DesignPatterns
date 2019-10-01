package main.java.org.example.State;

public class PlayerContext implements State {
    private State state;

    public void setState(State state){
        this.state = state;
    }
    public void doAction() {
        this.state.doAction();
    }
}
