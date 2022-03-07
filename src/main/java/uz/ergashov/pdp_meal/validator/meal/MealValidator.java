package uz.ergashov.pdp_meal.validator.meal;

import org.springframework.stereotype.Component;
import uz.ergashov.pdp_meal.dto.meal.MealCreateDto;
import uz.ergashov.pdp_meal.dto.meal.MealUpdateDto;
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
public class MealValidator extends AbstractValidator<MealCreateDto, MealUpdateDto, Long> {

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(MealCreateDto mealCreateDto) throws ValidationException {
        validDate(mealCreateDto.getDate());

        if (Objects.isNull(mealCreateDto.getName()) || "".equals(mealCreateDto.getName())) {
            throw new ValidationException("Name should not be blank");
        }
    }

    @Override
    public void validOnUpdate(MealUpdateDto mealUpdateDto) throws ValidationException {
        validDate(mealUpdateDto.getDate());

        if (Objects.isNull(mealUpdateDto.getName()) || "".equals(mealUpdateDto.getName())) {
            throw new ValidationException("Name should not be blank");
        }
    }
}
