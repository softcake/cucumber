/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.softcake.example.main;

import com.google.common.base.Preconditions;

public class Calculator {

	public double add(double a, double b) {
		Preconditions.checkNotNull(a);

		return a + b;
	}



	public int add(int a, int b) {
		Preconditions.checkNotNull(a);

		return a + b;
	}

}
