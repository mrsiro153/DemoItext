package pk1.template;

/**
 * Created by DoanNH on 5/29/2017.
 */
public class CreateQuickRegisterEmail extends BaseTemplate implements ITemplate {
    private String token;
    private String email;

    public CreateQuickRegisterEmail(String token,String email) {
        this.token=token;
        this.email=email;
        initialize();
    }

    @Override
    protected String getInstanceName() {
        return "quick_register_mail";
    }

    @Override
    public String render(){
        add("token",token);
        add("name",email);
        return super.render();
    }
}
