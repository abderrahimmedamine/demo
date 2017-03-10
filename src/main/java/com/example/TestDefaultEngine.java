package com.example;

import org.apache.commons.configuration.ConfigurationException;

import org.apache.commons.configuration.HierarchicalConfiguration;

import org.apache.commons.configuration.XMLConfiguration;

import org.apache.commons.configuration.tree.DefaultExpressionEngine;

public class TestDefaultEngine {

	public static void main(final String[] args) {

		final DefaultExpressionEngine engine = new DefaultExpressionEngine();

		engine.setPropertyDelimiter("/");

		engine.setIndexStart("{");

		engine.setIndexEnd("}");

		engine.setAttributeStart("@");

		engine.setAttributeEnd(null);

		HierarchicalConfiguration.setDefaultExpressionEngine(engine);

		final XMLConfiguration config = new XMLConfiguration();

		try {

			config.load("maConfig.xml");

			System.out.println(config.getString("environnements/environnement{/champs/champ"));

			System.out.println(config.getString("environnements/environnement{@name"));

		} catch (final ConfigurationException e) {

			e.printStackTrace();

		}

	}

}