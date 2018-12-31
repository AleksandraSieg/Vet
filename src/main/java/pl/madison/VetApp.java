package pl.madison;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class VetApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Vet!" );
        SpringApplication.run(VetApp.class, args);
    }
}
