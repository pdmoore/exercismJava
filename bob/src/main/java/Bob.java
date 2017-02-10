/**
 * Created by pdm on 2/9/17.
 */
public class Bob {
    public String hey(String whatBobHears) {
        if (isShouting(whatBobHears)) return "Whoa, chill out!";

        if (isAQuestion(whatBobHears)) return "Sure.";

        return "Whatever.";
    }

    private boolean isAQuestion(String whatBobHears) {
        return whatBobHears.contains("?");
    }

    private boolean isShouting(String whatBobHears) {
        return whatBobHears.toUpperCase().equals(whatBobHears);
    }
}
