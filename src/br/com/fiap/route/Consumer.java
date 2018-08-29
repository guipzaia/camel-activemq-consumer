package br.com.fiap.route;

import java.io.File;

import org.apache.camel.builder.RouteBuilder;

public class Consumer extends RouteBuilder {
	
	private String path = "file:" + new File(".").getAbsolutePath() + "/outputFolder";
	private String queue = "jms:queue:camel-activemq";

	@Override
	public void configure() throws Exception {
		from(queue).to(path);
	}
}
