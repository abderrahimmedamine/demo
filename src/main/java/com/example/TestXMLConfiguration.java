package com.example;

import org.apache.commons.configuration.ConfigurationException;

import org.apache.commons.configuration.XMLConfiguration;

import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;

public class TestXMLConfiguration {

	public static void main(final String[] args) {

		try {

			final XMLConfiguration config = new XMLConfiguration("maConfig.xml");

			final FileChangedReloadingStrategy strategy = new FileChangedReloadingStrategy();

			strategy.setRefreshDelay(5000);

			config.setReloadingStrategy(strategy);

			System.out.println(config.getFile());

			System.out.println("ma.valeur=" + config.getLong("ma..valeur"));
			config.setProperty("ma..valeur", 300);
			System.out.println("ma.valeur after=" + config.getLong("ma..valeur"));

		} catch (final ConfigurationException e) {

			e.printStackTrace();

		}

	}

}