/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.tests;

import org.eclipse.che.example.Hello;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppAnotherTest {

    @Test
    public void shouldSuccessOfAppAnother() {
        assertTrue(new Hello().returnHello().startsWith("Hello"));
    }

    @Test
    public void shouldFailOfAppAnother() {
        assertTrue(new Hello().returnHello().endsWith("Hello"));
    }


}
