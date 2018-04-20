package jp.co.test.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class OnDemandVideoDto {

    @JsonProperty("EventId")
    private String EventId;
    @JsonProperty("VideoId")
    private String VideoId;
    @JsonProperty("UserName")
    private String UserName;
    @JsonProperty("DeviceId")
    private Long DeviceId;
    @JsonProperty("DriverId")
    private String DriverId;
    @JsonProperty("Time")
    private Date Time;
    @JsonProperty("Type")
    private Long Type;
}
