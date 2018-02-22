package org.softcake.cucumber.fairy.tale.formula;


import org.junit.jupiter.api.Test;
import org.softcake.cucumber.actors.Actor;
import org.softcake.cucumber.actors.Imagination;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Tests the visibility of objects to the formula module.
 */
@SuppressWarnings("unchecked")
public class ModularityTest {
    @Test
    public void canReachActor() {
        Actor actor = Imagination.createActor("Sean Connery");
        assertEquals("Sean Connery", actor.toString());
    }

    @Test
   // @Disabled("Java 9 modularity even stops reflection.")
    public void canDynamicallyReachDefaultActor() throws Exception {
        Class clazz = ModularityTest
            .class.getClassLoader()
            .loadClass("org.softcake.cucumber.actors.impl.DefaultActor");
        Actor actor = (Actor) clazz.getConstructor(String.class)
            .newInstance("Kevin Costner");
        assertEquals("Kevin Costner", actor.toString());
    }

//    @Test
//    public void canReachDefaultActor() {
//        // With Java 9 modules, this line now fails to compile.
//        Actor actor = new DefaultActor("Kevin Costner");
//        assertEquals("Kevin Costner", actor.toString());
//    }
//
//    @Test
//    public void canReachGuavaClasses() {
//        // This line would throw a compiler error because gradle has kept the implementation dependency "guava"
//        // from leaking into the formula project.
//        Set<String> strings = com.google.common.collect.ImmutableSet.of("Hello", "Goodbye");
//        assertTrue(strings.contains("Hello"));
//        assertTrue(strings.contains("Goodbye"));
//    }
}
