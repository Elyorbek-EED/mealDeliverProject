package uz.ergashov.pdp_meal.validator.order;

import org.springframework.stereotype.Component;
import uz.ergashov.pdp_meal.dto.order.OrderCreateDto;
import uz.ergashov.pdp_meal.dto.order.OrderUpdateDto;
import uz.ergashov.pdp_meal.exception.ValidationException;
import uz.ergashov.pdp_meal.validator.AbstractValidator;

import java.util.Objects;
/**
 * Created by Elyor Ergashov
 *
 * @author : mreed
 * @date : 3/7/2022
 * @project : mealDeliver
 */
@Component
public class OrderValidator extends AbstractValidator<OrderCreateDto, OrderUpdateDto, Long> {

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(OrderCreateDto orderCreateDto) throws ValidationException {
        validDate(orderCreateDto.getDate());

        if (Objects.isNull(orderCreateDto.getUserId())) {
            throw new ValidationException("User should not be blank");
        }

        if (Objects.isNull(orderCreateDto.getMealId())) {
            throw new ValidationException("Meal should not be blank");
        }
    }

    @Override
    public void validOnUpdate(OrderUpdateDto orderUpdateDto) throws ValidationException {
        validDate(orderUpdateDto.getDate());

        if (Objects.isNull(orderUpdateDto.getUserId())) {
            throw new ValidationException("User should not be blank");
        }

        if (Objects.isNull(orderUpdateDto.getMealId())) {
            throw new ValidationException("Meal should not be blank");
        }
    }
}
