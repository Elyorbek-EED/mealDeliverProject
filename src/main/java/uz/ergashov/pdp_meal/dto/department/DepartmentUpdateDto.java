package uz.ergashov.pdp_meal.dto.department;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.ergashov.pdp_meal.dto.GenericDto;

/**
 * Created by Elyor Ergashov
 *
 * @author : mreed
 * @date : 3/4/2022
 * @project : mealDeliver
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DepartmentUpdateDto extends GenericDto {
    private String name;
    private Long headerChatId;
}
