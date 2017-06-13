package pk1.template;


/**
 * Created by MILA on 3/6/2017.
 */
public final class DefaultConfigImpl implements IConfig {
    private String templateDirPath = "template";
    private String subjectFilePath = "";
    private char delimiterStartChar = '$';
    private char delimiterStopChar = '$';

    @Override
    public String getTemplateDirPath() {
        return templateDirPath;
    }

    public DefaultConfigImpl setTemplateDirPath(String templateDirPath) {
        this.templateDirPath = templateDirPath;
        return this;
    }

    @Override
    public String getSubjectFilePath() {
        return subjectFilePath;
    }

    public DefaultConfigImpl setSubjectFilePath(String subjectFilePath) {
        this.subjectFilePath = subjectFilePath;
        return this;
    }

    @Override
    public char getDelimiterStartChar() {
        return delimiterStartChar;
    }

    public DefaultConfigImpl setDelimiterStartChar(char delimiterStartChar) {
        this.delimiterStartChar = delimiterStartChar;
        return this;
    }

    @Override
    public char getDelimiterStopChar() {
        return delimiterStopChar;
    }

    public DefaultConfigImpl setDelimiterStopChar(char delimiterStopChar) {
        this.delimiterStopChar = delimiterStopChar;
        return this;
    }
}
