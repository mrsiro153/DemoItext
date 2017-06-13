package pk1.template;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;

/**
 * Created by MILA on 3/6/2017.
 */
public abstract class BaseTemplate implements ITemplate {
    private STGroup folder;
    private ST file;
    private IConfig config = new DefaultConfigImpl();

    protected BaseTemplate(){
         initialize();
    }

    /**
     * initialize core template function
     */
    protected void initialize() {
        // some case we have language is vi.
        // this code will check VI then return VN folder.
        folder = new STGroupDir(config.getTemplateDirPath(),config.getDelimiterStartChar(),config.getDelimiterStopChar());
        file = folder.getInstanceOf(getInstanceName());
    }

    /**
     * determine the template file name
     * @return
     */
    protected abstract String getInstanceName();

    /**
     * add value by key that used in template
     * @param name
     * @param object
     * @return
     */
    protected BaseTemplate add(String name, Object object){
        file.add(name, object);
        return this;
    }

    public IConfig getConfig() {
        return config;
    }

    public BaseTemplate setConfig(IConfig config) {
        if(config == null) throw new IllegalStateException("Config cannot be null.");
        this.config = config;
        return this;
    }

    @Override
    public String render() {
        return file.render();
    }

    @Override
    public String toString() {
        return render();
    }

}
