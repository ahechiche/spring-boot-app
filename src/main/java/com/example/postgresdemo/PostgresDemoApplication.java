package com.example.postgresdemo;

/**
 * https://piotrminkowski.com/2019/10/01/deploying-spring-boot-application-on-openshift-with-dekorate/
 
 *  mvn clean install -Ddekorate.build=true -Ddekorate.deploy=true
 *
 */

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.dekorate.kubernetes.annotation.Env;
import io.dekorate.openshift.annotation.OpenshiftApplication;
import io.dekorate.option.annotation.JvmOptions;

@SpringBootApplication
//@OpenshiftApplication(replicas = 1, expose = true, envVars = {
//        @Env(name="sample-app-config", configmap = "sample-app-config")
//})
@JvmOptions(xms = 128, xmx = 256, heapDumpOnOutOfMemoryError = true)
public class PostgresDemoApplication implements CommandLineRunner{
	
		
	public static void main(String[] args) {
		SpringApplication.run(PostgresDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
							
	}
}
