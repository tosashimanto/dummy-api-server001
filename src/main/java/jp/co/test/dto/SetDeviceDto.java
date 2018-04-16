package jp.co.test.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.test.dto.response.DeviceDtoRes;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class SetDeviceDto {

    @JsonProperty("System")
    private DeviceDtoRes.System System = new DeviceDtoRes.System();

    @Getter
    @Setter
    @ToString
    @JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
    public static class System {

        @JsonProperty("Sensor")
        private DeviceDtoRes.System.Sensor Sensor = new DeviceDtoRes.System.Sensor();

        /** センサー情報 */
        @Getter
        @Setter
        @ToString
        @JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
        public static class Sensor {

            @JsonProperty("Threshold")
            private DeviceDtoRes.System.Sensor.Threshold Threshold = new DeviceDtoRes.System.Sensor.Threshold();

            /** 閾値 */
            @Getter
            @Setter
            @ToString
            @JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
            public static class Threshold {
                @JsonProperty("UserName")
                private String UserName;
                /** 急加速閾値 */
                @JsonProperty("Acceleration")
                private long Acceleration;
                private long AccPeriod;
                /** 急減速閾値 */
                @JsonProperty("Deceleration")
                private long Deceleration;
                private long DecPeriod;
                /** 急旋回閾値 */
                @JsonProperty("Turning")
                private long Turning;
                private long TurnPeriod;
                /** 衝撃閾値 */
                @JsonProperty("Impact")
                private long Impact;

            }
        }
    }
}
