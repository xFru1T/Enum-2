enum Season {
    WINTER("-10.1"),
    SPRING("+4.3"),
    SUMMER("+17.9"),
    AUTUMN("+3,7");
    private String temp;
    Season(String temp) {
        this.temp = temp;
    }
    public String getTemp() {
        return temp;
    }
    public static String getAllTemp() {
        StringBuilder allTemp = new StringBuilder();
        for (Season season : Season.values()) {
            allTemp.append(season.name()).append(": ").append(season.getTemp()).append("\n");
        }
        return allTemp.toString().trim();
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("avg Temperature: " + '\n' + Season.getAllTemp());
    }
}



