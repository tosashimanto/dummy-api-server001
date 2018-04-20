package jp.co.test.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class SetUploadVideoTimeDto {

    @JsonProperty("BeginTime")
    private LocalDateTime BeginTime;
    @JsonProperty("EndTime")
    private LocalDateTime EndTime;
    @JsonProperty("DeviceId")
    private Long DeviceId;
}
