package ro.tss;

public class TrafficLightController {

    // Stari semafor
    public enum State {
        RED, GREEN, YELLOW
    }

    private State currentState;

    // Constructor
    public TrafficLightController() {
        this.currentState = State.RED;
    }

    // Metoda next() schimbă starea
    public void next() {
        switch (this.currentState) {
            case RED:
                this.currentState = State.GREEN;
                break;
            case GREEN:
                this.currentState = State.YELLOW;
                break;
            case YELLOW:
                this.currentState = State.RED;
                break;
        }
    }


//    public void next() {
//        switch (this.currentState) {
//            case RED:
//                this.currentState = State.GREEN;
//                break;
//            case GREEN:
//                this.currentState = State.YELLOW;
//                break;
//            default:
//                this.currentState = State.RED;
//                break;
//        }
//    }



    // Metodă necesară pentru ca EvoSuite să poată verifica starea
    public State getCurrentState() {
        return currentState;
    }
}
