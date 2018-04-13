package jp.co.test.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDto {

    private String userName;
    private String password;
    private String version;
    private int    aAuthType;

}