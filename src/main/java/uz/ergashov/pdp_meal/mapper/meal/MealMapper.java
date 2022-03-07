package uz.ergashov.pdp_meal.mapper.meal;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;
import uz.ergashov.pdp_meal.dto.meal.MealCreateDto;
import uz.ergashov.pdp_meal.dto.meal.MealDto;
import uz.ergashov.pdp_meal.dto.meal.MealUpdateDto;
import uz.ergashov.pdp_meal.entity.meal.Meal;
import uz.ergashov.pdp_meal.mapper.BaseMapper;

import java.util.List;

/**
 * Created by Elyor Ergashov
 *
 * @author : mreed
 * @date : 3/7/2022
 * @project : mealDeliver
 */
@Component
@Mapper(componentModel = "spring")
public interface MealMapper extends BaseMapper<
        Meal,
        MealDto,
        MealCreateDto,
        MealUpdateDto> {

    @Override
    MealDto toDto(Meal meal);

    @Override
    List<MealDto> toDto(List<Meal> e);

    @Override
    Meal fromCreateDto(MealCreateDto mealCreateDto);

    @Override
    Meal fromUpdateDto(MealUpdateDto mealUpdateDto);

    Meal fromUpdateDto(MealUpdateDto dto, @MappingTarget Meal meal);

}
