package jp.co.test.dto.response;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class LoginDtoRes {

    @JsonProperty("UserName")
    private String UserName;
    @JsonProperty("Result")
    private boolean Result;
    @JsonProperty("Reason")
    private String Reason;
    @JsonProperty("UserType")
    private Long UserType;
    @JsonProperty("SessionId")
    private long SessionId;
}
