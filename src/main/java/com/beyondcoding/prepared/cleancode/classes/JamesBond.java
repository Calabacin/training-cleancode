package com.beyondcoding.prepared.cleancode.classes;

public class JamesBond extends SpecialAgent implements Seducer {

    public static final String AGENT_NAME = "James Bond";

    private static final String AGENT_NUMBER = "007";

    private int seduceLevel;

    public JamesBond() {
        super(AGENT_NAME, AGENT_NUMBER);
        seduceLevel = 100;
    }

    @Override
    public void seduce(Seducible seducible) {
        grabAMartini();
        seducible.beSeduced(getSeduceLevel());
    }

    private void grabAMartini() {

    }

    public int getSeduceLevel() {
        return seduceLevel;
    }

}
