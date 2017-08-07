package pk1.template.withdrawForm;

import dto.UserDTO;
import pk1.template.BaseTemplate;
import pk1.template.ITemplate;

/**
 * Created by DoanNH on 8/7/2017.
 */
public class CreateWithdrawForm  extends BaseTemplate implements ITemplate{
    private UserDTO userDTO;

    public CreateWithdrawForm(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
    public CreateWithdrawForm(){

    }

    @Override
    protected String getInstanceName() {
        return "withdrawForm";
    }

    @Override
    public String render() {
        add("userSrc",userDTO);
        return super.render();
    }
}
