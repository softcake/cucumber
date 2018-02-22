package actors;


import org.junit.jupiter.api.Test;
import org.softcake.cucumber.actors.Actor;
import org.softcake.cucumber.actors.Imagination;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorIntegTest {
    private static final String NAME = "Sean Connery";
    private static final Actor SEAN = Imagination.createActor(NAME);

    @Test
    public void nameMatches() {
        assertEquals(NAME, SEAN.name());
    }

    @Test
    public void accurateToString() {
        assertEquals(NAME, SEAN.toString());
    }

    @Test
    public void canReachDefaultActor() {
        Actor actor = new org.softcake.cucumber.actors.impl.DefaultActor("Kevin Costner");
        assertEquals("Kevin Costner", actor.toString());
    }
}
