package java8features;

import java.util.List;

public class Result {
    public List<String> contributorarr;
    public List<String> languagearr;
    public List<String> commitsarr;

    Result(List<String> contributorarr, List<String> languagearr, List<String> commitsarr) {
        this.contributorarr = contributorarr;
        this.languagearr = languagearr;
        this.commitsarr = commitsarr;
    }
}
