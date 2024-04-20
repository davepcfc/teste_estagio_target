package Perguntas.Inverter;

public class InverterString {
    public String inverterString(String string) {
        StringBuilder reverterString = new StringBuilder();
        for(int i = string.length() - 1; i >= 0; i--) {
            reverterString.append(string.charAt(i));
        }
        return reverterString.toString();
    }
}
