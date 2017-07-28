package pk1.template;

import dto.TestDTO;

/**
 * Created by DoanNH on 5/29/2017.
 */
public class CreateQuickRegisterEmail extends BaseTemplate implements ITemplate {
    private String token;
    private String email;
    private TestDTO obj;

    public CreateQuickRegisterEmail(String token,String email,TestDTO obj) {
        this.token=token;
        this.email=email;
        this.obj=obj;
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
        add("obj",obj);
        return super.render();
    }
}
