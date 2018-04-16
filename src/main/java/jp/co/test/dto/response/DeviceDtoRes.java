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
public class DeviceDtoRes {

    @JsonProperty("System")
    private System System = new System();

    @Getter
    @Setter
    @ToString
    @JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
    public static class System {

        @JsonProperty("Sensor")
        private Sensor Sensor = new Sensor();

        /** センサー情報 */
        @Getter
        @Setter
        @ToString
        @JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
        public static class Sensor {

            @JsonProperty("Threshold")
            private Threshold Threshold = new Threshold();

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
