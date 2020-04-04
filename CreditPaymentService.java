public class CreditPaymentService {
    public  double calculateAn (double creditSum, double tax, int month)
        {
            //https://ru.wikipedia.org/wiki/%D0%90%D0%BD%D0%BD%D1%83%D0%B8%D1%82%D0%B5%D1%82
            //double i = tax/(month*100);

           // double koef = i *Math.pow(1+ i, month)/(Math.pow(1+ i, month)-1);

            //double sumPerMonth = creditSum * koef;



            double Pgodovaya = tax+100;
            double T = month/12;

            double Pgod = Pgodovaya/100;

            //double i = tax/(month*100);

            //double koef = i *Math.pow(1+ i, month)/(Math.pow(1+ i, month)-1);

            double sumPerMonth = creditSum * Pgod/(1 - Math.pow(1+Pgod, -T));

            return  sumPerMonth;

        }

        public  double calculateDef (double creditSum, double tax, int month)
        {

        /*
        х= s/n+s*P*d/G/100
        Расшифровка значений формулы:
        х – ежемесячный дифференцированный платеж;
        s– размер тела кредита на дату расчета процентной части по очередному платежу;
        P – размер годовой процентной ставки;
        d – количество дней в расчетном периоде;
        G – количество дней в текущем году;
        N – число оставшихся процентных периодов (месяцев).
         */

            double payment = (creditSum/month) + creditSum*tax/(month* 100);

            return payment;
        }
    }


