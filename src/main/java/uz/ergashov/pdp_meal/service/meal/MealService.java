package uz.ergashov.pdp_meal.service.meal;

import uz.ergashov.pdp_meal.criteria.GenericCriteria;
import uz.ergashov.pdp_meal.dto.meal.MealCreateDto;
import uz.ergashov.pdp_meal.dto.meal.MealDto;
import uz.ergashov.pdp_meal.dto.meal.MealUpdateDto;
import uz.ergashov.pdp_meal.entity.meal.Meal;
import uz.ergashov.pdp_meal.service.GenericCrudService;

/**
 * Created by Elyor Ergashov
 *
 * @author : mreed
 * @date : 3/7/2022
 * @project : mealDeliver
 */
public interface MealService extends GenericCrudService<
        Meal,
        MealDto,
        MealCreateDto,
        MealUpdateDto,
        GenericCriteria,
        Long> {
}
