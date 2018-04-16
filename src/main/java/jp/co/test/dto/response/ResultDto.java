package jp.co.test.dto.response;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ResultDto {

    @JsonProperty("Result")
    private boolean Result;
    @JsonProperty("DeviceId")
    private Long DeviceId;
    @JsonProperty("ErrorCode")
    private Long ErrorCode;
    @JsonProperty("Reason")
    private String Reason;
}
