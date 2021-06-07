package br.com.springvaultexample;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("example")
public class Credential {

    private String userName;

    private String password;
}
