package com.adamfgcross.randomwords.userinterface;

import picocli.CommandLine;

@CommandLine.Command(name="", mixinStandardHelpOptions = true, version = "1.0")
public class ConsoleCommandImpl implements ConsoleCommand {
	private Controller controller;
	
	public ConsoleCommandImpl (Controller controller) {
		this.controller = controller;
	}
	
	@CommandLine.Option(names = {"-n","--numWords"}, description = "specify a number of randomly-chosen words as a positive integer")
	private Integer numWords;
	
	@Override
	public void run() {
		Options options = new Options();
		options.setNumWords(numWords);
		controller.run(options);
	}
}
