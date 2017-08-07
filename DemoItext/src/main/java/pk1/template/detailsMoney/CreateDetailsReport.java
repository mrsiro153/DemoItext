package pk1.template.detailsMoney;

import dto.Money;
import dto.UserDTO;
import pk1.template.BaseTemplate;
import pk1.template.ITemplate;

import java.util.ArrayDeque;
import java.util.List;

/**
 * Created by DoanNH on 8/7/2017.
 */
public class CreateDetailsReport  extends BaseTemplate implements ITemplate{
    private UserDTO userDTO;
    private List<Money> moneys;

    public CreateDetailsReport() {
    }

    public CreateDetailsReport(UserDTO userDTO, List<Money> moneys) {
        this.userDTO = userDTO;
        this.moneys = moneys;
    }

    @Override
    protected String getInstanceName() {
        return "detailReport";
    }
    //

    @Override
    public String render() {
        add("user",userDTO);
        add("listMoney",moneys);
        return super.render();
    }
}
