package core.basesyntax;

import core.basesyntax.straregy.DiscountService;
import core.basesyntax.straregy.impl.BirthdayDiscountService;
import core.basesyntax.straregy.impl.BlackFridayDiscountService;
import core.basesyntax.straregy.impl.DefaultDiscountService;
import core.basesyntax.straregy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "Birthday":
                return new BirthdayDiscountService();
            case "Black Friday":
                return new BlackFridayDiscountService();
            case "New Year":
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}