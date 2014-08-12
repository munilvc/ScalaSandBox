package com.munilvc.core;

import org.junit.Assert;
import org.junit.Test;

import com.munilvc.core.Avion;

public class AvionTest {

	@Test
	public void testIdentificacion() {
		Avion avion1 = new Avion("AeroPeru", "737-800", "OB-1414");
		System.out.println(avion1.enviarIdentificacion());
		Assert.assertTrue(avion1.enviarIdentificacion().equalsIgnoreCase(
				"737-800AeroPeruOB-1414"));
	}
}
