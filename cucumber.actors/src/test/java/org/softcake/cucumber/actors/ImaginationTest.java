package org.softcake.cucumber.actors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author René Neubert
 */
class ImaginationTest {

	@Test
	void createActor() {

		Actor actor = Imagination.createActor("Sean");
		assertEquals("Sean", actor.toString());
	}
}