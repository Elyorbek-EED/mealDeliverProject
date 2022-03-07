package uz.ergashov.pdp_meal.dto.meal;

import lombok.Getter;
import lombok.Setter;
import uz.ergashov.pdp_meal.dto.GenericDto;

/**
 * Created by Elyor Ergashov
 *
 * @author : mreed
 * @date : 3/7/2022
 * @project : mealDeliver
 */

@Getter
@Setter
public class MealUpdateDto extends GenericDto {

    private String name;
    private String date;

    public MealUpdateDto(Long id, String name, String date) {
        super(id);
        this.name = name;
        this.date = date;
    }
}
