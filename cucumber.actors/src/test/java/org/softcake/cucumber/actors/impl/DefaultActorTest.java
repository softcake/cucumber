package org.softcake.cucumber.actors.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author René Neubert
 */
class DefaultActorTest {

	@Test
	void getLastName() {
		DefaultActor actor = new org.softcake.cucumber.actors.impl.DefaultActor("Kevin", "Costner");
		assertEquals("Costner", actor.getLastName());
	}
}