package dto;

import java.util.*;

/**
 * Created by DoanNH on 8/7/2017.
 */
public class MoneyBag {
    private Double totalMoney;
    private List<Money> moneyList;
    private HashMap hashMapMoney;

    public MoneyBag(Double totalMoney, List<Money> moneyList) {
        this.totalMoney = totalMoney;
        this.moneyList = moneyList;
    }
    public MoneyBag(){
    }

    public MoneyBag(List<Money> moneyList) {
        this.moneyList = moneyList;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public MoneyBag setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
        return this;
    }

    public List<Money> getMoneyList() {
        return moneyList;
    }

    public MoneyBag setMoneyList(List<Money> moneyList) {
        this.moneyList = moneyList;
        return this;
    }
    //
    public void getTotalMoneyOfBag(){
        hashMapMoney = new HashMap();
        Double totalTemp = Double.valueOf(0);
        if(moneyList!=null && !moneyList.isEmpty()){
            for(Money m : moneyList){
                totalTemp+= m.getValue();
                checkHasmap(hashMapMoney,m);
            }
        }
        this.totalMoney = totalTemp;
    }
    public void checkHasmap(HashMap hm,Money mn ){
        if(hm.get(mn.getType())==null){
            //loai tien nay chua ton tai trong tui tien
            hashMapMoney.put(mn.getType(),0);
        }else {
            //loai tien nay da ton tai trong tui tien
            Double temp = (Double) hashMapMoney.get(mn.getType());
            hashMapMoney.put(mn.getType(),temp+1);
        }
    }
    //
    public List<Money> createDefaultListMoney(){
        List<Money> lst= new ArrayList<>();
        Money m1 = new Money("500,000", 500000d);
        Money m2 = new Money("200,000",500000d);
        Money m3 = new Money("100,000",100000d);
        Money m4 = new Money("50,000",50000d);
        lst.add(m1);
        lst.add(m2);
        lst.add(m3);
        lst.add(m4);
        this.moneyList = lst;
        return lst;

    }
}
