public class TimeConvert {
    public static void main(String[] args) {
        int seconds = 3661;
        int hours = seconds / 3600; // 1小时
        int minutes = (seconds % 3600) / 60;  // 分钟
        int seounds = (seconds % 3600) % 60;
    }
}
