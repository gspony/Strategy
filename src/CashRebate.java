/**
 * @Classname CashRebate
 * @Description TODO打折收费子类
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/18 13:29
 */
public class CashRebate implements CashSuper {
    private double	moneyRebate	= 1;

    public CashRebate(double moneyRebate)
    {
        this.moneyRebate = moneyRebate;
    }

    public double acceptCash(double money)
    {
        return money * moneyRebate;
    }
}
