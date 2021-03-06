import java.util.regex.Pattern;

/**
 * Created by pdm on 2/9/17.
 */
public class Bob {
    public String hey(String whatBobHears) {
        if (isSilence(whatBobHears)) return "Fine. Be that way!";

        if (isShouting(whatBobHears)) return "Whoa, chill out!";

        if (isAQuestion(whatBobHears)) return "Sure.";

        return "Whatever.";
    }

    private boolean isSilence(String whatBobHears) {
        return whatBobHears.trim().isEmpty();
    }

    private boolean isAQuestion(String whatBobHears) {
        return whatBobHears.endsWith("?");
    }

    private boolean isShouting(String whatBobHears) {
        return isAStatement(whatBobHears) && whatBobHears.toUpperCase().equals(whatBobHears);
    }

    private boolean isAStatement(String whatBobHears) {
        return whatBobHears.matches(".*[A-Z].*");
    }
}
