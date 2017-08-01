package pk1.template;

import dto.UserDTO;

import java.util.List;

/**
 * Created by huydoan on 31/07/2017.
 */
public class CreateRegister extends BaseTemplate implements ITemplate{

    UserDTO user;
    List<UserDTO> userDTOS;

    public CreateRegister(UserDTO user,List<UserDTO> userDTOS) {
        this.user = user;
        this.userDTOS= userDTOS;
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
        add("userDTOS",userDTOS);
        return super.render();
    }
}
