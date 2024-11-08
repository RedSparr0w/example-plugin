package com.example;

import net.zulrah.ZulrahPlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ExamplePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ZulrahPlugin.class);
		RuneLite.main(args);
	}
}