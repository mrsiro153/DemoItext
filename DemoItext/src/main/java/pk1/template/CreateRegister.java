package pk1.template;

import dto.UserDTO;

/**
 * Created by huydoan on 31/07/2017.
 */
public class CreateRegister extends BaseTemplate implements ITemplate{

    UserDTO user;

    public CreateRegister(UserDTO user) {
        this.user = user;
        initialize();
    }

    @Override
    protected String getInstanceName() {
        return "register";
    }
    //

    @Override
    public String render() {
        add("user",user);
        return super.render();
    }
}
