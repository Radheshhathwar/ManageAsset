package com.tarento.assetManagement.utils;

import java.util.List;

public class Constants {

    private static List<String> type = List.of("LAPTOP", "MOBILE", "CHARGER", "DESKTOP", "CPU");
    private static List<String> status = List.of("GOOD","DAMAGED","LOST");


    public static int UNAUTHORIZED_ID = 401;
    public static int SUCCESS_ID = 200;
    public static int FAILURE_ID = 320;
    public static String UNAUTHORIZED = "Invalid id. Please try again.";
    public static String PROCESS_FAIL = "Process failed, Please try again.";
    public static String SUCCESS= "success";
}
