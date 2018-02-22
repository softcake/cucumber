package org.softcake.cucumber.actors.impl;

import org.softcake.cucumber.actors.Actor;

/**
 * Default implementation of {@link Actor}
 */
public class DefaultActor implements Actor {
    private final String name;

	public String getLastName() {
		return lastName;
	}

	private final String lastName;

    public DefaultActor(String name) {
        this(name,"");

    }

    public DefaultActor(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return name();
    }
}
