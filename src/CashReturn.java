/**
 * @Classname CashReturn
 * @Description TODO
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/18 13:32
 */
public class CashReturn implements CashSuper {
    private double	moneyCondition	= 0;
    private double	moneyReturn		= 0;

    public CashReturn(double moneyCondition, double moneyReturn)
    {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money)
    {
        double result = money;
        if (money >= moneyCondition)
        {
            result = money - money / moneyCondition * moneyReturn;
        }
        return result;
    }
}
