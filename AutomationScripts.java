package java8features;

import java.util.ArrayList;
import java.util.List;

public class AutomationScripts {
    public static void main(String[] args) {

    }
    public AutomationScripts() throws InterruptedException {
        githubAndSelenium();
    }

    public Result githubAndSelenium() throws InterruptedException {
        List<String> contributorarr = getValue("Ddd");
        List<String> languagearr = new ArrayList<>();
        List<String> commitsarr = new ArrayList<>();

        return new Result(contributorarr, languagearr, commitsarr);

    }
    public List<String> getValue(String xpath){
        List<String> list=new ArrayList<String>();

        return list;
    }
}
