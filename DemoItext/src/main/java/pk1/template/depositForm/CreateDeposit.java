package pk1.template.depositForm;

import dto.UserDTO;
import pk1.template.BaseTemplate;
import pk1.template.ITemplate;

/**
 * Created by DoanNH on 8/7/2017.
 */
public class CreateDeposit extends BaseTemplate implements ITemplate{
    UserDTO userSrc;
    UserDTO userDes;

    public CreateDeposit() {
    }
    public CreateDeposit(UserDTO userSrc,UserDTO userDes){
        this.userSrc = userSrc;
        this.userDes = userDes;
    }

    @Override
    protected String getInstanceName() {
        return "depositForm";
    }
    //

    @Override
    public String render() {
        add("userSrc",userSrc);
        add("userDes",userDes);
        return super.render();
    }
}
