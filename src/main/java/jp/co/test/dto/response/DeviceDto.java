package jp.co.test.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeviceDto {

    private String message;
    private String deviceId;
    private String info;
    private ThresholdInfo thresholdInfo;

    @Getter
    @Setter
    static public class ThresholdInfo {
        private String test0Threshold;
        private String test1Threshold;
        private String test2Threshold;
    }
}
