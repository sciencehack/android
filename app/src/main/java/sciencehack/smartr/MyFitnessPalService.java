package sciencehack.smartr;

import com.gistlabs.mechanize.document.html.HtmlDocument;
import com.gistlabs.mechanize.document.html.form.Form;
import com.gistlabs.mechanize.document.json.JsonDocument;
import com.gistlabs.mechanize.impl.MechanizeAgent;
import com.google.gson.Gson;

import java.text.Normalizer;

/**
 * Created by gigi on 2015/11/15.
 */
public class MyFitnessPalService {

    private MechanizeAgent agent;

    public void login(String username, String password) {
        agent = new MechanizeAgent();
        HtmlDocument page = agent.get("https://www.myfitnesspal.com/account/login");
        Form form = page.forms().get(0);
        form.get("username").set(username);
        form.get("password").set(password);
        form.submit();
    }

    public DataDto getSugar(int days) {

        JsonDocument sugarReport = agent.get("http://www.myfitnesspal.com/reports/results/nutrition/Sugar/" + days + ".json");
        return new Gson().fromJson(sugarReport.asString(), DataDto.class);
    }

    public DataDto getCalories(int days) {
        JsonDocument caloriesReport = agent.get("http://www.myfitnesspal.com/reports/results/nutrition/Calories/" + days + ".json");
        return new Gson().fromJson(caloriesReport.asString(), DataDto.class);
    }

    public DataDto getKilojoulesBurned(int days) {
        JsonDocument kilojoulesReport = agent.get("http://www.myfitnesspal.com/reports/results/fitness/Kilojoules%20Burned/" + days + ".json");
        return new Gson().fromJson(kilojoulesReport.asString(), DataDto.class);
    }
}
