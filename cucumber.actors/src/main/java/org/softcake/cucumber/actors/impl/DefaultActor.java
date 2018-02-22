package org.softcake.cucumber.actors.impl;

import com.google.common.base.Preconditions;
import org.softcake.cucumber.actors.Actor;

/**
 * Default implementation of {@link Actor}
 */
public class DefaultActor implements Actor {
    private String name;

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	private final String lastName;

    public DefaultActor(String name) {

        this(name,"");

    }

    public DefaultActor(String name, String lastName) {
	    Preconditions.checkNotNull(name);
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

	public void setName(String name) {
		this.name = name;
	}
}
