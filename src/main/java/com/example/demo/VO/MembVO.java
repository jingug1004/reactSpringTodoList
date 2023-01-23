package com.example.demo.VO;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MembVO {
    private Long mid; // ID
//    private String email; // 디바이스 유형
//    private String nickname; // 코드
//    private String pw; // 이름

    private long alarmCodeNAlarmsCount;
    private List<AlarmCodeNAlarmsInDTO> alarmCodeNAlarmsList;

    @Getter
    @Setter
    @ToString
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AlarmCodeNAlarmsInDTO {
        //        private Long mid; // ID
//        private String email; // 디바이스 유형
        private String nickname; // 코드
//        private String pw; // 이름
//        private String temp; // 임시
    }


}