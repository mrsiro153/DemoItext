package pk1.template.updateInfo;

import dto.UserDTO;
import pk1.template.BaseTemplate;
import pk1.template.ITemplate;

/**
 * Created by huydoan on 06/08/2017.
 */
public class CreateUpdateUserInfo extends BaseTemplate implements ITemplate{
    UserDTO user;

    public CreateUpdateUserInfo(UserDTO user) {
        this.user = user;
        initialize();
    }

    @Override
    protected String getInstanceName() {
        return "changeProfile";
    }
    //
    @Override
    public String render() {
        add("user",user);
        return super.render();
    }
}
