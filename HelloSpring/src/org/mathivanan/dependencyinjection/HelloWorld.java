package org.mathivanan.dependencyinjection;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

@Getter
@Setter
@NoArgsConstructor
public class HelloWorld {
	   
	   private HelloIndia helloIndia;
	   
	   public HelloWorld(HelloIndia helloIndia) {
	   		this.helloIndia=helloIndia;
	   }
	   
	   public void callIndia() {
		   helloIndia.callingIndia();
	   }
	   

	}
