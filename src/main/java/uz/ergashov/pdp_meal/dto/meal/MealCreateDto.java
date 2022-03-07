package uz.ergashov.pdp_meal.dto.meal;

import lombok.*;
import uz.ergashov.pdp_meal.dto.Dto;

/**
 * Created by Elyor Ergashov
 *
 * @author : mreed
 * @date : 3/7/2022
 * @project : mealDeliver
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MealCreateDto implements Dto {

    private String name;
    private String date;

}
